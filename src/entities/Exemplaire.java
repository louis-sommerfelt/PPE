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
public class Exemplaire {
      /*
    La liste des attributs. Ce sont des variables qui ont une "durée de vie" longue.
    Tant que l'objet créé à partir de cette classe existe, ses attributs existent aussi.
    Ils doivent "définir" l'objet. C'est à dire qu'ils sont importants pour comprendre et
    différencier les objets.
     */
    private String id_exemplaire = "-1";
    private String ref_e;
    
   


    /*
    Un contructeur, celui ci attend 9 paramètres de type chaine de caractères et on les
    utilise ensuite pour remplir les différents attributs.
    Pour bien suivre quel paramètre doit aller dans quel attribut on a choisi de
    nommer les paramètres comme les attributs. Attention donc à bien différencier
    les uns des autres grace à "this".
     */
   

    public Exemplaire(String id, String ref_e) {
        this.id_exemplaire = id;
        this.ref_e = ref_e;
       
    }
    
     public Exemplaire() {
    }

    /**
     * Un constructeur pour faire un livre juste avec l'id
     * @param idString 
     */
    public Exemplaire(String idString) {
        this.id_exemplaire = idString;
    }

    public String getId() {
        return id_exemplaire;
    }

    public void setId(String id) {
        this.id_exemplaire = id;
    }

    public String getRef_e() {
        return ref_e;
    }

    public void setRef_e(String ref_e) {
        this.ref_e = ref_e;
    }
}

