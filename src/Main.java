public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie("O Poderoso Chefão", Movie.REGULAR);
        Movie movie2 = new Movie("Frozen", Movie.CHILDRENS);
        Movie movie3 = new Movie("Homem-Aranha: Sem Volta Para Casa", Movie.NEW_RELEASE);

        Rental rental1 = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie2, 4);
        Rental rental3 = new Rental(movie3, 2);

        Customer customer = new Customer("Paula");

        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        System.out.println("===== Usando Customer.statement() =====");
        System.out.println(customer.statement());

        System.out.println("\n===== Usando Customer.htmlStatement() =====");
        System.out.println(customer.htmlStatement());

        
        System.out.println("\n===== Testando TextStatement diretamente =====");
        TextStatement ts = new TextStatement();
        System.out.println(ts.value(customer));

        System.out.println("\n===== Testando HtmlStatement diretamente =====");
        HtmlStatement hs = new HtmlStatement();
        System.out.println(hs.value(customer));
    }
}
