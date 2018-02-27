/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hmv.vigihosphmv.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Marcus Vinícius <vinimarcus02@gmail.com>
 */
@Entity
public class TiposDeNotificacao implements Serializable{
   
    private Long id;
    private String nome;
    private String urlDeAcesso;
    private List<ArtigoMedico> artigoMedico;

    public TiposDeNotificacao(String nome, String urlDeAcesso) {
        this.nome = nome;
        this.urlDeAcesso = urlDeAcesso;
        this.artigoMedico = new ArrayList<ArtigoMedico>();
    }

    public TiposDeNotificacao() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    
    
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "tiposDeNotificacao")
    public List<ArtigoMedico> getArtigoMedico() {
        return artigoMedico;
    }

    public void setArtigoMedico(List<ArtigoMedico> artigoMedico) {
        this.artigoMedico = artigoMedico;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + Objects.hashCode(this.urlDeAcesso);
        hash = 17 * hash + Objects.hashCode(this.artigoMedico);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TiposDeNotificacao other = (TiposDeNotificacao) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.urlDeAcesso, other.urlDeAcesso)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.artigoMedico, other.artigoMedico)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
