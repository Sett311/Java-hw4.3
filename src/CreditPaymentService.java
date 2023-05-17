public class CreditPaymentService {
    public double calculate(int credit, int year) {
        short months = (short) (year * 12);
        float interestRate = 9.99F;
        double i = Math.pow(1 + (interestRate / 100 / 12), months);
        return Math.ceil(credit * (interestRate / 100 / 12 * i) / (i - 1));
    }
}
// А=К*(П/(1+П)-М-1), где К – сумма кредита, П – процентная ставка, М – количество месяцев
// Sе = S*P /12*(1+P/12)N/((1+P/12)N -1)