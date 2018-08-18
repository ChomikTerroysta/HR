public class FullTimeEmploye extends Empoloyee {

    private static final double TAX20 = 0.80;
    private static final double ZUS = 1000;
    public FullTimeEmploye(double grossSalary, String name) {
        super(grossSalary, name);
    }

    public double calculateNetSalary() {
        return (getGrossSalary()-ZUS) *TAX20;
    }
}
