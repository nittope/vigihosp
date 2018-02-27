/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hmv.vigihosphmv.persistencia;

import br.com.hmv.vigihosphmv.entidade.ArtigoMedico;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Marcus Vinícius <vinimarcus02@gmail.com>
 */
public interface RepositorioArtigoMedico extends CrudRepository<ArtigoMedico, Long> {
    
    public ArtigoMedico findByNome(String nome);
    public ArtigoMedico findById(Long id);
    
    @Query("select c from ArtigoMedico c where c.nome like '%nomeArtigoMedico%'")
    public List<ArtigoMedico> buscarCabecalhos(@Param("nomeArtigoMedico")String nomeArtigoMedico);
    
}
