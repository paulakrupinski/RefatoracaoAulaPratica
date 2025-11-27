public class Main {
    public static void main(String[] args) {

        Movie regular = new Movie("Filme Regular", Movie.REGULAR);
        Movie childrens = new Movie("Filme Infantil", Movie.CHILDRENS);
        Movie newRelease = new Movie("Lançamento", Movie.NEW_RELEASE);

        System.out.println("=== Teste da Refatoração (getCharge movido para Price) ===");

        System.out.println("Regular (3 dias): " + regular.getCharge(3));        // Esperado: 3.5
        System.out.println("Infantil (4 dias): " + childrens.getCharge(4));     // Esperado: 3.0
        System.out.println("Lançamento (2 dias): " + newRelease.getCharge(2));  // Esperado: 6.0
    }
}
