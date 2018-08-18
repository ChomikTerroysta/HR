public class Student extends Empoloyee {

    private static final double TAX05 = 0.95;

    public Student(double grossSalary, String name) {
        super(grossSalary, name);
    }

    public double calculateNetSalary() {
        return getGrossSalary()*TAX05;
    }
}
