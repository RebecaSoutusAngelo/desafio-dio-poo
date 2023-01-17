package br.com.dio.desafio.dominio;
//mentorias e cursos são conteúdos
public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public java.lang.String getTitulo() {
        return titulo;
    }

    public void setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
    }

    public privte getString() {
        return String;
    }

    public void setString(privte string) {
        String = string;
    }
}
