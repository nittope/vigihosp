/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hmv.vigihosphmv.negocio;

import br.com.hmv.vigihosphmv.exception.UsuarioExistenteException;
import br.com.hmv.vigihosphmv.exception.UsuarioInexistenteException;
import br.com.hmv.vigihosphmv.entidade.Usuario;
import br.com.hmv.vigihosphmv.listar.UsuarioListar;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Marcus Vinícius <vinimarcus02@gmail.com>
 */
public interface ServicoUsuario extends Serializable {
    
    public void cadastrar(Usuario usuario) throws UsuarioExistenteException, UsuarioInexistenteException;
    public void atualizar(Usuario usuario) throws UsuarioInexistenteException;
    public void remover(Usuario usuario) throws UsuarioInexistenteException;
    public List<UsuarioListar> listarTodos();
    public List<UsuarioListar> ConsultarPorNome(String nome) throws UsuarioInexistenteException;
    public List<UsuarioListar> ConsultarPorID(Long id) throws UsuarioInexistenteException;
        
}
