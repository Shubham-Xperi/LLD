public enum Currency {
    HUNDREDS(1000),
    FIVE_HUNDRED(500),
    TWO_THOUSAND(2000);

    private int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
