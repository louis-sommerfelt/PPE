/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author JPicard
 */
public class Auteur {
    
    /*
    La liste des attributs. Ce sont des variables qui ont une "durée de vie" longue.
    Tant que l'objet créé à partir de cette classe existe, ses attributs existent aussi.
    Ils doivent "définir" l'objet. C'est à dire qu'ils sont importants pour comprendre et
    différencier les objets.
     */
    private String id_a = "-1";
    private String nom_a;
    private String prenom_a;
   


    /*
    Un contructeur, celui ci attend 9 paramètres de type chaine de caractères et on les
    utilise ensuite pour remplir les différents attributs.
    Pour bien suivre quel paramètre doit aller dans quel attribut on a choisi de
    nommer les paramètres comme les attributs. Attention donc à bien différencier
    les uns des autres grace à "this".
     */
    public Auteur(String nom_a, String prenom_a) {
        this.nom_a = nom_a;
        this.prenom_a = prenom_a;
    }

    public Auteur(String id, String nom_a, String prenom_a) {
        this.id_a = id;
        this.nom_a = nom_a;
        this.prenom_a = prenom_a;
       
    }
    
     public Auteur() {
    }

    /**
     * Un constructeur pour faire un livre juste avec l'id
     * @param idString 
     */
    public Auteur(String idString) {
        this.id_a = idString;
    }

    public String getId() {
        return id_a;
    }

    public void setId(String id) {
        this.id_a = id;
    }

    public String getNom_a() {
        return nom_a;
    }

    public void setNom_a(String nom_a) {
        this.nom_a = nom_a;
    }

    public String getPrenom_a() {
        return prenom_a;
    }

    public void setPrenom_a(String prenom_a) {
        this.prenom_a = prenom_a;
    }
    

}
