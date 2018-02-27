/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hmv.vigihosphmv.ui;

import br.com.hmv.vigihosphmv.entidade.ArtigoMedico;
import br.com.hmv.vigihosphmv.exception.ArtigoMedicoExistenteException;
import br.com.hmv.vigihosphmv.exception.ArtigoMedicoInexistenteException;
import br.com.hmv.vigihosphmv.exception.TiposDeNotificacaoInexistenteException;
import br.com.hmv.vigihosphmv.listar.ArtigoMedicoListar;
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
@RequestMapping("/artigoMedico")
public class ControllerArtigoMedico {
    
    static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(ControllerArtigoMedico.class);
    
    @Autowired
    private FachadaServico fachada;
    
     @RequestMapping(value = "/listar", headers="Accept=*/*", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<ArtigoMedicoListar> listarTodos(){
         return fachada.listarTodosArtigoMedico();
    }
    
   @RequestMapping(value = "/consultarPorId", headers="Accept=*/*", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<ArtigoMedicoListar> consultarPorId(Long id){
        try{
            return fachada.ConsultarArtigoMedicoPorID(id);
        } catch (ArtigoMedicoInexistenteException ex) {
            return null;
        }        
        
    }
    
    @RequestMapping(value = "/cadastrar", headers="Accept=*/*", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<?> adicionarArtigoMedico(ArtigoMedico artigoMedico, Long idTiposDeNotificacao) {
        try {
            fachada.cadastrarArtigoMedico(artigoMedico,idTiposDeNotificacao);
            return new ResponseEntity<String>(HttpStatus.OK);
        } catch (TiposDeNotificacaoInexistenteException ex) {
            return new ResponseEntity<TiposDeNotificacaoInexistenteException>(ex, HttpStatus.BAD_REQUEST);
        }catch (ArtigoMedicoExistenteException ex1) {
            return new ResponseEntity<ArtigoMedicoExistenteException>(ex1, HttpStatus.BAD_REQUEST);
        } catch (ArtigoMedicoInexistenteException ex2) {
            return new ResponseEntity<ArtigoMedicoInexistenteException>(ex2, HttpStatus.BAD_REQUEST);
        }
    }
    
    @RequestMapping(value = "/atualizar", headers="Accept=*/*", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<?> atualizarArtigoMedico(ArtigoMedico artigoMedico, Long idTiposDeNotificacao) {
        try {
            fachada.atualizarArtigoMedico(artigoMedico,idTiposDeNotificacao);
            return new ResponseEntity<String>(HttpStatus.OK);
        }  catch (TiposDeNotificacaoInexistenteException ex) {
            return new ResponseEntity<TiposDeNotificacaoInexistenteException>(ex, HttpStatus.BAD_REQUEST);
        }  catch (ArtigoMedicoInexistenteException ex1) {
            return new ResponseEntity<ArtigoMedicoInexistenteException>(ex1, HttpStatus.BAD_REQUEST);
        }
        
    }
    
    @RequestMapping(value = "/consultarTiposDeNotificacaoPorId", headers="Accept=*/*", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<TiposDeNotificacaoListar> consultarTiposDeNotificacaoPorId(Long id){
        try{
            return fachada.ConsultarTiposDeNotificacaoPorId(id);
        } catch (TiposDeNotificacaoInexistenteException ex) {
            return null;
        }
    }
    
     @RequestMapping("/view")
    public String formCadastrar() {
        return "artigoMedico";
    }
}
