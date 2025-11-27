public class Main {
    public static void main(String[] args) {
     
        Movie movie1 = new Movie("O Poderoso Chefão", Movie.REGULAR);
        Movie movie2 = new Movie("Frozen", Movie.CHILDRENS);
        Movie movie3 = new Movie("Homem-Aranha: Sem Volta Para Casa", Movie.NEW_RELEASE);

       
        Rental rental1 = new Rental(movie1, 3); // 3 dias
        Rental rental2 = new Rental(movie2, 4); // 4 dias
        Rental rental3 = new Rental(movie3, 2); // 2 dias

        
        Customer customer = new Customer("Paula");

     
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

       
        System.out.println("===== Declaração em Texto =====");
        System.out.println(customer.statement());

       
        System.out.println("\n===== Declaração em HTML =====");
        System.out.println(customer.htmlStatement());
    }
}
