/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SONY
 */
public class Personne {

    private String nom, prenom, nationalite;
    private int age;
 private Personne[] amis;
    static int nbramis=0;
   
    
    public Personne(Personne autre) {
        nom = autre.nom;
        prenom = autre.prenom;
        nationalite = autre.nationalite;
        age = autre.age;
    }

    public Personne(String nom, String prenom, String nationnalite, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationnalite;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(Personne p) {
        nom = p.nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(Personne p) {
        nationalite = p.nationalite;
    }

    public Personne getamis() {
        return amis[nbramis];
    }

    public void setamis(Personne p) {
        this.amis[nbramis] = p.amis[nbramis];
    }

    public  void crerList() {
        amis  = new Personne[10];
    }

    public void AjoutAmis(Personne p) {
        amis[nbramis] = new Personne(p);
        nbramis++;
    }

    public String ToString() {
        return "votre amis de nom= " + this.nom + this.prenom + "agé" + this.age + "de natonnalité" + this.nationalite;
    }

    public void afficherlesamis(Personne p) {
        for (int i = 0; i <= p.nbramis; i++) {
            System.out.println(amis[i]);
        }
    }
}
