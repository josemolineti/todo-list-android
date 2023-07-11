package com.example.listadetarefas;

import java.util.Calendar;

public class TaskActivity {
    private String id;
    private String titulo;
    private String prioridade;
    private Calendar data;
    private String dataFormat;
    private Calendar conclusao;
    private String conclusaoFormat;
    private String descricao;
    private boolean concluido = false;

    public TaskActivity() {

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Calendar getConclusao() {
        return conclusao;
    }

    public void setConclusao(Calendar conclusao) {
        this.conclusao = conclusao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public String getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    public String getConclusaoFormat() {
        return conclusaoFormat;
    }

    public void setConclusaoFormat(String conclusaoFormat) {
        this.conclusaoFormat = conclusaoFormat;
    }
}


