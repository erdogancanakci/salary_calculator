package Pract;

public class Employee {
    private String m_name;
    private double m_salary;

    private int m_workHours;
    private int m_hireYear;

    public double tax() {
        if (m_salary < 1000)
            return 0;
        else
            return m_salary * 0.03;
    }
    public double bonus () {
        if(m_workHours > 40)
            return (m_workHours - 40) * 30;
        else
            return 0;
    }


    public int getTotalHireYear () {
        return 2021 - getHireYear();
    }

    public double raiseSalary () {
        if (getTotalHireYear() < 10)
            return m_salary * 0.05;
        else if (getTotalHireYear() > 9 && getTotalHireYear() < 20)
            return m_salary * 0.1;
        else
            return m_salary * 0.15;
    }

    public String toString () {
        return System.out.printf("adı:%s%nmaaş:%.00f%nçalışma saati: %d%nbaşlangıc yılı: %d%nvergi: %.00f%nbonus: %.00f%nmaaş artışı: %.00f%n" +
                        "vergi ve bonusla toplam maaş: %.00f%ntoplam maaş: %.00f%n",
                getName(), getSalary(),getWorkHours(), getHireYear(), tax(), bonus(), raiseSalary(), (tax() + bonus() + getSalary())
        ,(tax() + bonus() + getSalary() + raiseSalary())).toString();
    }

    public String getName() {
        return m_name;
    }

    public void setName(String m_name) {
        this.m_name = m_name;
    }

    public double getSalary() {
        return m_salary;
    }

    public void setSalary(int salary) {
        this.m_salary = salary;
    }

    public int getWorkHours() {
        return m_workHours;
    }

    public void setWorkHours(int workHours) {
        this.m_workHours = workHours;
    }

    public int getHireYear() {
        return m_hireYear;
    }


    public void setHireYear(int hireYear) {
        this.m_hireYear = hireYear;
    }
}
