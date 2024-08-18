public class HundredNotes extends AtmMachine {
    public HundredNotes(Currency currency) {
        super(currency);
    }

    @Override
    public int exchangeNotes(int amount) {

        int totalNotes =  amount / 100;
        System.out.println("100 rupees notes: " + totalNotes);
        int leftAmount = amount % 100;
        return leftAmount;
    }
}
