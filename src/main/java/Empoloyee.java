public abstract class Empoloyee {

    private double grossSalary;
    private String name;

    public double getGrossSalary() {
        return grossSalary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Empoloyee{" +
                "grossSalary=" + grossSalary +
                ", name='" + name + '\'' +
                '}';
    }

    public Empoloyee(double grossSalary, String name) {
        this.grossSalary = grossSalary;
        this.name = name;
    }

    public abstract double calculateNetSalary();
}
