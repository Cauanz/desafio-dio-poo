package com.meu.desafio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Dev {

    private String nome;
    List<Conteudo> conteudosInscritos = new ArrayList<>();
    List<Conteudo> conteudosFinalizados = new LinkedList<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudosBootcamp());
    }

    public void progredir() {
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosFinalizados.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.out.println("Voce não está inscrito em nenhum conteudo");
        }
    }

    public double calcularTotalXp() {
        return this.conteudosFinalizados.stream().mapToDouble(cont -> cont.calcularXp()).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(List<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public List<Conteudo> getConteudosFinalizados() {
        return conteudosFinalizados;
    }

    public void setConteudosFinalizados(List<Conteudo> conteudosFinalizados) {
        this.conteudosFinalizados = conteudosFinalizados;
    }
}
