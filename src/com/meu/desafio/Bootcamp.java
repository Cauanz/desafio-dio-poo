package com.meu.desafio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {

    private String nome;
    private String descricao;
    private Set<Dev> alunosInscritos = new HashSet<>();
    private Set<Conteudo> conteudosBootcamp = new LinkedHashSet<>();
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Dev> getAlunosInscritos() {
        return alunosInscritos;
    }

    public void setAlunosInscritos(Set<Dev> alunosInscritos) {
        this.alunosInscritos = alunosInscritos;
    }

    public Set<Conteudo> getConteudosBootcamp() {
        return conteudosBootcamp;
    }

    public void setConteudosBootcamp(Set<Conteudo> conteudosBootcamp) {
        this.conteudosBootcamp = conteudosBootcamp;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal);
    }
}
