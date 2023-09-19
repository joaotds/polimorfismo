package modelo;

public class Produto {
    private String descricao;
    private String unidadeMedida;

    public Produto(String descricao, String unidadeMedida) {
        this.descricao = descricao;
        this.unidadeMedida = unidadeMedida;
    }

    public String getDados() {
        return "Descrição: " + descricao + ", Unidade de Medida: " + unidadeMedida;
    }
}
