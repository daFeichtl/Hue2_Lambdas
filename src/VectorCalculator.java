public class VectorCalculator extends AbstractCalculator {
    public VectorCalculator(Number.CalculationOperation add, Number.CalculationOperation subtract, Number.CalculationOperation multiply, Number.CalculationOperation divide) {
        super(add, subtract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        Number.CalculationOperation add = (x,y) -> {
            Number ad = new Number();
            ad.setA(x.getA()+y.getA());
            ad.setB(x.getB()+y.getB());
            return ad;
        };
        return add.calc(a,b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        Number.CalculationOperation sub = (x,y) -> {
            Number su = new Number();
            su.setA(x.getA()-y.getA());
            su.setB(x.getB()-y.getB());
            return su;
        };
        return sub.calc(a,b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        Number.CalculationOperation mul = (x,y) -> {
            Number mu = new Number();
            mu.setA(x.getA()*y.getB());
            mu.setB(x.getB()*y.getA());
            return mu;
        };
        return mul.calc(a,b);
    }

    @Override
    public Number divide(Number a, Number b) {
        Number.CalculationOperation div = (x,y) -> {
            Number di = new Number();
            di.setA(x.getA()*y.getB());
            di.setB(x.getB()*y.getA());
            return di;
        };
        return div.calc(a,b);
    }
}
