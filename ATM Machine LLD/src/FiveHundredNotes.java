public class FiveHundredNotes extends AtmMachine {
    public FiveHundredNotes(Currency currency) {
        super(currency);
    }
    @Override
    public int exchangeNotes(int amount) {

        int totalNotes =  amount / 500;
        int leftAmount = amount % 500;
        System.out.println("500 rupees notes: " + totalNotes);
        return leftAmount;
    }
}
