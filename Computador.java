package modelo;

public class Computador extends Produto {
    private String processador;
    private String memoria;

    public Computador(String descricao, String unidadeMedida, String processador, String memoria) {
        super(descricao, unidadeMedida);
        this.processador = processador;
        this.memoria = memoria;
    }

    public String getDados() {
        return super.getDados() + ", Processador: " + processador + ", Memória: " + memoria;
    }
}

