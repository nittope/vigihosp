/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hmv.vigihosphmv.ui;

import br.com.hmv.vigihosphmv.entidade.Usuario;
import br.com.hmv.vigihosphmv.exception.UsuarioExistenteException;
import br.com.hmv.vigihosphmv.exception.UsuarioInexistenteException;
import br.com.hmv.vigihosphmv.listar.UsuarioListar;
import br.com.hmv.vigihosphmv.negocio.FachadaServico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Marcus Vinícius <vinimarcus02@gmail.com>
 */
@Controller
@RequestMapping("/usuario")
public class ControllerUsuario {
    
    static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(ControllerUsuario.class);
    
    @Autowired
    private FachadaServico fachada;
    
     @RequestMapping(value = "/listar", headers="Accept=*/*", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<UsuarioListar> listarTodos(){
         return fachada.listarTodosUsuario();
    }
    
    @RequestMapping(value = "/consultar")
    public @ResponseBody List<UsuarioListar> consultar(String nome){
        try{
            return fachada.ConsultarUsuarioPorNome(nome);
        } catch (UsuarioInexistenteException ex) {
            return null;
        }
    }
    
    @RequestMapping(value = "/consultarPorId", headers="Accept=*/*", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<UsuarioListar> consultarPorId(Long id){
        try{
            return fachada.ConsultarUsuarioPorID(id);
        } catch (UsuarioInexistenteException ex) {
            return null;
        }
        
        
    }
    
    @RequestMapping(value = "/cadastrar", headers="Accept=*/*", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<?> adicionarUsuario(Usuario usuario) {
        try {
            fachada.cadastrarUsuario(usuario);
            return new ResponseEntity<String>(HttpStatus.OK);
        } catch (UsuarioExistenteException ex) {
            return new ResponseEntity<UsuarioExistenteException>(ex, HttpStatus.BAD_REQUEST);
        } catch (UsuarioInexistenteException ex1) {
            return new ResponseEntity<UsuarioInexistenteException>(ex1, HttpStatus.BAD_REQUEST);
        }
    }
    
    @RequestMapping(value = "/atualizar", headers="Accept=*/*", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<?> atualizarUsuario(Usuario usuario) {
        try {
            fachada.atualizarUsuario(usuario);
            return new ResponseEntity<String>(HttpStatus.OK);
        } catch (UsuarioInexistenteException ex) {
            return new ResponseEntity<UsuarioInexistenteException>(ex, HttpStatus.BAD_REQUEST);
        }
    }
    
    @RequestMapping("/view")
    public String formCadastrar() {
        return "usuario";
    }
    
}
