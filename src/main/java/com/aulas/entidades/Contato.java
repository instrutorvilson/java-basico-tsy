package com.aulas.entidades;

import java.util.List;

public class Contato {
    private String nome;
    private String sobreNome;
    private int idade;

    public Contato() {
    }

    public Contato(String nome, String sobreNome, int idade) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
    }

    public String verificaIdade(){
        String msg = "maior";
        if(idade < 17){
            msg = "menor";
        }
        return msg;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
