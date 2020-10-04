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

        public AbstractCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
            this.add = add;
            this.subtract = subtract;
            this.multiply = multiply;
            this.divide = divide;
        }
        public abstract Number add(Number a, Number b);
        public abstract Number subtract(Number a, Number b);
        public abstract Number multiply(Number a, Number b);
        public abstract Number divide(Number a, Number b);

    }
}
