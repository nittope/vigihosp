/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hmv.vigihosphmv.negocio;

import br.com.hmv.vigihosphmv.exception.TiposDeNotificacaoInexistenteException;
import br.com.hmv.vigihosphmv.exception.TiposDeNotificacaoExistenteException;
import br.com.hmv.vigihosphmv.entidade.TiposDeNotificacao;
import br.com.hmv.vigihosphmv.listar.TiposDeNotificacaoListar;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Marcus Vinícius <vinimarcus02@gmail.com>
 */
public interface ServicoTiposDeNotificacao extends Serializable {
    
    public void cadastrar(TiposDeNotificacao tiposDeNotificacao) throws TiposDeNotificacaoExistenteException, TiposDeNotificacaoInexistenteException;
    public void atualizar(TiposDeNotificacao tiposDeNotificacao) throws TiposDeNotificacaoInexistenteException;
    public void remover(TiposDeNotificacao tiposDeNotificacao) throws TiposDeNotificacaoInexistenteException;
    public List<TiposDeNotificacaoListar> listarTodos();
    public List<TiposDeNotificacaoListar> ConsultarPorNome(String nome) throws TiposDeNotificacaoInexistenteException;
    public List<TiposDeNotificacaoListar> ConsultarPorID(Long id) throws TiposDeNotificacaoInexistenteException;
    public TiposDeNotificacao ConsultarPorIdU(Long id) throws TiposDeNotificacaoInexistenteException;
    
}
