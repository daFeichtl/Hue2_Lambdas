public class ComplexCalculator extends AbstractCalculator{

    public ComplexCalculator() {
        super((Number x, Number y) -> {
            Number ad = new Number();
            ad.setA(x.getA() + y.getA());
            ad.setB(x.getB() + y.getB());
            return ad;
        }, (Number x, Number y) -> {
            Number su = new Number();
            su.setA(x.getA() - y.getA());
            su.setB(x.getB() - y.getB());
            return su;
        }, (Number x, Number y) -> {
            Number mu = new Number();
            mu.setA(x.getA() * y.getA()-x.getB() * y.getB());
            mu.setB(x.getA() * y.getB()+x.getB() * y.getA());
            return mu;
        }, (Number x, Number y) -> {
            Number di = new Number();
            di.setA(x.getA()*y.getA() + x.getB()*y.getB() / y.getA()*y.getA() + y.getB()*y.getB());
            di.setB(x.getB()*y.getA() - x.getA()*y.getB() / y.getA()*y.getA() + y.getB()*y.getB());
            return di;
        });
    }

    @Override
    public Number add(Number a, Number b) {
        return add.calc(a,b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return subtract.calc(a,b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return multiply.calc(a,b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide.calc(a,b);
    }
}
