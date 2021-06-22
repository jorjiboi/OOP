public class RegularPaymentCalculator implements PaymentCalculator{

    @Override
    public double calculatePayment(int regularHoursWorked, double regularRates,
                                   int overtimeHoursWorked, double overtimeRates) {

        return regularHoursWorked * regularRates + overtimeHoursWorked * overtimeRates;

    }
}
