package homework39.euro_enum_hashSet;

public enum EuroCurrency {

    USD("US Dollar", 0.85),
    GBP("British Pound", 1.15),
    JPY("Japanese Yen", 0.0078),
    CHF("Swiss Franc", 0.93),
    AUD("Australian Dollar", 0.63),
    CAD("Canadian Dollar", 0.67),
    CNY("Chinese Yuan", 0.13);

    private final String name;
    private final double rateToEuro;

    EuroCurrency(String name, double rateToEuro) {
        this.name = name;
        this.rateToEuro = rateToEuro;
    }

    public String getName() {
        return name;
    }

    public double getRateToEuro() {
        return rateToEuro;
    }

    public double convertToEuro(double amount) {
        return amount * rateToEuro;
    }

    @Override
    public String toString() {
        return String.format("%s (%s): %.4f EUR", name, this.name(), rateToEuro);
    }
}

