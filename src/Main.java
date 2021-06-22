import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PaymentCalculator paymentCalculator = new RegularPaymentCalculator();
        Scanner sc = new Scanner(System.in);


        System.out.println("Input regular hours worked: ");
        int regularHoursWorked = sc.nextInt();
        System.out.println("Input old regular rates: ");
        double regularRates = sc.nextDouble();
        System.out.println("Input overtime hours worked: ");
        int overtimeHoursWorked = sc.nextInt();
        System.out.println("Input old overtime rates: ");
        double overtimeRates = sc.nextDouble();
        System.out.println("Input new regular rates: ");
        double newRegularRates = sc.nextDouble();
        System.out.println("Input new overtime rates: ");
        double newOvertimeRates = sc.nextDouble();
        PaymentDecorator paymentDecorator = new ModifyPayRateCalculator(paymentCalculator,
                newRegularRates, newOvertimeRates);

        double payment = paymentDecorator.calculatePayment(regularHoursWorked, regularRates, overtimeHoursWorked, overtimeRates);

        System.out.println("Total amount paid: " + payment + " BGN.");
    }
}
