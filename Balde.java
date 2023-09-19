package modelo;

public class Balde extends Produto {
    private int capacidade;

    public Balde(String descricao, String unidadeMedida, int capacidade) {
        super(descricao, unidadeMedida);
        this.capacidade = capacidade;
    }

    
    public String getDados() {
        return super.getDados() + ", Capacidade: " + capacidade + " litros";
    }
}
