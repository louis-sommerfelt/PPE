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
public class Categorie {
      /*
    La liste des attributs. Ce sont des variables qui ont une "durée de vie" longue.
    Tant que l'objet créé à partir de cette classe existe, ses attributs existent aussi.
    Ils doivent "définir" l'objet. C'est à dire qu'ils sont importants pour comprendre et
    différencier les objets.
     */
    private String id_categorie = "-1";
    private String toutes_thematiques_c;
    private String litterature_c;
    private String enfant_jeunesse_c;
    private String vie_pratique_c;


    /*
    Un contructeur, celui ci attend 9 paramètres de type chaine de caractères et on les
    utilise ensuite pour remplir les différents attributs.
    Pour bien suivre quel paramètre doit aller dans quel attribut on a choisi de
    nommer les paramètres comme les attributs. Attention donc à bien différencier
    les uns des autres grace à "this".
     */
    public Categorie(String toutes_thematiques_c, String litterature_c, String enfant_jeunesse_c, String vie_pratique_c) {
        this.toutes_thematiques_c = toutes_thematiques_c;
        this.litterature_c = litterature_c;
        this.enfant_jeunesse_c = enfant_jeunesse_c;
        this.vie_pratique_c = vie_pratique_c;
    }

    public Categorie(String id, String toutes_thematiques_c, String litterature_c, String enfant_jeunesse_c, String vie_pratique_c) {
        this.id_categorie = id;
        this.toutes_thematiques_c = toutes_thematiques_c;
        this.litterature_c = litterature_c;
        this.enfant_jeunesse_c = enfant_jeunesse_c;
        this.vie_pratique_c = vie_pratique_c;
    }
    

    /*
    D'autres contructeurs, ici commentés car je ne souhaite pas laisser de choix.
    Dans cet état il est obligatoire d'utiliser le contructeur qui remplit tous les
    attributs avec des chaines de caractères.
     */
    public Categorie() {
    }

    /**
     * Un constructeur pour faire un livre juste avec l'id
     * @param idString 
     */
    public Categorie(String idString) {
        this.id_categorie = idString;
    }

    public String getId() {
        return id_categorie;
    }

    public void setId(String id) {
        this.id_categorie = id;
    }

    public String getToutes_thematiques_c() {
        return toutes_thematiques_c;
    }

    public void setToutes_thematiques_c(String toutes_thematiques_c) {
        this.toutes_thematiques_c = toutes_thematiques_c;
    }

    public String getLitterature_c() {
        return litterature_c;
    }

    public void setLitterature_c(String litterature_c) {
        this.litterature_c = litterature_c;
    }

    public String getEnfant_jeunesse_c() {
        return enfant_jeunesse_c;
    }

    public void setEnfant_jeunesse_c(String enfant_jeunesse_c) {
        this.enfant_jeunesse_c = enfant_jeunesse_c;
    }

    public String getVie_pratique_c() {
        return vie_pratique_c;
    }

    public void setVie_pratique_c(String vie_pratique_c) {
        this.vie_pratique_c = vie_pratique_c;
    }

}
