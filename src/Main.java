public class Main {

    public static void main(String[] args) {

        
        Movie filme1 = new Movie("O Poderoso Chefão", Movie.REGULAR);
        Movie filme2 = new Movie("Vingadores: Ultimato", Movie.NEW_RELEASE);
        Movie filme3 = new Movie("Procurando Nemo", Movie.CHILDRENS);

        
        Rental aluguel1 = new Rental(filme1, 3); // 3 dias
        Rental aluguel2 = new Rental(filme2, 2); // 2 dias
        Rental aluguel3 = new Rental(filme3, 4); // 4 dias

        
        Customer cliente = new Customer("Paula Krupinski");

        
        cliente.addRental(aluguel1);
        cliente.addRental(aluguel2);
        cliente.addRental(aluguel3);

       
        System.out.println("=== Extrato em Texto ===");
        System.out.println(cliente.statement());

      
        System.out.println("\n=== Extrato em HTML ===");
        System.out.println(cliente.htmlStatement());
    }
}
