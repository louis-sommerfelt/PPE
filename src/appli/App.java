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
        biblio.setListeLivres(tableLivres.lireLivres()); // ca va cherhcher les livres pour les mettre dans une liste
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
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getNom_a(), i, 6);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getId_exemplaire(), i, 7);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getId_categorie(), i, 8);
        }
    }

    public void afficherListejTableBiblio(ArrayList<Livre> list) {
        this.setRowCountjTableBiblio(list.size());

        for (int i = 0; i < list.size(); i++) {
            this.jFrameBiblio.idLivres[i] = this.biblio.getListeLivres().get(i).getId_l();
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getTitre_l(), i, 0); //ligne i comlonne 0
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getIsbn_l(), i, 1);  //ligne 0 colonne 1
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getNombre_pages_l(), i, 2);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getEdition_l(), i, 3);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getAnnee_edition_l(), i, 4);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getFormat_l(), i, 5);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getNom_a(), i, 6);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getId_exemplaire(), i, 7);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.getListeLivres().get(i).getId_categorie(), i, 8);
        }
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
        JOptionPane.showMessageDialog(null, "Ajout en cours...");
        //tableLivres.insererLivre(jFrameAjout);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void getjTableAjout(){
        
        
    }
    
}
