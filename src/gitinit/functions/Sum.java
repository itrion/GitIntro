package gitinit.functions;

import gitinit.Function;

public class Sum implements Function {
    private Number numberA;
    private Number numberB;

    public Sum(Number numberA, Number numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    @Override
    public Number solve() {
        return numberA.intValue() + numberB.intValue();
    }
}
