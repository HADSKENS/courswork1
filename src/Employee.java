public class Employee {
    private static int id=0;
    private String name;
    private int departament;
    private double salaty;
    private static int place;
    private int a;
    private static int allSalatys;
    private static double smallSalatys;
    private static String smallSalatysName;
    private static double highSalatys;
    private static String highSlatysName;
    private static int averageSalaty;
    private static String onlynames;
    private static double upSalatys;
    public Employee(String name, int departament, int salaty) {
        id++;
        this.name = name;
        this.departament = departament;
        this.salaty = salaty;
        this.a=id;

    }
    public static void addStaff(String name, int departament, int salaty) {
        if (place >= 10) {
            System.out.println("Нельзя добавить работника, закончилось место");
        }
        id=place;
        Employee newEmployee = new Employee(name, departament,salaty);
        Main.employee[place++] = newEmployee;
    }

    public static void printAll() {
        System.out.println();
        for (int i = 0; i < Main.employee.length; i++) {
            Employee employees = Main.employee[i];
            System.out.println(employees);
        }
    }
    public static void allSalaty(){
        System.out.println();
        allSalatys=0;
        for (int i = 0; i < Main.employee.length; i++) {
            Employee employee=Main.employee[i];
            allSalatys+= employee.getSalaty();
        }
        System.out.println("Затраты на зарплаты сотрудникам составляют: "+allSalatys+" рублей.");
    }
    public static void smallSalaty(){
        System.out.println();
        Employee first=Main.employee[0];
        smallSalatys= first.getSalaty();
        smallSalatysName=first.getName();
        for (int i = 0; i < Main.employee.length; i++) {
            Employee employees=Main.employee[i];
            if (smallSalatys>employees.getSalaty()){
                smallSalatys=employees.getSalaty();
                smallSalatysName=employees.getName();
            }
        }
        System.out.println("Наименьшая зарплата у "+smallSalatysName+" она составляет "+smallSalatys+" рублей.");
    }
    public static void highSalatys(){
        System.out.println();
        Employee first=Main.employee[0];
        highSalatys=first.getSalaty();
        highSlatysName=first.getName();
        for (int i = 0; i < Main.employee.length; i++) {
            Employee employees=Main.employee[i];
            if (highSalatys<employees.getSalaty()){
                highSalatys=employees.getSalaty();
                highSlatysName=employees.getName();
            }
        }
        System.out.println("Наибольшая зарплата у "+highSlatysName+" она составляет "+highSalatys+" рублей.");
    }
    public static void averageSalaty(){
        System.out.println();
        averageSalaty=allSalatys/id;
        System.out.println("Среднее значение зарплат составляет "+averageSalaty+" рублей.");
    }
    public static void onlyNames(){
        System.out.println();
        for (int i = 0; i < Main.employee.length; i++) {
            Employee employees=Main.employee[i];
            System.out.println("ФИО: "+employees.getName());
        }
    }
    public static void upSalaty(){
        for (int i = 0; i < Main.employee.length; i++) {
            Employee employees = Main.employee[i];
            upSalatys= employees.getSalaty();
            upSalatys=upSalatys*1.1;
            employees.setSalaty(upSalatys);
            Main.employee[i]=employees;
        }
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
    public int getDepartament(){
        return departament;
    }
    public double getSalaty(){
        return salaty;
    }
    public int getPlace(){
        return place;
    }
    public int getA(){
        return a;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalaty(double salaty) {
        this.salaty = salaty;
    }
    @Override
    public String toString(){
        return "id: "+a+" ФИО: "+name+" Номер департамента: "+departament+" Зарплата: "+salaty;
    }
}
