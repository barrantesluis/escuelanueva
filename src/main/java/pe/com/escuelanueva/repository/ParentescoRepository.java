/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.escuelanueva.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.escuelanueva.entity.ParentescoEntity;

public interface ParentescoRepository extends JpaRepository<ParentescoEntity, Long> {

    @Query("select p from ParentescoEntity p where p.estado=1")
    List<ParentescoEntity> findAllCustom();

}
