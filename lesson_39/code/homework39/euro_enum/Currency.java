package homework39.euro_enum;

public enum Currency {

    USD("US Dollar", 0.85),
    GBP("British Pound", 1.15),
    JPY("Japanese Yen", 0.0078),
    CHF("Swiss Franc", 0.93),
    AUD("Australian Dollar", 0.63),
    CAD("Canadian Dollar", 0.67),
    CNY("Chinese Yuan", 0.13);

    private final String name;
    private final double rateToEuro;

    Currency(String name, double rateToEuro) {
        this.name = name;
        this.rateToEuro = rateToEuro;
    }

    public String getName() {
        return name;
    }

    public double getRateToEuro() {
        return rateToEuro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name)
                .append(" (")
                .append(this.name())
                .append("): ")
                .append(String.format("%.4f EUR", rateToEuro));
        return sb.toString();
    }
}
