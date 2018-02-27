/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hmv.vigihosphmv.negocio;

import br.com.hmv.vigihosphmv.entidade.TiposDeNotificacao;
import br.com.hmv.vigihosphmv.exception.TiposDeNotificacaoExistenteException;
import br.com.hmv.vigihosphmv.exception.TiposDeNotificacaoInexistenteException;
import br.com.hmv.vigihosphmv.listar.TiposDeNotificacaoListar;
import br.com.hmv.vigihosphmv.persistencia.RepositorioTiposDeNotificacao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcus Vinícius <vinimarcus02@gmail.com>
 */
@Service
public class ServicoTiposDeNotificacaoImpl implements ServicoTiposDeNotificacao {
    
    @Autowired
    private RepositorioTiposDeNotificacao repositorioTiposDeNotificacao;

    @Override
    public void cadastrar(TiposDeNotificacao tiposDeNotificacao) throws TiposDeNotificacaoExistenteException, TiposDeNotificacaoInexistenteException {
        TiposDeNotificacao t = repositorioTiposDeNotificacao.findByNome(tiposDeNotificacao.getNome());
        if(t!=null){
                t.setNome(tiposDeNotificacao.getNome()); 
                t.setUrlDeAcesso(tiposDeNotificacao.getUrlDeAcesso());
        }else{
            throw new TiposDeNotificacaoExistenteException();
        }
        repositorioTiposDeNotificacao.save(tiposDeNotificacao);
        
    }

    @Override
    public void atualizar(TiposDeNotificacao tiposDeNotificacao) throws TiposDeNotificacaoInexistenteException {
        TiposDeNotificacao tiposDeNotificacaoAtualizar = repositorioTiposDeNotificacao.findById(tiposDeNotificacao.getId());
        if(tiposDeNotificacaoAtualizar==null)
            throw new TiposDeNotificacaoInexistenteException();
        tiposDeNotificacaoAtualizar.setNome(tiposDeNotificacao.getNome());
        tiposDeNotificacaoAtualizar.setUrlDeAcesso(tiposDeNotificacao.getUrlDeAcesso()); 
        repositorioTiposDeNotificacao.save(tiposDeNotificacaoAtualizar); 
    }

    @Override
    public void remover(TiposDeNotificacao tiposDeNotificacao) throws TiposDeNotificacaoInexistenteException {
        
    }

    @Override
    public List<TiposDeNotificacaoListar> listarTodos() {
        List<TiposDeNotificacaoListar> retorno = new ArrayList<TiposDeNotificacaoListar>();
        List<TiposDeNotificacao> pesquisa = (List<TiposDeNotificacao>) repositorioTiposDeNotificacao.findAll();
        for(int i = 0;i < pesquisa.size(); i++){
            
            TiposDeNotificacaoListar cl = new TiposDeNotificacaoListar();
            cl.setId(pesquisa.get(i).getId());
            cl.setNome(pesquisa.get(i).getNome()); 
            cl.setUrlDeAcesso(pesquisa.get(i).getUrlDeAcesso());  

            retorno.add(cl);
            
            
        }
        return retorno;
    }

    
    @Override
    public List<TiposDeNotificacaoListar> ConsultarPorNome(String nome) throws TiposDeNotificacaoInexistenteException {
        List<TiposDeNotificacaoListar> retorno = new ArrayList<TiposDeNotificacaoListar>();
        List<TiposDeNotificacao> pesquisa = (List<TiposDeNotificacao>) repositorioTiposDeNotificacao.findByNome(nome);
        if(pesquisa==null)
            throw new TiposDeNotificacaoInexistenteException();
        for(int i = 0;i < pesquisa.size(); i++){

            TiposDeNotificacaoListar cl = new TiposDeNotificacaoListar();
            cl.setNome(pesquisa.get(i).getNome());
            cl.setUrlDeAcesso(pesquisa.get(i).getUrlDeAcesso());  

            retorno.add(cl);
            }            
    
    return retorno;
    }

    @Override
    public List<TiposDeNotificacaoListar> ConsultarPorID(Long id) throws TiposDeNotificacaoInexistenteException {
        List<TiposDeNotificacaoListar> retorno = new ArrayList<TiposDeNotificacaoListar>();
        TiposDeNotificacao pesquisa = repositorioTiposDeNotificacao.findById(id);
        if(pesquisa==null)
            throw new TiposDeNotificacaoInexistenteException();
        
        TiposDeNotificacaoListar cl = new TiposDeNotificacaoListar();
        cl.setId(pesquisa.getId());
        cl.setNome(pesquisa.getNome());
        cl.setUrlDeAcesso(pesquisa.getUrlDeAcesso());            
        
        retorno.add(cl);  
        return retorno; 
    }

    @Override
    public TiposDeNotificacao ConsultarPorIdU(Long id) throws TiposDeNotificacaoInexistenteException {
        TiposDeNotificacao cabecalhoAtualizar = repositorioTiposDeNotificacao.findById(id);
        return cabecalhoAtualizar;
    }
    
}
