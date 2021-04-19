/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import entities.Livre;
import java.util.ArrayList;

/**
 *
 * @author Damien
 */

/*
Nous souhaitons créer une application mimant une bibliothèque, et les services 
associés donc :
 */
public class Bibliotheque {

    /**
     * Notre bibliothèque contient des livres, on va donc avoir besoin d'un
     * attribut où les ranger.
     */
    private ArrayList<Livre> listeLivres = new ArrayList<Livre>();

    /**
     * Méthode pour enregistre un livre dans la liste en attribut.
     *
     * @param livre le livre à ajouter
     */
    public void enregistrerLivre(Livre livre) {
        this.listeLivres.add(livre);
    }

    /**
     *
     * @param titre_l
     * @param isbn_l
     * @param nombre_pages_l
     * @param edition_l
     * @param annee_edition_l
     * @param format_l
     * @param nom_a
     * @param id_exemplaire
     * @param id_categorie
     * @return
     */
    public Livre creationLivre(String titre_l, String isbn_l, String nombre_pages_l, String edition_l, String annee_edition_l, String format_l, String nom_a, String id_exemplaire, String id_categorie) {
        Livre livre = new Livre(titre_l, isbn_l, nombre_pages_l, edition_l, annee_edition_l, format_l, nom_a, id_exemplaire, id_categorie);
        return livre;
    }

    public void setListeLivres(ArrayList<Livre> listeLivres) {
        this.listeLivres = listeLivres;
    }

    public ArrayList<Livre> getListeLivres() {
        return listeLivres;
    }
}
