public class TemporaryEmployee extends Empoloyee {

    private static final double TAX10 = 0.9;

    public TemporaryEmployee(double grossSalary, String name) {
        super(grossSalary, name);
    }

    public double calculateNetSalary() {
        return getGrossSalary()*TAX10;
    }
}
