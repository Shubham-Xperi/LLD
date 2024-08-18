import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Starting ATM Machine");
        AtmMachine machine = AtmMachineChain.startAtmMachine();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount = sc.nextInt();

        if (amount % 100 != 0 || amount > 100000) {
            System.out.println("Invalid amount");
            return;
        }
        machine.redeemNotes(Currency.TWO_THOUSAND, amount);
    }
}
