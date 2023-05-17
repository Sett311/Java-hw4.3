public class CreditPaymentService {
    public float calculate(int credit, int year) {
        short months = (short) (year * 12);
        float interestRate = 9.99F;
        float i = interestRate /100 * 12;
        double payment = credit * Math.pow(i, months) / (1 -  Math.pow(1 + i, -months));
        return (float) payment;
    }
}
// А=К*(П/(1+П)-М-1), где К – сумма кредита, П – процентная ставка, М – количество месяцев
// Sе = S*P /12*(1+P/12)N/((1+P/12)N -1)