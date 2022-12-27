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
    private static double smallSalarysDepartament;
    private static int smallSalarysDepartamentCout;

    private static double highSalarysDepartament;
    private static int highSalarysDepartamentCout;

    private static double allSalarysDepartament;
    private static int allSalarysDepartamentCout;
    private static double index;
    private static int allDepartamentCount;
    public Employee(String name, int departament, int salaty) {
        id++;
        this.name = name;
        this.departament = departament;
        this.salary = salaty;
        this.a = id;

    }
    public static void printAll() {
        System.out.println();
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employees = Main.employees[i];
            System.out.println(employees);
        }
    }

    public static void calculateSalary() {
        System.out.println();
        allSalarys = 0;
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employee = Main.employees[i];
            allSalarys += employee.getSalary();
        }
        System.out.println("Затраты на зарплаты сотрудникам составляют: " + allSalarys + " рублей.");
    }

    public static void lookingSmallSalary() {
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

    public static void lookingHighSalarys() {
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

    public static void lookingAverageSalary() {
        System.out.println();
        averageSalary = allSalarys / id;
        System.out.println("Среднее значение зарплат составляет " + averageSalary + " рублей.");
    }

    public static void printOnlyNames() {
        System.out.println();
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employees = Main.employees[i];
            System.out.println("ФИО: " + employees.getName());
        }
    }

    public static void raiseSalary() {
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employees = Main.employees[i];
            upSalarys = employees.getSalary();
            upSalarys = upSalarys * 1.1;
            employees.setSalary(upSalarys);
            Main.employees[i] = employees;
        }
    }
    public static void lookingSmallsalaryDepartament(int departament) {
        System.out.println();
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employees = Main.employees[i];
            if (departament == employees.getDepartament()) {
                Main.salarysDepartament[smallSalarysDepartamentCout]=employees;
                smallSalarysDepartamentCout++;
            }
        }
        Employee employees=Main.salarysDepartament[0];
        smallSalarysDepartament=employees.getSalary();
        for (int i = 0; i < smallSalarysDepartamentCout; i++) {
            Employee employeess=Main.salarysDepartament[i];
            if (smallSalarysDepartament>employeess.getSalary()){
                smallSalarysDepartament=employeess.getSalary();
            }
        }
        System.out.println("Наименьшая зарплата по отделу №"+departament+" составляет "+smallSalarysDepartament+" рублей.");
    }
    public static void lookingHighsalaryDepartament(int departament) {
        System.out.println();
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employees = Main.employees[i];
            if (departament == employees.getDepartament()) {
                Main.salarysDepartament[highSalarysDepartamentCout]=employees;
                highSalarysDepartamentCout++;
            }
        }
        Employee employees=Main.salarysDepartament[0];
        highSalarysDepartament=employees.getSalary();
        for (int i = 0; i < highSalarysDepartamentCout; i++) {
            Employee employeess=Main.salarysDepartament[i];
            if (highSalarysDepartament<employeess.getSalary()){
                highSalarysDepartament=employeess.getSalary();
            }
        }
        System.out.println("Наибольшая зарплата по отделу №"+departament+" Составляет "+highSalarysDepartament+" рублей.");
    }
    public static void calculateAllSalarysDepartament(int departament){
        System.out.println();
        allSalarysDepartament=0;
        allSalarysDepartamentCout=0;
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employees = Main.employees[i];
            if (departament == employees.getDepartament()) {
                Main.salarysDepartament[allSalarysDepartamentCout]=employees;
                allSalarysDepartamentCout++;
            }
        }
        for (int i = 0; i < allSalarysDepartamentCout; i++) {
            Employee employees = Main.salarysDepartament[i];
            allSalarysDepartament+=employees.getSalary();
        }
        System.out.println("Общие затраты на зарплату по отделу №"+departament+" составляет "+allSalarysDepartament+" рублей.");
    }
    public static void lookingAverageSalarysDepartament(int departament){
        System.out.println();
        allSalarysDepartament=0;
        allSalarysDepartamentCout=0;
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employees = Main.employees[i];
            if (departament == employees.getDepartament()) {
                Main.salarysDepartament[allSalarysDepartamentCout]=employees;
                allSalarysDepartamentCout++;
            }
        }
        for (int i = 0; i < allSalarysDepartamentCout; i++) {
            Employee employees = Main.salarysDepartament[i];
            allSalarysDepartament+=employees.getSalary();
        }
        allSalarysDepartament=allSalarysDepartament/allSalarysDepartamentCout;
        System.out.println("Средняя зарплата по отделу №"+departament+" составляет "+allSalarysDepartament+" рублей.");
    }
    public static void raiseAllSalarysDepartament(int departament,double index){
        System.out.println();
        allSalarysDepartament=0;
        allSalarysDepartamentCout=0;
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employees = Main.employees[i];
            if (departament == employees.getDepartament()) {
                Main.salarysDepartament[allSalarysDepartamentCout]=employees;
                allSalarysDepartamentCout++;
            }
        }
        for (int i = 0; i < allSalarysDepartamentCout; i++) {
            Employee employees = Main.salarysDepartament[i];
            employees.setSalary(employees.getSalary()*index);
            Main.salarysDepartament[i]=employees;
        }
        for (int i = 0; i < allSalarysDepartamentCout; i++) {
            Employee employees=Main.salarysDepartament[i];
            Main.employees[employees.getA()-1]=Main.salarysDepartament[i];
        }
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employees = Main.employees[i];
            System.out.println(employees);
        }
    }
    public static void printDepartament(int departament){
        System.out.println();
        allDepartamentCount=0;
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employees = Main.employees[i];
            if (departament == employees.getDepartament()) {
                Main.salarysDepartament[allDepartamentCount]=employees;
                allDepartamentCount++;
            }
        }
        for (int i = 0; i <allDepartamentCount ; i++) {
            Employee employees = Main.salarysDepartament[i];
            System.out.println("id: "+employees.getA()+" ФИО: "+employees.getName()+" Зарплата: "+employees.getSalary());
        }
    }
    public static void lookingSalaryLessCount(int count){
        System.out.println();
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employees=Main.employees[i];
            if (count>employees.getSalary()){
                System.out.println("id: "+employees.getA()+" ФИО: "+employees.getName()+" Зарплата: "+employees.getSalary());
            }
        }
    }
    public static void lookingSalaryMoreCount(int count){
        System.out.println();
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employees=Main.employees[i];
            if (count<employees.getSalary()){
                System.out.println("id: "+employees.getA()+" ФИО: "+employees.getName()+" Зарплата: "+employees.getSalary());
            }
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