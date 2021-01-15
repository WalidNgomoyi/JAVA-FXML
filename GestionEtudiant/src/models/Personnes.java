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
public abstract class Personnes {
    protected int id;
    protected String nomComplet;

    public Personnes() {
    }

    public Personnes(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public Personnes(int id, String nomComplet) {
        this.id = id;
        this.nomComplet = nomComplet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    @Override
    public String toString() {
        return "Personnes{" + "id=" + id + ", nomComplet=" + nomComplet + '}';
    }
    
    
    
}
