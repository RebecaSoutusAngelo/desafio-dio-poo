package br.com.dio.desafio.dominio;
//mentorias e cursos são conteúdos
public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    private Object String;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void setDescricao(String descricao) {this.descricao = descricao;}
}
