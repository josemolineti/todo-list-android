package com.example.listadetarefas;

import java.util.Calendar;

public class TaskActivity {
    private String titulo;
    private String prioridade;
    private Calendar data;
    private Calendar meta;
    private String descricao;

    public TaskActivity() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendar getMeta() {
        return meta;
    }

    public void setMeta(Calendar meta) {
        this.meta = meta;
    }
}


