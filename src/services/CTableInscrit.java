/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Inscrit;
import entities.Livre;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SIO_10
 */
public class CTableInscrit {
    
    protected CBDD bdd;

    public CTableInscrit(CBDD bdd) {
        this.bdd = bdd;
    }

    public Inscrit convertir_RS_Inscrit(ResultSet rs) {
        try {
            String id_inscrit = rs.getString(1);
            String date_naissance_i = rs.getString(2);
            String nom_i = rs.getString(3);
            String prenom_i = rs.getString(4);
            String rue_i = rs.getString(5);
            String cp_i = rs.getString(6);
            String email_i = rs.getString(7);
            String tel_i = rs.getString(8);
            String mot_de_passe_i = rs.getString(9);          


            Inscrit inscrit = new Inscrit(id_inscrit, date_naissance_i, nom_i, prenom_i, rue_i, cp_i, email_i, tel_i, mot_de_passe_i);

            return inscrit;
        } catch (SQLException ex) {
            Logger.getLogger(CTableLivres.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public Inscrit lireInscrit(int id_inscrit) {
        Inscrit inscrit = null;
        if (bdd.connecter() == true) {
            System.out.println("Connexion OK");
            ResultSet rs = bdd.executerRequeteQuery("select * from inscrit  WHERE `inscrit`.`id_inscrit` = " + id_inscrit);
            try {
                if (rs.next()) {
                    inscrit = convertir_RS_Inscrit(rs);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CBDD.class.getName()).log(Level.SEVERE, null, ex);
            }
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return inscrit;
    }

    public ArrayList<Inscrit> lireInscrit() {

        if (bdd.connecter() == true) {
            ArrayList<Inscrit> listeInscrit = new ArrayList();
            ResultSet rs = bdd.executerRequeteQuery("select * from inscrit");
            try {
                while (rs.next()) {
                    Inscrit inscrit = convertir_RS_Inscrit(rs);
                    listeInscrit.add(inscrit);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CBDD.class.getName()).log(Level.SEVERE, null, ex);
            }
            bdd.deconnecter();
            return listeInscrit;
        } else {
            System.out.println("Connexion KO");
        }
        return null;
    }

    public int insererInscrit(Inscrit inscrit) {
        int res = -1;
        if (bdd.connecter() == true) {
            String req = "INSERT INTO `inscrit` (`date_naissance_i`, `nom_i`,"
                    + " `prenom_i`, `rue_i`, `cp_i`, `email_i`, `tel_i`, `mot_de_passe_i`) "
                    + "VALUES ('" + CBDD.pretraiterChaineSQL(inscrit.getDate_naissance_i())
                    + "', '" + CBDD.pretraiterChaineSQL(inscrit.getNom_i())
                    + "', '" + CBDD.pretraiterChaineSQL(inscrit.getPrenom_i())
                    + "', '" + CBDD.pretraiterChaineSQL(inscrit.getRue_i())
                    + "', '" + CBDD.pretraiterChaineSQL(inscrit.getCp_i())
                    + "', '" + CBDD.pretraiterChaineSQL(inscrit.getEmail_i())
                    + "', '" + CBDD.pretraiterChaineSQL(inscrit.getTel_i())
                    + "', '" + CBDD.pretraiterChaineSQL(inscrit.getMot_de_passe_i())
                    + "');";
            res = bdd.executerRequeteUpdate(req);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }

    public int supprimerinscrit(Inscrit inscrit) {
        int res = -1;
        if (bdd.connecter() == true) {
            String req = "DELETE FROM `inscrit` WHERE `id_inscrit` = " + inscrit.getId_inscrit();
            res = bdd.executerRequeteUpdate(req);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }

    public int supprimerInscrit(String id_inscrit) {
        int res = -1;
        if (bdd.connecter() == true) {
            String req = "DELETE FROM `inscrit` WHERE `id_inscrit` = " + id_inscrit;
            res = bdd.executerRequeteUpdate(req);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }


    public int modifierInscrit(Inscrit inscrit) {
        int res = -1;
        if (bdd.connecter() == true) {
            String req = "UPDATE `inscrit` SET "
                    + "`date_naissance_i` = '"
                    + CBDD.pretraiterChaineSQL(inscrit.getDate_naissance_i())
                    + "', "
                    + "`nom_i` = '"
                    + CBDD.pretraiterChaineSQL(inscrit.getNom_i())
                    + "', "
                    + "`prenom_i` = '"
                    + CBDD.pretraiterChaineSQL(inscrit.getPrenom_i())
                    + "', "
                    + "`rue_i` = '"
                    + CBDD.pretraiterChaineSQL(inscrit.getRue_i())
                    + "', "
                    + "`cp_i` = '"
                    + CBDD.pretraiterChaineSQL(inscrit.getCp_i())
                    + "', "
                    + "`email_i` = '"
                    + CBDD.pretraiterChaineSQL(inscrit.getEmail_i())
                    + "', "
                    + "`tel_i` = '"
                    + CBDD.pretraiterChaineSQL(inscrit.getTel_i())
                    + "', "
                    + "`mot_de_passe_i` = '"
                    + CBDD.pretraiterChaineSQL(inscrit.getMot_de_passe_i())
                    + "' WHERE `inscrit`.`id_inscrit` = "
                    + CBDD.pretraiterChaineSQL(inscrit.getId_inscrit())
                    + ";";
            res = bdd.executerRequeteUpdate(req);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }
    
    
    public static void main(String[] args) {
        CBDD bdd = new CBDD(new CParametresStockageBDD("parametresBdd.properties"));
        CTableInscrit table = new CTableInscrit(bdd);

        String id_inscrit = "2"; //A modifier pour donner l'id de l'inscrit à supprimer
        String date_naissance_i = "2018-07-24";
        String nom_i = "kante";
        String prenom_i = "n'golo";
        String rue_i = "Clairefontaine";
        String cp_i = "78164";
        String email_i = "n'golochampion@dumonde.fr";
        String tel_i = "0248640535";
        String mot_de_passe_i = "chelsea";



      
       Inscrit inscritTest = new Inscrit(id_inscrit, date_naissance_i, nom_i, prenom_i, rue_i, cp_i, email_i, tel_i, mot_de_passe_i);

        table.insererInscrit(inscritTest);

    }

}

