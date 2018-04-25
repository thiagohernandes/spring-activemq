package com.br.spring.activemq.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.io.Serializable;
import java.util.List;

@JsonInclude(Include.ALWAYS)
public class Funcionario implements Serializable {

    private String nome;
    private Double salario;
    private Double[] valores;
    private List<Transacao> listaTransacoes;

    public Funcionario(){

    }

    public Funcionario(String nome, Double salario, Double[] valores){
        this.nome = nome;
        this.salario = salario;
        this.valores = valores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double[] getValores() {
        return valores;
    }

    public void setValores(Double[] valores) {
        this.valores = valores;
    }

    public List<Transacao> getListaTransacoes() {
        return listaTransacoes;
    }

    public void setListaTransacoes(List<Transacao> listaTransacoes) {
        this.listaTransacoes = listaTransacoes;
    }
}
