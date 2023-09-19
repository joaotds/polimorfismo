package execucao;

import modelo.Balde;
import modelo.Computador;
import modelo.Livro;
import modelo.Produto;

public class Exec {
    public static void main(String[] args) {
        Produto produto = new Produto("canetinha", "unidade");
        Livro livro = new Livro("Dom Casmurro", "livro", "Machado de Assis");
        Computador computador = new Computador("Notebook", "unidade", "Intel i5", "8GB RAM");
        Balde balde = new Balde("Balde de Tinta", "unidade", 5);

        System.out.println("Dados do Produto: " + produto.getDados());
        System.out.println("Dados do Livro: " + livro.getDados());
        System.out.println("Dados do Computador: " + computador.getDados());
        System.out.println("Dados do Balde: " + balde.getDados());
    }
}

