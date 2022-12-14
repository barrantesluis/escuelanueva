/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.escuelanueva.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.escuelanueva.entity.DistritoEntity;

public interface DistritoRepository extends JpaRepository<DistritoEntity, Long>{
    @Query("select d from DistritoEntity d where d.estado=1")
    List<DistritoEntity> findAllCustom();
}
