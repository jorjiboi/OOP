public class ModifyPayRateCalculator extends PaymentDecorator{


    private double newRegularRate;
    private double newOvertimeRate;
    private final PaymentCalculator paymentCalculator;

    public ModifyPayRateCalculator(PaymentCalculator paymentCalculator, double newRegularRate, double newOvertimeRate) {
        super(paymentCalculator);
        this.paymentCalculator = paymentCalculator;
        this.newRegularRate = newRegularRate;
        this.newOvertimeRate = newOvertimeRate;
    }

    @Override
    public double calculatePayment(int regularHoursWorked, double regularRates,
                                   int overtimeHoursWorked, double overtimeRates) {

        System.out.println("Old regular rates: " + regularRates + " BGN.");
        System.out.println("Old overtime rates: " + overtimeRates + " BGN.");
        System.out.println("New regular rates: " + newRegularRate + " BGN.");
        System.out.println("New overtime rates: " + newOvertimeRate + " BGN.");

        return paymentCalculator.calculatePayment(regularHoursWorked, newRegularRate, overtimeHoursWorked, newOvertimeRate);
    }
}

