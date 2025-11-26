public class Main {
    public static void main(String[] args) {

        // Criando filmes
        Movie filme1 = new Movie("Matrix", Movie.REGULAR);
        Movie filme2 = new Movie("Frozen", Movie.CHILDRENS);
        Movie filme3 = new Movie("Vingadores: Ultimato", Movie.NEW_RELEASE);

        // Criando aluguéis (Rental)
        Rental aluguel1 = new Rental(filme1, 3); // 3 dias
        Rental aluguel2 = new Rental(filme2, 4); // 4 dias
        Rental aluguel3 = new Rental(filme3, 2); // 2 dias

        // Criando cliente
        Customer cliente = new Customer("Paula");

        // Adicionando aluguéis ao cliente
        cliente.addRental(aluguel1);
        cliente.addRental(aluguel2);
        cliente.addRental(aluguel3);

        // Gerando relatório
        System.out.println(cliente.statement());
    }
}
