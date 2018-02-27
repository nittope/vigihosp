/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hmv.vigihosphmv.listar;

import java.io.Serializable;

/**
 *
 * @author Marcus Vinícius <vinimarcus02@gmail.com>
 */
public class TiposDeNotificacaoListar implements Serializable{
    
    private Long id;
    private String nome;
    private String urlDeAcesso;

    public TiposDeNotificacaoListar(Long id, String nome, String urlDeAcesso) {
        this.id = id;
        this.nome = nome;
        this.urlDeAcesso = urlDeAcesso;
    }

    public TiposDeNotificacaoListar() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrlDeAcesso() {
        return urlDeAcesso;
    }

    public void setUrlDeAcesso(String urlDeAcesso) {
        this.urlDeAcesso = urlDeAcesso;
    }
    
    
    
}
