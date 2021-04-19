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
    private String dateNaissance_i;
    private String nom_i;
    private String prenom_i;
    private String rue_i;
    private String cp_i;
    private String ville_i;
    private String email_i;
    private String tel_i;
    private String motDePasse_i;


    /*
    Un contructeur, celui ci attend 9 paramètres de type chaine de caractères et on les
    utilise ensuite pour remplir les différents attributs.
    Pour bien suivre quel paramètre doit aller dans quel attribut on a choisi de
    nommer les paramètres comme les attributs. Attention donc à bien différencier
    les uns des autres grace à "this".
     */
    public Inscrit(String dateNaissance_i, String nom_i, String prenom_i, String rue_i, String cp_i, String ville_i, String email_i, String tel_i, String motDePasse_i) {
        this.dateNaissance_i = dateNaissance_i;
        this.nom_i = nom_i;
        this.prenom_i = prenom_i;
        this.rue_i = rue_i;
        this.cp_i = cp_i;
        this.ville_i = ville_i;
        this.email_i = email_i;
        this.tel_i = tel_i;
        this.motDePasse_i = motDePasse_i;
    }

    public Inscrit(String id, String dateNaissance_i, String nom_i, String prenom_i, String rue_i, String cp_i, String ville_i, String email_i, String tel_i, String motDePasse_i) {
        this.id_inscrit = id;
        this.dateNaissance_i = dateNaissance_i;
        this.nom_i = nom_i;
        this.prenom_i = prenom_i;
        this.rue_i = rue_i;
        this.cp_i = cp_i;
        this.ville_i = ville_i;
        this.email_i = email_i;
        this.tel_i = tel_i;
       this.motDePasse_i = motDePasse_i;
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

    public String getId() {
        return id_inscrit;
    }

    public void setId(String id) {
        this.id_inscrit = id;
    }

    public String getDateNaissance_i() {
        return dateNaissance_i;
    }

    public void setDateNaissance_i(String dateNaissance_i) {
        this.dateNaissance_i = dateNaissance_i;
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

    public String getVille_i() {
        return ville_i;
    }

    public void setVille_i(String ville_i) {
        this.ville_i = ville_i;
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

    public String getMotDePasse_i() {
        return motDePasse_i;
    }

    public void setMotDePasse_i(String motDePasse_i) {
        this.motDePasse_i = motDePasse_i;
    }

   

}
