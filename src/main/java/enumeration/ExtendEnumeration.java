package enumeration;

/**
 * Created by merkushev.io on 18.06.2016.
 */

interface Operation {
    double apply(double x, double y);
}

public enum ExtendEnumeration implements Operation {

    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    };


    private final String symbol;

    ExtendEnumeration(String s) {
        this.symbol = s;
    }

    @Override
    public String toString() {
        return symbol;
    }
}

enum AdvancedExtendEnumeration implements Operation {
    EXP("^"){
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    },
    REMAINDER("%"){
        public double apply(double x, double y) {
            return x % y;
        }
    };

    private final String symbol;
    AdvancedExtendEnumeration(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}