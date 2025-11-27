public class HtmlStatement extends Statement {

    @Override
    protected String header(Customer aCustomer) {
        return "<h1>Rental Record for <em>" + aCustomer.getName() + "</em></h1><p>\n";
    }

    @Override
    protected String eachRental(Rental rental) {
        return rental.getMovie().getTitle() + ": " + rental.getCharge() + "<br>\n";
    }

    @Override
    protected String footer(Customer aCustomer) {
        return "<p>You owe <em>" + aCustomer.getTotalCharge() + "</em><br>\n" +
               "On this rental you earned <em>" +
               aCustomer.getTotalFrequentRenterPoints() +
               "</em> frequent renter points<p>\n";
    }
}
