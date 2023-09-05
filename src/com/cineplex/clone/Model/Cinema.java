package com.cineplex.clone.Model;

public class Cinema {

    private String nome;
    private String endereco;
    private int capacidade;
    private Filme filmeEmExibicao;
    private int ingressosVendidos;

    public Cinema(String nome, String endereco, int capacidade) {
        this.nome = nome;
        this.endereco = endereco;
        this.capacidade = capacidade;
        this.ingressosVendidos = 0;
    }

    public void exibirDetalhes() {
        System.out.println("Nome do com.cineplex.clone.Model.Cinema: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Capacidade: " + capacidade + " lugares");
        System.out.println("com.cineplex.clone.Model.Filme em Exibição:");
        filmeEmExibicao.exibirDetalhes();
    }

    public boolean venderIngresso() {
        if (ingressosVendidos < capacidade) {
            ingressosVendidos++;
            return true;
        } else {
            System.out.println("Capacidade esgotada! Não é possível vender mais ingressos.");
            return false;
        }
    }

    public void setFilmeEmExibicao(Filme filmeEmExibicao) {
        this.filmeEmExibicao = filmeEmExibicao;
    }

    public static void main(String[] args) {
        Filme filme = new Filme("Vingadores: Ultimato", "Anthony Russo, Joe Russo", 182, "Ação", 15.0);
        Cinema cinema = new Cinema("Cineplex", "123 com.cineplex.clone.Main.Main St", 100);

        cinema.setFilmeEmExibicao(filme);

        System.out.println("Bem-vindo ao site de compra de ingressos!");
        cinema.exibirDetalhes();


        for (int i = 0; i < cinema.getCapacidade(); i++) {
            boolean vendido = cinema.venderIngresso();
            if (!vendido) {
                break;
            }
        }

        System.out.println("\nIngressos Vendidos: " + cinema.getIngressosVendidos());
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }
}
