/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author user
 */
public class Etudiant extends Personnes {
    private String tuteur;
    //ManyToOne
    private Classe cl;

    public Etudiant() {
        super ();
    }

    public Etudiant(String tuteur, String nomComplet) {
        super(nomComplet);
        this.tuteur = tuteur;
    }

    public Etudiant(String tuteur, int id, String nomComplet) {
        super(id, nomComplet);
        this.tuteur = tuteur;
    }

    @Override
    public String toString() {
        return super.toString()+"tuteur:"+tuteur; //To change body of generated methods, choose Tools | Templates.
    }

    public Classe getCl() {
        return cl;
    }

    public void setCl(Classe cl) {
        this.cl = cl;
    }
    
    
    
}
