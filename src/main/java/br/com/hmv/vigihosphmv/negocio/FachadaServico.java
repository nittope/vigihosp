/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hmv.vigihosphmv.negocio;

import br.com.hmv.vigihosphmv.entidade.ArtigoMedico;
import br.com.hmv.vigihosphmv.entidade.TiposDeNotificacao;
import br.com.hmv.vigihosphmv.entidade.Usuario;
import br.com.hmv.vigihosphmv.exception.ArtigoMedicoExistenteException;
import br.com.hmv.vigihosphmv.exception.ArtigoMedicoInexistenteException;
import br.com.hmv.vigihosphmv.exception.TiposDeNotificacaoExistenteException;
import br.com.hmv.vigihosphmv.exception.TiposDeNotificacaoInexistenteException;
import br.com.hmv.vigihosphmv.exception.UsuarioExistenteException;
import br.com.hmv.vigihosphmv.exception.UsuarioInexistenteException;
import br.com.hmv.vigihosphmv.listar.ArtigoMedicoListar;
import br.com.hmv.vigihosphmv.listar.TiposDeNotificacaoListar;
import br.com.hmv.vigihosphmv.listar.UsuarioListar;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Marcus Vinícius <vinimarcus02@gmail.com>
 */
public interface FachadaServico extends Serializable {
    
    //TiposDeNotificacao
    public void cadastrarTiposDeNotificacao(TiposDeNotificacao tiposDeNotificacao) throws TiposDeNotificacaoExistenteException, TiposDeNotificacaoInexistenteException;
    public void atualizarTiposDeNotificacao(TiposDeNotificacao tiposDeNotificacao) throws TiposDeNotificacaoInexistenteException;
    public void removerTiposDeNotificacao(TiposDeNotificacao tiposDeNotificacao) throws TiposDeNotificacaoInexistenteException;
    public List<TiposDeNotificacaoListar> listarTodosTiposDeNotificacao();
    public List<TiposDeNotificacaoListar> ConsultarTiposDeNotificacao(String nome) throws TiposDeNotificacaoInexistenteException;
    public List<TiposDeNotificacaoListar> ConsultarTiposDeNotificacaoPorId(Long id) throws TiposDeNotificacaoInexistenteException;
    
     //ArtigoMedico
    public void cadastrarArtigoMedico(ArtigoMedico artigoMedico, Long idTiposDeNotificacao) throws ArtigoMedicoExistenteException, ArtigoMedicoInexistenteException, TiposDeNotificacaoInexistenteException;
    public void atualizarArtigoMedico(ArtigoMedico artigoMedico, Long idTiposDeNotificacao) throws ArtigoMedicoInexistenteException, TiposDeNotificacaoInexistenteException;
    public void removerArtigoMedico(ArtigoMedico dadoIndicador) throws ArtigoMedicoInexistenteException;
    public List<ArtigoMedicoListar> listarTodosArtigoMedico();    
    public List<ArtigoMedicoListar> ConsultarArtigoMedicoPorID(Long id) throws ArtigoMedicoInexistenteException;
    
    //Usuario
    
    public void cadastrarUsuario(Usuario usuario) throws UsuarioExistenteException, UsuarioInexistenteException;
    public void atualizarUsuario(Usuario usuario) throws UsuarioInexistenteException;
    public void removerUsuario(Usuario usuario) throws UsuarioInexistenteException;
    public List<UsuarioListar> listarTodosUsuario();
    public List<UsuarioListar> ConsultarUsuarioPorNome(String nome) throws UsuarioInexistenteException;
    public List<UsuarioListar> ConsultarUsuarioPorID(Long id) throws UsuarioInexistenteException;
}
