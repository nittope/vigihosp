/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hmv.vigihosphmv.negocio;

import br.com.hmv.vigihosphmv.exception.ArtigoMedicoInexistenteException;
import br.com.hmv.vigihosphmv.exception.ArtigoMedicoExistenteException;
import br.com.hmv.vigihosphmv.entidade.ArtigoMedico;
import br.com.hmv.vigihosphmv.exception.TiposDeNotificacaoInexistenteException;
import br.com.hmv.vigihosphmv.listar.ArtigoMedicoListar;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Marcus Vinícius <vinimarcus02@gmail.com>
 */
public interface ServicoArtigoMedico extends Serializable{
    
    public void cadastrar(ArtigoMedico artigoMedico, Long idTiposDeNotificacao) throws ArtigoMedicoExistenteException, ArtigoMedicoInexistenteException, TiposDeNotificacaoInexistenteException;
    public void atualizar(ArtigoMedico artigoMedico, Long idTiposDeNotificacao) throws ArtigoMedicoInexistenteException, TiposDeNotificacaoInexistenteException;
    public void remover(ArtigoMedico dadoIndicador) throws ArtigoMedicoInexistenteException;
    public List<ArtigoMedicoListar> listarTodos();    
    public List<ArtigoMedicoListar> ConsultarPorID(Long id) throws ArtigoMedicoInexistenteException;
    
}
