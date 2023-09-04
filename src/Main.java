public class Main {
    public static void main(String[] args) {

        Filme filme = new Filme("Vingadores: Ultimato", "Anthony Russo, Joe Russo", 182, "Ação", 15.0);


        Cinema cinema = new Cinema("Cineplex", "123 Main St", 100);


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
}