public abstract class PaymentDecorator implements PaymentCalculator {

    protected PaymentCalculator paymentCalculator;

    public PaymentDecorator(PaymentCalculator paymentCalculator) {
        this.paymentCalculator = paymentCalculator;
    }

    @Override
    public double calculatePayment(int regularHoursWorked, double regularRates,
                                   int overtimeHoursWorked, double overtimeRates) {

        return paymentCalculator.calculatePayment(regularHoursWorked, regularRates, overtimeHoursWorked, overtimeRates);
    }
}
