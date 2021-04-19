/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Damien
 */

/*
Cette classe nous servira à créer des objets de type "Livre", ils devront représenter
des livres physiques ou virtuels et donc posséder les attributs permettant de les définir.
 */
public class Livre {

    /*
    La liste des attributs. Ce sont des variables qui ont une "durée de vie" longue.
    Tant que l'objet créé à partir de cette classe existe, ses attributs existent aussi.
    Ils doivent "définir" l'objet. C'est à dire qu'ils sont importants pour comprendre et
    différencier les objets.
     */
    private String id_l = "-1";
    private String titre_l;
    private String isbn_l;
    private String nombre_pages_l;
    private String edition_l;
    private String annee_edition_l;
    private String format_l;
    private String id_exemplaire;
    private String id_categorie;
    private String id_a;


    /*
    Un contructeur, celui ci attend 9 paramètres de type chaine de caractères et on les
    utilise ensuite pour remplir les différents attributs.
    Pour bien suivre quel paramètre doit aller dans quel attribut on a choisi de
    nommer les paramètres comme les attributs. Attention donc à bien différencier
    les uns des autres grace à "this".
     */
    public Livre(String titre_l, String isbn_l, String nombre_pages_l, String edition_l, String annee_edition_l, String format_l, String id_exemplaire, String id_categorie, String id_a) {
        this.titre_l = titre_l;
        this.isbn_l = isbn_l;
        this.nombre_pages_l = nombre_pages_l;
        this.edition_l = edition_l;
        this.annee_edition_l = annee_edition_l;
        this.format_l = format_l;
        this.id_exemplaire = id_exemplaire;
        this.id_categorie = id_categorie;
        this.id_a = id_a;
}

    public Livre(String id, String titre_l, String isbn_l, String nombre_pages_l, String edition_l, String annee_edition_l, String format_l, String id_exemplaire, String id_categorie, String id_a) {
        this.id_l = id;
        this.titre_l = titre_l;
        this.isbn_l = isbn_l;
        this.nombre_pages_l = nombre_pages_l;
        this.edition_l = edition_l;
        this.annee_edition_l = annee_edition_l;
        this.format_l = format_l;
        this.id_exemplaire = id_exemplaire;
        this.id_categorie = id_categorie;
        this.id_a = id_a;
}
    

    /*
    D'autres contructeurs, ici commentés car je ne souhaite pas laisser de choix.
    Dans cet état il est obligatoire d'utiliser le contructeur qui remplit tous les
    attributs avec des chaines de caractères.
     */
    public Livre() {
    }

    /**
     * Un constructeur pour faire un livre juste avec l'id
     * @param idString 
     */
    public Livre(String idString) {
        this.id_l = idString;
    }

    public Livre(String id_l, String titre_l, String bn_l, String nombre_pages_l, String edition_l, String annee_edition_l, String langue_l, String format_l, String resume_l, String nom_a, String id_exemplaire, String id_categorie) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitre_l() {
        return titre_l;
    }

    public void setTitre_l(String titre_l) {
        this.titre_l = titre_l;
    }

    /**
     * @return the isbn_l
     */
    public String getIsbn_l() {
        return isbn_l;
    }

    /**
     * @param isbn_l the isbn_l to set
     */
    public void setIsbn_l(String isbn_l) {
        this.isbn_l = isbn_l;
    }

    /**
     * @return the nombre_pages_l
     */
    public String getNombre_pages_l() {
        return nombre_pages_l;
    }

    /**
     * @param nombre_pages_l the nombre_pages_l to set
     */
    public void setNombre_pages_l(String nombre_pages_l) {
        this.nombre_pages_l = nombre_pages_l;
    }

    /**
     * @return the edition
     */
    public String getEdition_l() {
        return edition_l;
    }

    /**
     * @param edition_l the edition_l to set
     */
    public void setEdition_l(String edition_l) {
        this.edition_l = edition_l;
    }
    
     /**
     * @return the annee_edition_l
     */
    public String getAnnee_edition_l() {
        return annee_edition_l;
    }

    /**
     * @param annee_edition_l the annee_edition_l to set
     */
    public void setAnnee_edition_l(String annee_edition_l) {
        this.annee_edition_l = annee_edition_l;
    }


    /**
     * @return the id
     */
    public String getId_l() {
        return id_l;
    }

    public String getId_a() {
        return id_a;
    }

    public void setId_a(String id_a) {
        this.id_a = id_a;
    }

    public String getId_exemplaire() {
        return id_exemplaire;
    }

    public void setId_exemplaire(String id_exemplaire) {
        this.id_exemplaire = id_exemplaire;
    }

    public String getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(String id_categorie) {
        this.id_categorie = id_categorie;
    }




    /**
     * @return the format_l
     */
    public String getFormat_l() {
        return format_l;
    }

    /**
     * @param format_l the format_l to set
     */
    public void setFormat_l(String format_l) {
        this.format_l = format_l;
    }



    /*
    Nous souhaitons pouvoir afficher un apperçu des informations du livre, cette
    méthode nous le permet.
     */
    public void afficher() {
        System.out.println("Titre : " + this.titre_l);
        System.out.println("Année d'édition : " + this.annee_edition_l);
    }

    @Override
    public String toString() {
        String str = "Titre : " + this.titre_l + "\nAnnée d'édition : "
                + this.annee_edition_l;
        return str;
    }

    /*
    Lorsque l'on n'utilise pas de framework de test comme jUnit, il est nécessaire
    de tester nos méthodes au minimum localement comme ci dessous.
     */
    public static void main(String[] args) {
        String titre_l = "titre";
        String isbn_l = "isbn";
        String nombre_pages_l = "nombrePage";
        String edition_l = "edition";
        String annee_edition_l = "annee_edition_l";
        String format_l = "format";
        String id_exemplaire = "exemplaire";
        String id_categorie = "categorie";
        String id_a = "auteur";

        Livre livreTest = new Livre(titre_l, isbn_l, nombre_pages_l, edition_l, annee_edition_l, format_l, id_exemplaire, id_categorie, id_a);

        // livreTest.afficher();
        System.out.println(livreTest.toString());
        System.out.println(livreTest);
    }
}