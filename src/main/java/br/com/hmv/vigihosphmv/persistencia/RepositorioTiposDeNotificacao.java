/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hmv.vigihosphmv.persistencia;

import br.com.hmv.vigihosphmv.entidade.TiposDeNotificacao;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Marcus Vinícius <vinimarcus02@gmail.com>
 */
public interface RepositorioTiposDeNotificacao extends CrudRepository<TiposDeNotificacao, Long> {
    public TiposDeNotificacao findByNome(String nome);
    public TiposDeNotificacao findById(Long id);
    
    @Query("select c from TiposDeNotificacao c where c.nome like '%nomeTiposDeNotificacao%'")
    public List<TiposDeNotificacao> buscarTiposDeNotificacao(@Param("nomeTiposDeNotificacao")String nomeTiposDeNotificacao);
}
