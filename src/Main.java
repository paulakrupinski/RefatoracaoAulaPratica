public class Main {
    public static void main(String[] args) {

        
        Movie m1 = new Movie("Carros", Movie.CHILDRENS);
        Movie m2 = new Movie("Vingadores", Movie.NEW_RELEASE);
        Movie m3 = new Movie("Matrix", Movie.REGULAR);

       
        Rental r1 = new Rental(m1, 4); 
        Rental r2 = new Rental(m2, 3); 
        Rental r3 = new Rental(m3, 1); 

       
        Customer cliente = new Customer("Paula");

       
        cliente.addRental(r1);
        cliente.addRental(r2);
        cliente.addRental(r3);

        
        System.out.println(cliente.statement());
    }
}
