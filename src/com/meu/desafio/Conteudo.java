package com.meu.desafio;

public abstract class Conteudo {

    private String titulo;
    private String description;
    protected final static double XP_PADRAO = 10.0;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Conteudo{" +
                "titulo='" + titulo + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
