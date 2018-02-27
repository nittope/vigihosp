/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hmv.vigihosphmv.listar;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Marcus Vinícius <vinimarcus02@gmail.com>
 */
public class ArtigoMedicoListar implements Serializable{
    
    private Long id;
    private Long tiposDeNotificacao;
    private String tiposDeNotificacaoNome;
    private String colaboradorNotificante;
    private String codProduto;
    private String nome;
    private String fabricante;
    private String regAnvisa;
    private String loteNSerie;
    private Date validade;
    private String estoqueSetor;
    private String centroCusto;
    private boolean aspectoAlterado;
    private boolean corpoEstranho;
    private boolean probRotulo;
    private boolean esterilizacaoVencida;
    private boolean validadeVencida;
    private boolean reprocessado;
    private boolean rachaduraQuebra;
    private boolean qtdeMenor;
    private String outros;
    private boolean envioAmostra;
    private String descricao;
    private String providenciasAdotadas;
    private boolean danoPaciente;
    private boolean atendida;

    public ArtigoMedicoListar(Long id, Long tiposDeNotificacao, String tiposDeNotificacaoNome, String colaboradorNotificante, String codProduto, String nome, String fabricante, String regAnvisa, String loteNSerie, Date validade, String estoqueSetor, String centroCusto, boolean aspectoAlterado, boolean corpoEstranho, boolean probRotulo, boolean esterilizacaoVencida, boolean validadeVencida, boolean reprocessado, boolean rachaduraQuebra, boolean qtdeMenor, String outros, boolean envioAmostra, String descricao, String providenciasAdotadas, boolean danoPaciente, boolean atendida) {
        this.id = id;
        this.tiposDeNotificacao = tiposDeNotificacao;
        this.tiposDeNotificacaoNome = tiposDeNotificacaoNome;
        this.colaboradorNotificante = colaboradorNotificante;
        this.codProduto = codProduto;
        this.nome = nome;
        this.fabricante = fabricante;
        this.regAnvisa = regAnvisa;
        this.loteNSerie = loteNSerie;
        this.validade = validade;
        this.estoqueSetor = estoqueSetor;
        this.centroCusto = centroCusto;
        this.aspectoAlterado = aspectoAlterado;
        this.corpoEstranho = corpoEstranho;
        this.probRotulo = probRotulo;
        this.esterilizacaoVencida = esterilizacaoVencida;
        this.validadeVencida = validadeVencida;
        this.reprocessado = reprocessado;
        this.rachaduraQuebra = rachaduraQuebra;
        this.qtdeMenor = qtdeMenor;
        this.outros = outros;
        this.envioAmostra = envioAmostra;
        this.descricao = descricao;
        this.providenciasAdotadas = providenciasAdotadas;
        this.danoPaciente = danoPaciente;
        this.atendida = atendida;
    }

    public ArtigoMedicoListar() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTiposDeNotificacao() {
        return tiposDeNotificacao;
    }

    public void setTiposDeNotificacao(Long tiposDeNotificacao) {
        this.tiposDeNotificacao = tiposDeNotificacao;
    }

    public String getTiposDeNotificacaoNome() {
        return tiposDeNotificacaoNome;
    }

    public void setTiposDeNotificacaoNome(String tiposDeNotificacaoNome) {
        this.tiposDeNotificacaoNome = tiposDeNotificacaoNome;
    }

    public String getColaboradorNotificante() {
        return colaboradorNotificante;
    }

    public void setColaboradorNotificante(String colaboradorNotificante) {
        this.colaboradorNotificante = colaboradorNotificante;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getRegAnvisa() {
        return regAnvisa;
    }

    public void setRegAnvisa(String regAnvisa) {
        this.regAnvisa = regAnvisa;
    }

    public String getLoteNSerie() {
        return loteNSerie;
    }

    public void setLoteNSerie(String loteNSerie) {
        this.loteNSerie = loteNSerie;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getEstoqueSetor() {
        return estoqueSetor;
    }

    public void setEstoqueSetor(String estoqueSetor) {
        this.estoqueSetor = estoqueSetor;
    }

    public String getCentroCusto() {
        return centroCusto;
    }

    public void setCentroCusto(String centroCusto) {
        this.centroCusto = centroCusto;
    }

    public boolean isAspectoAlterado() {
        return aspectoAlterado;
    }

    public void setAspectoAlterado(boolean aspectoAlterado) {
        this.aspectoAlterado = aspectoAlterado;
    }

    public boolean isCorpoEstranho() {
        return corpoEstranho;
    }

    public void setCorpoEstranho(boolean corpoEstranho) {
        this.corpoEstranho = corpoEstranho;
    }

    public boolean isProbRotulo() {
        return probRotulo;
    }

    public void setProbRotulo(boolean probRotulo) {
        this.probRotulo = probRotulo;
    }

    public boolean isEsterilizacaoVencida() {
        return esterilizacaoVencida;
    }

    public void setEsterilizacaoVencida(boolean esterilizacaoVencida) {
        this.esterilizacaoVencida = esterilizacaoVencida;
    }

    public boolean isValidadeVencida() {
        return validadeVencida;
    }

    public void setValidadeVencida(boolean validadeVencida) {
        this.validadeVencida = validadeVencida;
    }

    public boolean isReprocessado() {
        return reprocessado;
    }

    public void setReprocessado(boolean reprocessado) {
        this.reprocessado = reprocessado;
    }

    public boolean isRachaduraQuebra() {
        return rachaduraQuebra;
    }

    public void setRachaduraQuebra(boolean rachaduraQuebra) {
        this.rachaduraQuebra = rachaduraQuebra;
    }

    public boolean isQtdeMenor() {
        return qtdeMenor;
    }

    public void setQtdeMenor(boolean qtdeMenor) {
        this.qtdeMenor = qtdeMenor;
    }

    public String getOutros() {
        return outros;
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }

    public boolean isEnvioAmostra() {
        return envioAmostra;
    }

    public void setEnvioAmostra(boolean envioAmostra) {
        this.envioAmostra = envioAmostra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getProvidenciasAdotadas() {
        return providenciasAdotadas;
    }

    public void setProvidenciasAdotadas(String providenciasAdotadas) {
        this.providenciasAdotadas = providenciasAdotadas;
    }

    public boolean isDanoPaciente() {
        return danoPaciente;
    }

    public void setDanoPaciente(boolean danoPaciente) {
        this.danoPaciente = danoPaciente;
    }

    public boolean isAtendida() {
        return atendida;
    }

    public void setAtendida(boolean atendida) {
        this.atendida = atendida;
    }
    
    
    
}
