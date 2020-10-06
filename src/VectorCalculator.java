public class VectorCalculator extends AbstractCalculator {
    public VectorCalculator() {
        super((x,y) -> {
            Number ad = new Number();
            ad.setA(x.getA()+y.getA());
            ad.setB(x.getB()+y.getB());
            return ad;
        }, (x,y) -> {
            Number su = new Number();
            su.setA(x.getA()-y.getA());
            su.setB(x.getB()-y.getB());
            return su;
        },  (x,y) -> {
            Number mu = new Number();
            mu.setA((x.getA()*y.getA())+(x.getB()*y.getB()));
            mu.setB(0.0);
            return mu;
        }, (x,y) -> {
            Number di = new Number();
            di.setA(x.getA()*y.getB());
            di.setB(y.getA()*x.getB());
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
