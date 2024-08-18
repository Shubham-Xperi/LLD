public class AtmMachineChain {

    public static AtmMachine startAtmMachine() {
        AtmMachine hundredNotes = new HundredNotes(Currency.HUNDREDS);
        AtmMachine fiveHundredNotes = new FiveHundredNotes(Currency.FIVE_HUNDRED);
        AtmMachine twoThousandNotes = new TwoThousandNotes(Currency.TWO_THOUSAND);

        twoThousandNotes.setNextNote(fiveHundredNotes);
        fiveHundredNotes.setNextNote(hundredNotes);

        return twoThousandNotes;
    }
}
