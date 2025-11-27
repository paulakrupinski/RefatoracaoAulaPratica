public class Main {
    public static void main(String[] args) {
        Customer c = new Customer("João");
        c.addRental(new Rental(new Movie("Matrix", Movie.NEW_RELEASE), 3));
        c.addRental(new Rental(new Movie("Carros", Movie.CHILDRENS), 4));
        c.addRental(new Rental(new Movie("Vingadores", Movie.REGULAR), 1));

        System.out.println(c.statement());
        System.out.println(c.htmlStatement());
    }
}
