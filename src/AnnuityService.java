public class AnnuityService {
    public int calculate(int loan, int years, float interest) {
        // monthly interest value i
        float i = interest / 100 / 12;
        return (int) (loan * (i + i / (Math.pow(1 + i, 12 * years) - 1)));
    }
}
