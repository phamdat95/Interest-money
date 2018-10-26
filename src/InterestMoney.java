import java.util.Scanner;

public class InterestMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money: ");
        double money = scanner.nextDouble();
        System.out.println("Enter month: ");
        int month = scanner.nextInt();
        System.out.println("Enter interest rate: ");
        double interestRate = scanner.nextDouble();

        double interestMoney = 0;
        for(int i = 0; i < month; i++){
            interestMoney = money * (interestRate/100)/12 * 3;
        }
        System.out.println("Total of interest: " + interestMoney);
    }
}
