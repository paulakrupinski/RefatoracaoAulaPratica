import java.util.List;
import java.util.ArrayList;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }


    public String statement() {

        StringBuilder result = new StringBuilder("Registro de Aluguéis de " + getName() + "\n");

        for (Rental each : rentals) {
            result.append("\t")
                  .append(each.getMovie().getTitle())
                  .append("\t")
                  .append(each.getCharge())
                  .append("\n");
        }

        result.append("Valor total devido: ").append(getTotalCharge()).append("\n");
        result.append("Pontos conquistados: ").append(getTotalFrequentRenterPoints());

        return result.toString();
    }

    
    public String htmlStatement() {

        StringBuilder result = new StringBuilder(
            "<H1>Aluguéis de <EM>" + getName() + "</EM></H1><P>\n"
        );

        for (Rental each : rentals) {
            result.append(each.getMovie().getTitle())
                  .append(": ")
                  .append(each.getCharge())
                  .append("<BR>\n");
        }

        result.append("<P>Você deve <EM>")
              .append(getTotalCharge())
              .append("</EM><P>\n");

        result.append("Nesta locação você conquistou <EM>")
              .append(getTotalFrequentRenterPoints())
              .append("</EM> pontos de fidelidade<P>");

        return result.toString();
    }

    
    private double getTotalCharge() {
        double result = 0;
        for (Rental each : rentals) {
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        for (Rental each : rentals) {
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}
