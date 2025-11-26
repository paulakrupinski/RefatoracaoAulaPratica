import java.util.List;
import java.util.ArrayList;

class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        double totalAmount = 0; // total a pagar
        int frequentRenterPoints = 0; // pontos do cliente
        StringBuilder result = new StringBuilder("Registro de Aluguel para " + getName() + "\n");

        for (Rental each : rentals) {
            
            double thisAmount = each.getCharge();

          
            frequentRenterPoints += each.getFrequentRenterPoints();

            
            result.append("\t")
                  .append(each.getMovie().getTitle())
                  .append("\t")
                  .append(thisAmount)
                  .append("\n");

            totalAmount += thisAmount;
        }

        result.append("Valor devido é ").append(totalAmount).append("\n");
        result.append("Você ganhou ").append(frequentRenterPoints).append(" pontos de fidelidade");

        return result.toString();
    }

    public String getName() {
        return name;
    }
}
