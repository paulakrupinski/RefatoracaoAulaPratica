public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("Matrix", Movie.REGULAR);
        Movie m2 = new Movie("Vingadores", Movie.NEW_RELEASE);
        Movie m3 = new Movie("Toy Story", Movie.CHILDRENS);

        Rental r1 = new Rental(m1, 3);
        Rental r2 = new Rental(m2, 2);
        Rental r3 = new Rental(m3, 4);

        Customer c = new Customer("Paula");
        c.addRental(r1);
        c.addRental(r2);
        c.addRental(r3);

        System.out.println("=== TEXTO ===");
        System.out.println(c.statement());

        System.out.println("\n=== HTML ===");
        System.out.println(c.htmlStatement());
    }
}
