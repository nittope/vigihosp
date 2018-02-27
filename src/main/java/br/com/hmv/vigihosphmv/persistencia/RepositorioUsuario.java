/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hmv.vigihosphmv.persistencia;

import br.com.hmv.vigihosphmv.entidade.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Marcus Vinícius <vinimarcus02@gmail.com>
 */
public interface RepositorioUsuario extends CrudRepository<Usuario, Long>{
    
    public Usuario findByNome(String nome);
    public Usuario findByCpf(String cpf);
    public Usuario findById(Long id);
    
   // @Query("select c from TiposDeNotificacao c where c.nome like '%nomeTiposDeNotificacao%'")
    //public List<Usuario> buscarTiposDeNotificacao(@Param("nomeTiposDeNotificacao")String nomeTiposDeNotificacao);
    
}
