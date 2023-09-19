package modelo;

public class Livro extends Produto {
    private String autor;

    public Livro(String descricao, String unidadeMedida, String autor) {
        super(descricao, unidadeMedida);
        this.autor = autor;
    }

    public String getDados() {
        return super.getDados() + ", Autor: " + autor;
    }
}
