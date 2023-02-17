package FactoryDesignPattern;

public class SelectNetworkFactory {
    public CellularPlan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("abcNetwork")) {
            return new ABCNetwork();
        } else if (planType.equalsIgnoreCase("xyzNetwork")) {
            return new XYZNetwork();
        } else if (planType.equalsIgnoreCase("pqrNetwork")) {
            return new PQRNetwork();
        }
        return null;
    }
}
