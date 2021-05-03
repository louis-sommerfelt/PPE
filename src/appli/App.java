/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import IHM.JFrameAjout;
import entities.Bibliotheque;
import services.CBDD;
import services.CParametresStockageBDD;
import IHM.JFrameBibliotheque;
import entities.Livre;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.CTableLivres;

/**
 *
 * @author gimli
 */
public class App {

    public Bibliotheque biblio;
    public JFrameBibliotheque jFrameBiblio;
    public CTableLivres tableLivres;
    public JFrameAjout jFrameAjout;

    public void runBibliothequeIHM() {
    // j'initialise les objets 
        biblio = new Bibliotheque();
        jFrameBiblio = new JFrameBibliotheque();
        tableLivres = new CTableLivres(new CBDD(new CParametresStockageBDD("parametresBdd.properties")));
        jFrameBiblio.app = this;
        this.majBiblio(); //mise a jour de la biblio
        //this.afficherListejTableBiblio();

                           // tableau 
        this.jFrameBiblio.getjTableBibliotheque().setRowSelectionInterval(0, 0); // selectionne les 2 premieres lignes
        jFrameBiblio.setVisible(true);

    }

    public void majBiblio() { //mise a jour
        biblio.setListeLivres(tableLivres.lireLivres()); // ça va chercher les livres pour les mettre dans une liste
        this.afficherListejTableBiblio();
    }

    public void setRowCountjTableBiblio(int rowCount) {
        DefaultTableModel model = (DefaultTableModel) jFrameBiblio.getjTableBibliotheque().getModel();
        model.setRowCount(rowCount);
                 // ca efface                             //tu prends le modele                   et tu ecrases tout 
        jFrameBiblio.getjTableBibliotheque().setModel(model);
        this.jFrameBiblio.idLivres = new String[rowCount]; // prevoit le meme nombre id  tableau avec la bonne taille
    }
      

    public void afficherListejTableBiblio() {
        this.setRowCountjTableBiblio(this.biblio.getListeLivres().size());    // ca créé un nouveau tableau vide

        for (int i = 0; i < this.biblio.getListeLivres().size(); i++) {
            this.jFrameBiblio.idLivres[i] = this.biblio.getListeLivres().get(i).getId_l();
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getTitre_l(), i, 0); //ligne i comlonne 0
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getIsbn_l(), i, 1);  //ligne 0 colonne 1
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getNombre_pages_l(), i, 2);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getEdition_l(), i, 3);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getAnnee_edition_l(), i, 4);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getFormat_l(), i, 5);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getId_exemplaire(), i, 6);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getId_categorie(), i, 7);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getId_a(), i, 8);
}
    }

    public void afficherListejTableBiblio(ArrayList<Livre> list) {
        this.setRowCountjTableBiblio(list.size());

        for (int i = 0; i < list.size(); i++) {
            this.jFrameBiblio.idLivres[i] = this.biblio.getListeLivres().get(i).getId_l();
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getTitre_l(), i, 0); //ligne i colonne 0
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getIsbn_l(), i, 1);  //ligne 0 colonne 1
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getNombre_pages_l(), i, 2);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getEdition_l(), i, 3);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getAnnee_edition_l(), i, 4);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getFormat_l(), i, 5);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getId_exemplaire(), i, 6);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getId_categorie(), i, 7);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getId_a(), i, 8);
        }
    }
    
    public void ajouterLivreIHM() {
        //censé pouvoir récupérer les infos de la table et ensuite créer un ajout dans la table Livre.
       String titre_l = this.jFrameAjout.getjTableAjout().getValueAt(0, 0).toString();
       String isbn_l = this.jFrameAjout.getjTableAjout().getValueAt(0,1).toString();
       String nombrePages_l = this.jFrameAjout.getjTableAjout().getValueAt(0,2).toString();
       String edition_l = this.jFrameAjout.getjTableAjout().getValueAt(0,3).toString();
       String annee_edition_l = this.jFrameAjout.getjTableAjout().getValueAt(0,4).toString();
       String format_l = this.jFrameAjout.getjTableAjout().getValueAt(0,5).toString();
       String id_exemplaire = this.jFrameAjout.getjTableAjout().getValueAt(0,6).toString();
       String id_categorie = this.jFrameAjout.getjTableAjout().getValueAt(0,7).toString();
       String id_a = this.jFrameAjout.getjTableAjout().getValueAt(0,8).toString();
       Livre livre = this.biblio.creationLivre(titre_l, isbn_l, nombrePages_l, edition_l, annee_edition_l, format_l, id_exemplaire, id_categorie, id_a);
       this.tableLivres.insererLivre(livre);
       this.majBiblio();
       System.out.println("Point d'arrêt");
       
       
    }  
    

    public static void main(String[] args) {
        new App().runBibliothequeIHM();
     //   tableLivres.supprimerLivre("4");
      

    }

    public void jFrameBiblioButtonSupprimer() {
       JOptionPane.showMessageDialog(null, "Suppression en cours...");
       tableLivres.supprimerLivre("5");
       
    }
    

    public void jFrameBiblioButtonAjouter() {
        // JOptionPane.showMessageDialog(null, "Ajout en cours...");
         //jFrameAjout.setVisible(true);
       // tableLivres.insererLivre("toto", "22546","100", "hachette", "1856", "français", "de poche", "il sera un jour");
       //tableLivres.insererLivre(new Livre ("7", "les Chroniques de JP", "12847", "200", "Hachette", "1989", "français", "de poche", "il était"));
    }

    public void jFrameAjoutConfirmer() {
        //JOptionPane.showMessageDialog(null, "Ajout en cours...");
        //tableLivres.insererLivre(jFrameAjout);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void getjTableAjout(){
        
        
    }

    public void jButtonConfirmer() {
    JOptionPane.showMessageDialog(null, "Ajout en cours...");        
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
