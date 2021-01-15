/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours.liste;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Exercice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       /*
        Créer une liste String
        Ajouter des éléments
        Affichage de la liste
        Supprimer des éléments
        modifier élément de la list 
        Rechercher un élément de la liste
        */
       
       //Créer une liste String
       
       List<String> lString=new ArrayList();
       //Ajouter des éléments
       lString.add("Bonjour");
       lString.add("Au Revoir");
       lString.add("les étudiants de la LIAGE3");
       
        //Affichage de la liste
        //methode 1
        lString.forEach((elt) -> {
            System.out.println(elt);
        });
       lString.add(0, "Debut");
       lString.forEach((elt) -> {
           System.out.println(elt);
        });
       
       //Supprimer des éléments
       lString.remove("Debut");
       lString.remove(2);
       System.out.println("Affichage après suppression");
       
        lString.forEach((elt) -> {
            System.out.println(elt);
        });
        
        //modifier élément de la list 
        
        lString.set(0,"Bonsoir");
               System.out.println("Affichage après suppression");
       
        lString.forEach((elt) -> {
            System.out.println(elt);
        });
            
        //Rechercher un élément de la liste
        if (lString.contains("Bonjour")==true){
             System.out.println("L'élément existe");
        }else{
             System.out.println("L'élément n'existe pas");
    }
       
       
       
       
    }
    
    
    
}
