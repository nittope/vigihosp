/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hmv.vigihosphmv.negocio;

import br.com.hmv.vigihosphmv.entidade.ArtigoMedico;
import br.com.hmv.vigihosphmv.entidade.TiposDeNotificacao;
import br.com.hmv.vigihosphmv.exception.ArtigoMedicoExistenteException;
import br.com.hmv.vigihosphmv.exception.ArtigoMedicoInexistenteException;
import br.com.hmv.vigihosphmv.exception.TiposDeNotificacaoInexistenteException;
import br.com.hmv.vigihosphmv.listar.ArtigoMedicoListar;
import br.com.hmv.vigihosphmv.persistencia.RepositorioArtigoMedico;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcus Vinícius <vinimarcus02@gmail.com>
 */
@Service
public class ServicoArtigoMedicoImpl implements ServicoArtigoMedico {
    
    @Autowired
    private RepositorioArtigoMedico repositorioArtigoMedico;
    
    @Autowired
    private ServicoTiposDeNotificacao servicoTiposDeNotificacao;

    @Override
    public void cadastrar(ArtigoMedico artigoMedico, Long idTiposDeNotificacao) throws ArtigoMedicoExistenteException, ArtigoMedicoInexistenteException, TiposDeNotificacaoInexistenteException {
        
        TiposDeNotificacao tiposDeNotificacao = servicoTiposDeNotificacao.ConsultarPorIdU(idTiposDeNotificacao);
        
        
        artigoMedico.setTiposDeNotificacao(tiposDeNotificacao);      
        artigoMedico.setColaboradorNotificante(artigoMedico.getColaboradorNotificante());
        artigoMedico.setCodProduto(artigoMedico.getCodProduto());
        artigoMedico.setNome(artigoMedico.getNome());
        artigoMedico.setFabricante(artigoMedico.getFabricante());
        artigoMedico.setRegAnvisa(artigoMedico.getRegAnvisa());
        artigoMedico.setLoteNSerie(artigoMedico.getLoteNSerie());
        artigoMedico.setValidade(artigoMedico.getValidade());
        artigoMedico.setEstoqueSetor(artigoMedico.getEstoqueSetor());
        artigoMedico.setCentroCusto(artigoMedico.getCentroCusto());
        artigoMedico.setAspectoAlterado(artigoMedico.isAspectoAlterado());
        artigoMedico.setCorpoEstranho(artigoMedico.isCorpoEstranho());
        artigoMedico.setProbRotulo(artigoMedico.isProbRotulo());
        artigoMedico.setEsterilizacaoVencida(artigoMedico.isEsterilizacaoVencida());
        artigoMedico.setValidadeVencida(artigoMedico.isValidadeVencida());
        artigoMedico.setReprocessado(artigoMedico.isReprocessado());
        artigoMedico.setRachaduraQuebra(artigoMedico.isRachaduraQuebra());
        artigoMedico.setQtdeMenor(artigoMedico.isQtdeMenor());
        artigoMedico.setOutros(artigoMedico.getOutros());
        artigoMedico.setEnvioAmostra(artigoMedico.isEnvioAmostra());
        artigoMedico.setDescricao(artigoMedico.getDescricao());
        artigoMedico.setProvidenciasAdotadas(artigoMedico.getProvidenciasAdotadas());
        artigoMedico.setDanoPaciente(artigoMedico.isDanoPaciente());
        artigoMedico.setAtendida(artigoMedico.isAtendida());
        
        repositorioArtigoMedico.save(artigoMedico);
        
        
    }

    @Override
    public void atualizar(ArtigoMedico artigoMedico, Long idTiposDeNotificacao) throws ArtigoMedicoInexistenteException, TiposDeNotificacaoInexistenteException {
        TiposDeNotificacao tiposDeNotificacao = servicoTiposDeNotificacao.ConsultarPorIdU(idTiposDeNotificacao);
        
        ArtigoMedico artigoMedicoAtualizar = repositorioArtigoMedico.findById(artigoMedico.getId());
        if(artigoMedicoAtualizar==null)
            throw new ArtigoMedicoInexistenteException();
        artigoMedicoAtualizar.setTiposDeNotificacao(tiposDeNotificacao);      
        artigoMedicoAtualizar.setColaboradorNotificante(artigoMedico.getColaboradorNotificante());
        artigoMedicoAtualizar.setCodProduto(artigoMedico.getCodProduto());
        artigoMedicoAtualizar.setNome(artigoMedico.getNome());
        artigoMedicoAtualizar.setFabricante(artigoMedico.getFabricante());
        artigoMedicoAtualizar.setRegAnvisa(artigoMedico.getRegAnvisa());
        artigoMedicoAtualizar.setLoteNSerie(artigoMedico.getLoteNSerie());
        artigoMedicoAtualizar.setValidade(artigoMedico.getValidade());
        artigoMedicoAtualizar.setEstoqueSetor(artigoMedico.getEstoqueSetor());
        artigoMedicoAtualizar.setCentroCusto(artigoMedico.getCentroCusto());
        artigoMedicoAtualizar.setAspectoAlterado(artigoMedico.isAspectoAlterado());
        artigoMedicoAtualizar.setCorpoEstranho(artigoMedico.isCorpoEstranho());
        artigoMedicoAtualizar.setProbRotulo(artigoMedico.isProbRotulo());
        artigoMedicoAtualizar.setEsterilizacaoVencida(artigoMedico.isEsterilizacaoVencida());
        artigoMedicoAtualizar.setValidadeVencida(artigoMedico.isValidadeVencida());
        artigoMedicoAtualizar.setReprocessado(artigoMedico.isReprocessado());
        artigoMedicoAtualizar.setRachaduraQuebra(artigoMedico.isRachaduraQuebra());
        artigoMedicoAtualizar.setQtdeMenor(artigoMedico.isQtdeMenor());
        artigoMedicoAtualizar.setOutros(artigoMedico.getOutros());
        artigoMedicoAtualizar.setEnvioAmostra(artigoMedico.isEnvioAmostra());
        artigoMedicoAtualizar.setDescricao(artigoMedico.getDescricao());
        artigoMedicoAtualizar.setProvidenciasAdotadas(artigoMedico.getProvidenciasAdotadas());
        artigoMedicoAtualizar.setDanoPaciente(artigoMedico.isDanoPaciente());
        artigoMedicoAtualizar.setAtendida(artigoMedico.isAtendida());
        
        repositorioArtigoMedico.save(artigoMedicoAtualizar);
    }

    @Override
    public void remover(ArtigoMedico dadoIndicador) throws ArtigoMedicoInexistenteException {
        
    }

    @Override
    public List<ArtigoMedicoListar> listarTodos() {
        List<ArtigoMedicoListar> retorno = new ArrayList<ArtigoMedicoListar>();
        List<ArtigoMedico> pesquisa = (List<ArtigoMedico>) repositorioArtigoMedico.findAll();
        
        for(int i = 0;i < pesquisa.size(); i++){
            
            ArtigoMedicoListar dl = new ArtigoMedicoListar();
            dl.setId(pesquisa.get(i).getId());
            dl.setTiposDeNotificacao(pesquisa.get(i).getTiposDeNotificacao().getId());
            dl.setTiposDeNotificacaoNome(pesquisa.get(i).getTiposDeNotificacao().getNome());                                          
            dl.setColaboradorNotificante(pesquisa.get(i).getColaboradorNotificante());            

            retorno.add(dl);


    }
    return retorno;  
    }

    
    @Override
    public List<ArtigoMedicoListar> ConsultarPorID(Long id) throws ArtigoMedicoInexistenteException {
        List<ArtigoMedicoListar> retorno = new ArrayList<ArtigoMedicoListar>();
        ArtigoMedico pesquisa = repositorioArtigoMedico.findById(id);
        if(pesquisa==null)
            throw new ArtigoMedicoInexistenteException();
        ArtigoMedicoListar dl = new ArtigoMedicoListar();        
        dl.setId(pesquisa.getId());
        dl.setTiposDeNotificacao(pesquisa.getTiposDeNotificacao().getId());
        dl.setTiposDeNotificacaoNome(pesquisa.getTiposDeNotificacao().getNome());                                     
        dl.setColaboradorNotificante(pesquisa.getColaboradorNotificante());
        dl.setCodProduto(pesquisa.getCodProduto());
        dl.setNome(pesquisa.getNome());
        dl.setFabricante(pesquisa.getFabricante());
        dl.setRegAnvisa(pesquisa.getRegAnvisa());
        dl.setLoteNSerie(pesquisa.getLoteNSerie());
        dl.setValidade(pesquisa.getValidade());
        dl.setEstoqueSetor(pesquisa.getEstoqueSetor());
        dl.setCentroCusto(pesquisa.getCentroCusto());
        dl.setAspectoAlterado(pesquisa.isAspectoAlterado());
        dl.setCorpoEstranho(pesquisa.isCorpoEstranho()); 
        dl.setProbRotulo(pesquisa.isProbRotulo()); 
        dl.setEsterilizacaoVencida(pesquisa.isEsterilizacaoVencida()); 
        dl.setValidadeVencida(pesquisa.isValidadeVencida()); 
        dl.setReprocessado(pesquisa.isReprocessado()); 
        dl.setRachaduraQuebra(pesquisa.isRachaduraQuebra()); 
        dl.setQtdeMenor(pesquisa.isQtdeMenor()); 
        dl.setOutros(pesquisa.getOutros());
        dl.setEnvioAmostra(pesquisa.isEnvioAmostra()); 
        dl.setDescricao(pesquisa.getDescricao());
        dl.setProvidenciasAdotadas(pesquisa.getProvidenciasAdotadas());
        dl.setDanoPaciente(pesquisa.isDanoPaciente()); 
        dl.setAtendida(pesquisa.isAtendida());
        
        retorno.add(dl);
        return retorno;        
         
         
    }
    
}
