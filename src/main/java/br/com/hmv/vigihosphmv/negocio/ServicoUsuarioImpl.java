/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hmv.vigihosphmv.negocio;

import br.com.hmv.vigihosphmv.entidade.Usuario;
import br.com.hmv.vigihosphmv.exception.UsuarioExistenteException;
import br.com.hmv.vigihosphmv.exception.UsuarioInexistenteException;
import br.com.hmv.vigihosphmv.listar.UsuarioListar;
import br.com.hmv.vigihosphmv.persistencia.RepositorioUsuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcus Vinícius <vinimarcus02@gmail.com>
 */
@Service
public class ServicoUsuarioImpl implements ServicoUsuario {
    
    @Autowired
    private RepositorioUsuario repositorioUsuario;

    @Override
    public void cadastrar(Usuario usuario) throws UsuarioExistenteException, UsuarioInexistenteException {
        Usuario t = repositorioUsuario.findByNome(usuario.getNome());
        if(t!=null){
                t.setNome(usuario.getNome()); 
                t.setCpf(usuario.getCpf()); 
                t.setSenha(usuario.getSenha()); 
                t.setAuthority(usuario.getAuthority());
                usuario.setAtivo(usuario.isAtivo());
                
        }else{
            throw new UsuarioExistenteException();
        }
        repositorioUsuario.save(usuario);
    }

    @Override
    public void atualizar(Usuario usuario) throws UsuarioInexistenteException {
        Usuario usuarioAtualizar = repositorioUsuario.findById(usuario.getId());
        if(usuarioAtualizar==null)
            throw new UsuarioInexistenteException();
        usuarioAtualizar.setNome(usuarioAtualizar.getNome());
        usuarioAtualizar.setCpf(usuarioAtualizar.getCpf());
        usuarioAtualizar.setSenha(usuarioAtualizar.getSenha());
        usuarioAtualizar.setAuthority(usuarioAtualizar.getAuthority());
        usuarioAtualizar.setAtivo(usuarioAtualizar.isAtivo());           
        repositorioUsuario.save(usuarioAtualizar); 
    }

    @Override
    public void remover(Usuario usuario) throws UsuarioInexistenteException {
        
    }

    @Override
    public List<UsuarioListar> listarTodos() {
        List<UsuarioListar> retorno = new ArrayList<UsuarioListar>();
        List<Usuario> pesquisa = (List<Usuario>) repositorioUsuario.findAll();
        for(int i = 0;i < pesquisa.size(); i++){
            
            UsuarioListar cl = new UsuarioListar();
            cl.setId(pesquisa.get(i).getId());
            cl.setNome(pesquisa.get(i).getNome()); 
            cl.setCpf(pesquisa.get(i).getCpf()); 
            cl.setSenha(pesquisa.get(i).getSenha()); 
            cl.setAuthority(pesquisa.get(i).getAuthority()); 
            cl.setAtivo(pesquisa.get(i).isAtivo()); 

            retorno.add(cl);
            
            
        }
        return retorno;
    }

    @Override
    public List<UsuarioListar> ConsultarPorNome(String nome) throws UsuarioInexistenteException {
        List<UsuarioListar> retorno = new ArrayList<UsuarioListar>();
        List<Usuario> pesquisa = (List<Usuario>) repositorioUsuario.findByNome(nome);
        if(pesquisa==null)
            throw new UsuarioInexistenteException();
        for(int i = 0;i < pesquisa.size(); i++){

            UsuarioListar cl = new UsuarioListar();
            cl.setId(pesquisa.get(i).getId());
            cl.setNome(pesquisa.get(i).getNome());
            cl.setCpf(pesquisa.get(i).getCpf());
            cl.setSenha(pesquisa.get(i).getSenha());
            cl.setAuthority(pesquisa.get(i).getAuthority());
            cl.setAtivo(pesquisa.get(i).isAtivo());   

            retorno.add(cl);
            }            
    
    return retorno;
    }

    @Override
    public List<UsuarioListar> ConsultarPorID(Long id) throws UsuarioInexistenteException {
        List<UsuarioListar> retorno = new ArrayList<UsuarioListar>();
        Usuario pesquisa = repositorioUsuario.findById(id);
        if(pesquisa==null)
            throw new UsuarioInexistenteException();
        
        UsuarioListar cl = new UsuarioListar();
        cl.setId(pesquisa.getId());
        cl.setNome(pesquisa.getNome());
        cl.setCpf(pesquisa.getCpf());
        cl.setSenha(pesquisa.getSenha());
        cl.setAuthority(pesquisa.getAuthority());
        cl.setAtivo(pesquisa.isAtivo());   
        
        retorno.add(cl);  
        return retorno; 
    }
    
}
