public class Number {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public interface CalculationOperation {
        Number calc(Number x, Number y);
    }
    public abstract class AbstractCalculator {
        protected CalculationOperation add;
        protected CalculationOperation subtract;
        protected CalculationOperation multiply;
        protected CalculationOperation divide;
    }
}
