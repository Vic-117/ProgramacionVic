/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vPerez.ProgramacionNCapasNov2025.DAO;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vPerez.ProgramacionNCapasNov2025.ML.Result;

/**
 *
 * @author digis
 */
@Repository
public class UsuarioJpaDAOImplementation implements IUsuarioJPA {
    
    @Autowired
    private EntityManager entityManager;

    @Override
    public Result getAll() {
        Result result = new Result();
        try{
            
        }catch(Exception ex){
            
        }
        return result;
    }
    
}
