public abstract class AbstractCalculator {
    protected Number.CalculationOperation add;
    protected Number.CalculationOperation subtract;
    protected Number.CalculationOperation multiply;
    protected Number.CalculationOperation divide;

    public AbstractCalculator(Number.CalculationOperation add, Number.CalculationOperation subtract, Number.CalculationOperation multiply, Number.CalculationOperation divide) {
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
