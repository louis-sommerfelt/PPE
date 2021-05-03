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
public class Inscrit {
     /*
    La liste des attributs. Ce sont des variables qui ont une "durée de vie" longue.
    Tant que l'objet créé à partir de cette classe existe, ses attributs existent aussi.
    Ils doivent "définir" l'objet. C'est à dire qu'ils sont importants pour comprendre et
    différencier les objets.
     */
    private String id_inscrit = "-1";
    private String date_naissance_i;
    private String nom_i;
    private String prenom_i;
    private String rue_i;
    private String cp_i;
    //private String ville_i;
    private String email_i;
    private String tel_i;
    private String mot_de_passe_i;


    /*
    Un contructeur, celui ci attend 9 paramètres de type chaine de caractères et on les
    utilise ensuite pour remplir les différents attributs.
    Pour bien suivre quel paramètre doit aller dans quel attribut on a choisi de
    nommer les paramètres comme les attributs. Attention donc à bien différencier
    les uns des autres grace à "this".
     */
    public Inscrit(String date_naissance_i, String nom_i, String prenom_i, String rue_i, String cp_i, String email_i, String tel_i, String mot_de_passe_i) {
        this.date_naissance_i = date_naissance_i;
        this.nom_i = nom_i;
        this.prenom_i = prenom_i;
        this.rue_i = rue_i;
        this.cp_i = cp_i;
        this.email_i = email_i;
        this.tel_i = tel_i;
        this.mot_de_passe_i = mot_de_passe_i;
    }

    public Inscrit(String id, String date_naissance_i, String nom_i, String prenom_i, String rue_i, String cp_i, String email_i, String tel_i, String mot_de_passe_i) {
        this.id_inscrit = id;
        this.date_naissance_i = date_naissance_i;
        this.nom_i = nom_i;
        this.prenom_i = prenom_i;
        this.rue_i = rue_i;
        this.cp_i = cp_i;
        this.email_i = email_i;
        this.tel_i = tel_i;
        this.mot_de_passe_i = mot_de_passe_i;
    }
    

    /*
    D'autres contructeurs, ici commentés car je ne souhaite pas laisser de choix.
    Dans cet état il est obligatoire d'utiliser le contructeur qui remplit tous les
    attributs avec des chaines de caractères.
     */
    public Inscrit() {
    }

    /**
     * Un constructeur pour faire un livre juste avec l'id
     * @param idString 
     */
    public Inscrit(String idString) {
        this.id_inscrit = idString;
    }

    public String getId_inscrit() {
        return id_inscrit;
    }

    public void setId_inscrit(String id_inscrit) {
        this.id_inscrit = id_inscrit;
    }

    public String getDate_naissance_i() {
        return date_naissance_i;
    }

    public void setDate_naissance_i(String date_naissance_i) {
        this.date_naissance_i = date_naissance_i;
    }

    public String getNom_i() {
        return nom_i;
    }

    public void setNom_i(String nom_i) {
        this.nom_i = nom_i;
    }

    public String getPrenom_i() {
        return prenom_i;
    }

    public void setPrenom_i(String prenom_i) {
        this.prenom_i = prenom_i;
    }

    public String getRue_i() {
        return rue_i;
    }

    public void setRue_i(String rue_i) {
        this.rue_i = rue_i;
    }

    public String getCp_i() {
        return cp_i;
    }

    public void setCp_i(String cp_i) {
        this.cp_i = cp_i;
    }

    public String getEmail_i() {
        return email_i;
    }

    public void setEmail_i(String email_i) {
        this.email_i = email_i;
    }

    public String getTel_i() {
        return tel_i;
    }

    public void setTel_i(String tel_i) {
        this.tel_i = tel_i;
    }

    public String getMot_de_passe_i() {
        return mot_de_passe_i;
    }

    public void setMot_de_passe_i(String mot_de_passe_i) {
        this.mot_de_passe_i = mot_de_passe_i;
    }

   

}
