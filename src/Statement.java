public abstract class Statement {

    public String value(Customer aCustomer) {
        StringBuilder result = new StringBuilder();
        
        result.append(header(aCustomer));

        for (Rental each : aCustomer.getRentals()) {
            result.append(eachRental(each));
        }

        result.append(footer(aCustomer));

        return result.toString();
    }

    protected abstract String header(Customer aCustomer);
    protected abstract String eachRental(Rental rental);
    protected abstract String footer(Customer aCustomer);

}
