public class Employee {
    private static int id = 0;
    private String name;
    private int departament;
    private double salary;
    private int a;
    public Employee(String name, int departament, int salaty) {
        id++;
        this.name = name;
        this.departament = departament;
        this.salary = salaty;
        this.a = id;

    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getDepartament() {
        return departament;
    }

    public double getSalary() {
        return salary;
    }

    public int getPlace() {
        return place;
    }

    public int getA() {
        return a;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(double salaty) {
        this.salary = salaty;
    }

    @Override
    public String toString() {
        return "id: " + a + " ФИО: " + name + " Номер департамента: " + departament + " Зарплата: " + salary;
    }
}