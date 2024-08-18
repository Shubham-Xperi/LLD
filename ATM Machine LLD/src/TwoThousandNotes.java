public class TwoThousandNotes extends AtmMachine {
    public TwoThousandNotes(Currency currency) {
        super(currency);
    }

    @Override
    public int exchangeNotes(int amount) {

        int totalNotes =  amount / 2000;
        System.out.println("2000 rupees notes: " + totalNotes);
        return amount % 2000;
    }
}
