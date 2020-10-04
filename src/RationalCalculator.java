public class RationalCalculator extends AbstractCalculator {
    public RationalCalculator(Number.CalculationOperation add, Number.CalculationOperation subtract, Number.CalculationOperation multiply, Number.CalculationOperation divide) {
        super(add, subtract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        Number.CalculationOperation add = (Number x, Number y) -> {
            Number ad = new Number();
            ad.setA(x.getA()+y.getA());
            ad.setB(x.getB()+y.getB());
            return ad;
        };
        return add.calc(a,b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        Number.CalculationOperation add = (Number x, Number y) -> {
            Number su = new Number();
            su.setA(x.getA()-y.getA());
            su.setB(x.getB()-y.getB());
            return su;
        };
        return add.calc(a,b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        Number.CalculationOperation add = (Number x, Number y) -> {
            Number mu = new Number();
            mu.setB(x.getB()*y.getB());
            mu.setA(x.getA()*y.getA());
            return mu;
        };
        return add.calc(a,b);
    }

    @Override
    public Number divide(Number a, Number b) {
        Number.CalculationOperation add = (Number x, Number y) -> {
            Number di = new Number();
            di.setA(x.getA()/y.getA());
            di.setB(x.getB()/y.getB());
            return di;
        };
        return add.calc(a,b);
    }
}
