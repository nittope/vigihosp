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
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcus Vinícius <vinimarcus02@gmail.com>
 */
@Service
public class FachadaServicoImpl implements FachadaServico {
    
    @Autowired
    private ServicoTiposDeNotificacao servicoTiposDeNotificacao;
    
    @Autowired
    private ServicoArtigoMedico servicoArtigoMedico;
    
    @Autowired
    private ServicoUsuario servicoUsuario;

    //TiposDeNotificacao 
    
    @Override
    public void cadastrarTiposDeNotificacao(TiposDeNotificacao tiposDeNotificacao) throws TiposDeNotificacaoExistenteException, TiposDeNotificacaoInexistenteException {
        servicoTiposDeNotificacao.cadastrar(tiposDeNotificacao);
    }

    @Override
    public void atualizarTiposDeNotificacao(TiposDeNotificacao tiposDeNotificacao) throws TiposDeNotificacaoInexistenteException {
        servicoTiposDeNotificacao.atualizar(tiposDeNotificacao);
    }

    @Override
    public void removerTiposDeNotificacao(TiposDeNotificacao tiposDeNotificacao) throws TiposDeNotificacaoInexistenteException {
        servicoTiposDeNotificacao.remover(tiposDeNotificacao);
    }

    @Override
    public List<TiposDeNotificacaoListar> listarTodosTiposDeNotificacao() {
        return servicoTiposDeNotificacao.listarTodos();
    }

    @Override
    public List<TiposDeNotificacaoListar> ConsultarTiposDeNotificacao(String nome) throws TiposDeNotificacaoInexistenteException {
        return servicoTiposDeNotificacao.ConsultarPorNome(nome);
    }

    @Override
    public List<TiposDeNotificacaoListar> ConsultarTiposDeNotificacaoPorId(Long id) throws TiposDeNotificacaoInexistenteException {
        return servicoTiposDeNotificacao.ConsultarPorID(id);
    }

    //ArtigoMedico
    
    @Override
    public void cadastrarArtigoMedico(ArtigoMedico artigoMedico, Long idTiposDeNotificacao) throws ArtigoMedicoExistenteException, ArtigoMedicoInexistenteException, TiposDeNotificacaoInexistenteException {
        servicoArtigoMedico.cadastrar(artigoMedico, idTiposDeNotificacao);
    }

    @Override
    public void atualizarArtigoMedico(ArtigoMedico artigoMedico, Long idTiposDeNotificacao) throws ArtigoMedicoInexistenteException, TiposDeNotificacaoInexistenteException {
        servicoArtigoMedico.atualizar(artigoMedico, idTiposDeNotificacao);
    }

    @Override
    public void removerArtigoMedico(ArtigoMedico dadoIndicador) throws ArtigoMedicoInexistenteException {
        servicoArtigoMedico.remover(dadoIndicador);
    }

    @Override
    public List<ArtigoMedicoListar> listarTodosArtigoMedico() {
        return servicoArtigoMedico.listarTodos();
    }

    @Override
    public List<ArtigoMedicoListar> ConsultarArtigoMedicoPorID(Long id) throws ArtigoMedicoInexistenteException {
        return servicoArtigoMedico.ConsultarPorID(id);
    }

    //Usuario
    
    @Override
    public void cadastrarUsuario(Usuario usuario) throws UsuarioExistenteException, UsuarioInexistenteException {
        servicoUsuario.cadastrar(usuario);
    }

    @Override
    public void atualizarUsuario(Usuario usuario) throws UsuarioInexistenteException {
        servicoUsuario.atualizar(usuario);
    }

    @Override
    public void removerUsuario(Usuario usuario) throws UsuarioInexistenteException {
        servicoUsuario.remover(usuario);
    }

    @Override
    public List<UsuarioListar> listarTodosUsuario() {
        return servicoUsuario.listarTodos();
    }

    @Override
    public List<UsuarioListar> ConsultarUsuarioPorNome(String nome) throws UsuarioInexistenteException {
        return servicoUsuario.ConsultarPorNome(nome);
    }

    @Override
    public List<UsuarioListar> ConsultarUsuarioPorID(Long id) throws UsuarioInexistenteException {
        return servicoUsuario.ConsultarPorID(id);
    }
    
}
