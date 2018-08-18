import java.util.Arrays;
import java.util.Objects;

public class Company {

    private int index;
    private final int MAX_NR_OF_wORKERS = 5;

    private Empoloyee[] employees;



    public Company() {
       this.employees= new Empoloyee[MAX_NR_OF_wORKERS];
       this.index =0;
    }



    public void addEmployee(Empoloyee employee) {
        if (index < employees.length) {
            employees[index++] = employee;
        }else return;

    }

    public void removeEmployee(Empoloyee employee) {
        if (index >0){
            boolean found = false;
            int ind =0;
            while (ind<employees.length){
                if (employee.equals(employees[ind])){
                    System.arraycopy(employee,ind +1, employee, employees.length -1, ind);
                    found = true;
                } else ind++;
            }
        }
    }

    ;

//    public Empoloyee getEmployee(int index){
//

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return index == company.index &&
                MAX_NR_OF_wORKERS == company.MAX_NR_OF_wORKERS &&
                Arrays.equals(employees, company.employees);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(index, MAX_NR_OF_wORKERS);
        result = 31 * result + Arrays.hashCode(employees);
        return result;
    }

//        return 0; }

    @Override
    public String toString() {
        return "Company{" +
                "index=" + index +
                ", MAX_NR_OF_wORKERS=" + MAX_NR_OF_wORKERS +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }

    public static void main(String[] args) {

        int sum =0;

        Company company = new Company();
       company.addEmployee(new FullTimeEmploye(5600, "Marcin"));
       company.addEmployee(new Student(4100, "Kyubi"));
       company.addEmployee(new TemporaryEmployee(3800, "Kasia"));
       company.addEmployee(new FullTimeEmploye(7100, "Micia"));
       company.addEmployee(new Student(4100, "Tygrys"));
       company.addEmployee(new TemporaryEmployee(14800, "Pinky"));

       for (int i =0; i < company.MAX_NR_OF_wORKERS; i++){
           sum=sum+company.

       }


















    }
};




