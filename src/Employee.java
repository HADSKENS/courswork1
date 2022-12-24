public class Employee {
    private static int id = 0;
    private String name;
    private int departament;
    private double salary;
    private static int place;
    private int a;
    private static int allSalarys;
    private static double smallSalarys;
    private static String smallSalatysName;
    private static double highSalarys;
    private static String highSlarysName;
    private static int averageSalary;
    private static String onlynames;
    private static double upSalarys;

    public Employee(String name, int departament, int salaty) {
        id++;
        this.name = name;
        this.departament = departament;
        this.salary = salaty;
        this.a = id;

    }

    public static void addStaff(String name, int departament, int salaty) {
        if (place >= 10) {
            System.out.println("Нельзя добавить работника, закончилось место");
        }
        id = place;
        Employee newEmployee = new Employee(name, departament, salaty);
        Main.employees[place++] = newEmployee;
    }

    public static void printAll() {
        System.out.println();
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employees = Main.employees[i];
            System.out.println(employees);
        }
    }

    public static void allSalary() {
        System.out.println();
        allSalarys = 0;
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employee = Main.employees[i];
            allSalarys += employee.getSalary();
        }
        System.out.println("Затраты на зарплаты сотрудникам составляют: " + allSalarys + " рублей.");
    }

    public static void smallSalary() {
        System.out.println();
        Employee first = Main.employees[0];
        smallSalarys = first.getSalary();
        smallSalatysName = first.getName();
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employees = Main.employees[i];
            if (smallSalarys > employees.getSalary()) {
                smallSalarys = employees.getSalary();
                smallSalatysName = employees.getName();
            }
        }
        System.out.println("Сотрудник с наименьшей зарплатой " + smallSalatysName + " размер зарплаты " + smallSalarys + " рублей.");
    }

    public static void highSalarys() {
        System.out.println();
        Employee first = Main.employees[0];
        highSalarys = first.getSalary();
        highSlarysName = first.getName();
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employees = Main.employees[i];
            if (highSalarys < employees.getSalary()) {
                highSalarys = employees.getSalary();
                highSlarysName = employees.getName();
            }
        }
        System.out.println("Сотрудник с наибольшей зарплатой " + highSlarysName + " размер зарплаты " + highSalarys + " рублей.");
    }

    public static void averageSalary() {
        System.out.println();
        averageSalary = allSalarys / id;
        System.out.println("Среднее значение зарплат составляет " + averageSalary + " рублей.");
    }

    public static void onlyNames() {
        System.out.println();
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employees = Main.employees[i];
            System.out.println("ФИО: " + employees.getName());
        }
    }

    public static void upSalary() {
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employees = Main.employees[i];
            upSalarys = employees.getSalary();
            upSalarys = upSalarys * 1.1;
            employees.setSalary(upSalarys);
            Main.employees[i] = employees;
        }
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