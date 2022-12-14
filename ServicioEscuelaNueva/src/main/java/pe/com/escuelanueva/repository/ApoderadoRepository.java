/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.escuelanueva.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.escuelanueva.entity.ApoderadoEntity;

public interface ApoderadoRepository extends JpaRepository<ApoderadoEntity, Long> {

    @Query("select a from ApoderadoEntity a where a.estado=1")
    List<ApoderadoEntity> findAllCustom();

}
