/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.ArrayList;
import java.util.List;
import models.Classe;

/**
 *
 * @author user
 */
public class DaoClasse {
    private final String SQL_SELECT_ALL="INSERT INTO 'classe ('ligne )" ;
    private final String SQL_SELECT_ALL="select *from classe ";
    
    public int insert(Classe classe){
        int nbreLigne=0;
        
        
        //insertion 
        return nbreLigne;
        
    } 
    
    public List<Classe>findAll(){
        List<Classe>lClasses=new ArrayList<>();
        return null;
    
    }

    public int insert(Classe){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
