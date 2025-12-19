/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vPerez.ProgramacionNCapasNov2025.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vPerez.ProgramacionNCapasNov2025.JPA.Usuario;
import vPerez.ProgramacionNCapasNov2025.ML.Result;
import vPerez.ProgramacionNCapasNov2025.Mapper.UsuarioMapper;

/**
 *
 * @author digis
 */
@Repository
public class UsuarioJpaDAOImplementation implements IUsuarioJPA {
    
    @Autowired
    private EntityManager entityManager;
    
//    @Autowired
//    private UsuarioMapper usuarioMapper;
@Autowired
private ModelMapper modelMapper;
    @Override
    public Result getAll() {
        Result result = new Result();
        try{
            TypedQuery<Usuario> typedQuery= entityManager.createQuery("FROM Usuario",Usuario.class);
          List<Usuario> usuarios = typedQuery.getResultList();//Usuarios entidades
          //                                                       FORMA 1
          
          result.Objects = new ArrayList<>();
          for(Usuario usuario : usuarios){
              vPerez.ProgramacionNCapasNov2025.ML.Usuario usuarioML = modelMapper.map(usuario, vPerez.ProgramacionNCapasNov2025.ML.Usuario.class);
              result.Objects.add(usuarioML);
          }
          
          
          
          
          //                                                     FORMA 2.
          //Conversion que se hace automaticamente por el mapper:
//          List< vPerez.ProgramacionNCapasNov2025.ML.Usuario> dtos = usuarioMapper.toDTOList(usuarios);
//          result.Objects = new ArrayList<>();
//          result.Objects.addAll(dtos);
            result.Correct = true;
        }catch(Exception ex){
            result.Correct = false;
            result.ErrorMesagge=ex.getLocalizedMessage();
            result.ex = ex;
        }
        return result;
    }
    
}
