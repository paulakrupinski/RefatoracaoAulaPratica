public class Main {
    public static void main(String[] args) {

       
        Customer cliente = new Customer("João");

       
        Movie matrix = new Movie("Matrix", Movie.NEW_RELEASE);
        Movie carros = new Movie("Carros", Movie.CHILDRENS);
        Movie vingadores = new Movie("Vingadores", Movie.REGULAR);

       
        cliente.addRental(new Rental(matrix, 3));      
        cliente.addRental(new Rental(carros, 2));      
        cliente.addRental(new Rental(vingadores, 4)); 
        
          Movie novo = new Movie("Duna 2", Movie.NEW_RELEASE);

        System.out.println(novo.getFrequentRenterPoints(1)); // 1
        System.out.println(novo.getFrequentRenterPoints(3)); // 2


        
        System.out.println(cliente.statement());
    }
}
