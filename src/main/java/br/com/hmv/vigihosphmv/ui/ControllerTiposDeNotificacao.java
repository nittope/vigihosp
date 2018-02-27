/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hmv.vigihosphmv.ui;

import br.com.hmv.vigihosphmv.entidade.TiposDeNotificacao;
import br.com.hmv.vigihosphmv.exception.TiposDeNotificacaoExistenteException;
import br.com.hmv.vigihosphmv.exception.TiposDeNotificacaoInexistenteException;
import br.com.hmv.vigihosphmv.listar.TiposDeNotificacaoListar;
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
@RequestMapping("/notificacao")
public class ControllerTiposDeNotificacao {
    
    static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(ControllerTiposDeNotificacao.class);
    
    @Autowired
    private FachadaServico fachada;
    
    @RequestMapping(value = "/listar", headers="Accept=*/*", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<TiposDeNotificacaoListar> listarTodos(){
         return fachada.listarTodosTiposDeNotificacao();
    }
    
    @RequestMapping(value = "/consultar")
    public @ResponseBody List<TiposDeNotificacaoListar> consultar(String nome){
        try{
            return fachada.ConsultarTiposDeNotificacao(nome);
        } catch (TiposDeNotificacaoInexistenteException ex) {
            return null;
        }
    }
    
    @RequestMapping(value = "/consultarPorId", headers="Accept=*/*", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<TiposDeNotificacaoListar> consultarPorId(Long id){
        try{
            return fachada.ConsultarTiposDeNotificacaoPorId(id);
        } catch (TiposDeNotificacaoInexistenteException ex) {
            return null;
        }
        
        
    }
    
     @RequestMapping(value = "/cadastrar", headers="Accept=*/*", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<?> adicionarTipoDeNotificacao(TiposDeNotificacao tiposDeNotificacao) {
        try {
            fachada.cadastrarTiposDeNotificacao(tiposDeNotificacao);
            return new ResponseEntity<String>(HttpStatus.OK);
        } catch (TiposDeNotificacaoExistenteException ex) {
            return new ResponseEntity<TiposDeNotificacaoExistenteException>(ex, HttpStatus.BAD_REQUEST);
        } catch (TiposDeNotificacaoInexistenteException ex1) {
            return new ResponseEntity<TiposDeNotificacaoInexistenteException>(ex1, HttpStatus.BAD_REQUEST);
        }
    }
    
    @RequestMapping(value = "/atualizar", headers="Accept=*/*", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<?> atualizarTipoDeNotificacao(TiposDeNotificacao tiposDeNotificacao) {
        try {
            fachada.atualizarTiposDeNotificacao(tiposDeNotificacao);
            return new ResponseEntity<String>(HttpStatus.OK);
        } catch (TiposDeNotificacaoInexistenteException ex) {
            return new ResponseEntity<TiposDeNotificacaoInexistenteException>(ex, HttpStatus.BAD_REQUEST);
        }
    }
    
    @RequestMapping("/view")
    public String formCadastrar() {
        return "tipoNotificacao";
    }
}
