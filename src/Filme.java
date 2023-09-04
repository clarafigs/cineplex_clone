public class Filme {
    private String titulo;
    private String diretor;
    private int duracaoMinutos;
    private String genero;
    private double precoIngresso;

    public Filme(String titulo, String diretor, int duracaoMinutos, String genero, double precoIngresso) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracaoMinutos = duracaoMinutos;
        this.genero = genero;
        this.precoIngresso = precoIngresso;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracaoMinutos + " minutos");
        System.out.println("Gênero: " + genero);
        System.out.println("Preço do Ingresso: R$" + precoIngresso);
    }
}


