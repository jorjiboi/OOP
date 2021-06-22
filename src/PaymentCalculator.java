public interface PaymentCalculator {

    public double calculatePayment(int regularHoursWorked, double regularRates,
                                   int overtimeHoursWorked, double overtimeRates);
}
