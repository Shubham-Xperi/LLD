public abstract class AtmMachine {
    private Currency currency;
    private AtmMachine nextNote;

    AtmMachine(Currency currency) {
        this.currency = currency;
    }

    public void setNextNote(AtmMachine nextNote) {
        this.nextNote = nextNote;
    }

    public AtmMachine getNextNote() {
        return nextNote;
    }

    public void redeemNotes(Currency currency, int amount) {
        if (amount >= this.currency.ordinal()) {
            amount =  exchangeNotes(amount);
        }
        if (this.nextNote != null) {
            this.nextNote.redeemNotes(currency, amount);
        }
    }

    public abstract int exchangeNotes(int amount);
}
