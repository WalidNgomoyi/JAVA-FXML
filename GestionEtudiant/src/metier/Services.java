/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import Dao.DaoClasse;
import Dao.DaoPersonne;
import java.util.List;
import models.Classe;
import models.Professeur;

/**
 *
 * @author user
 */
public class Services {
    private final DaoClasse daoClasse;
    private final DaoPersonne daoPersonne;
    
    public Services(){
        daoClasse=new DaoClasse();
        daoPersonne=new DaoPersonne();
    }
    
    public List<personne>listerEtudiantParClasse(Classe){
            return daoPersonne.findByClasse;
    }
    
    public boolean creerClasse(Classe classe){
        int nbreLigne=daoClasse.insert(classe);
        return nbreLigne != 0;
        
    }
    public boolean ceerPersonne(Personne pers){
        return daoPersonne.insert(pers)!=0;
    }
    
    public List<Classe> listerClasse(){
        return daoClasse.findAll();
    }
    
    public Professeur chercherProfesseur(String matricule){
       return DaoPersonne.FindByMatricule(matricule);
    }
}


