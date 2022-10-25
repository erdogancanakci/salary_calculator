package Pract;

public class CompanyApp {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setName("kemal");
        e.setSalary(2000);
        e.setWorkHours(45);
        e.setHireYear(1985);

        e.toString();
    }
}
