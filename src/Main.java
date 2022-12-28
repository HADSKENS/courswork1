public class Main {
    static Employee[] employees;
    static Employee[] salarysDepartament;
    static Employee[] allDepartament;
    private static int place=0;
    private static int id=0;

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
    public static void addStaff(String name, int departament, int salary) {
        if (place >= 10) {
            System.out.println("Нельзя добавить работника, закончилось место");
        }
        Employee newEmployee = new Employee(name,departament,salary);
        id = place;
        employees[place++] =newEmployee;
    }
    public static void printAll() {
        System.out.println();
        for (int i = 0; i < Main.employees.length; i++) {
            Employee newEmployee = employees[i];
            System.out.println(newEmployee);
        }
    }

    public static void calculateSalary() {
        System.out.println();
        allSalarys = 0;
        for (int i = 0; i < Main.employees.length; i++) {
            Employee newEmployee = employees[i];
            allSalarys += newEmployee.getSalary();
        }
        System.out.println("Затраты на зарплаты сотрудникам составляют: " + allSalarys + " рублей.");
    }

    public static void lookingSmallSalary() {
        System.out.println();
        Employee first = employees[0];
        smallSalarys = first.getSalary();
        smallSalatysName = first.getName();
        for (int i = 0; i < employees.length; i++) {
            Employee newEmployee = employees[i];
            if (smallSalarys > newEmployee.getSalary()) {
                smallSalarys = newEmployee.getSalary();
                smallSalatysName = newEmployee.getName();
            }
        }
        System.out.println("Сотрудник с наименьшей зарплатой " + smallSalatysName + " размер зарплаты " + smallSalarys + " рублей.");
    }

    public static void lookingHighSalarys() {
        System.out.println();
        Employee first = Main.employees[0];
        highSalarys = first.getSalary();
        highSlarysName = first.getName();
        for (int i = 0; i < employees.length; i++) {
            Employee newEmployee = employees[i];
            if (highSalarys < newEmployee.getSalary()) {
                highSalarys = newEmployee.getSalary();
                highSlarysName = newEmployee.getName();
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
        for (int i = 0; i < employees.length; i++) {
            Employee newEmployee = employees[i];
            System.out.println("ФИО: " + newEmployee.getName());
        }
    }

    public static void raiseSalary() {
        for (int i = 0; i < employees.length; i++) {
            Employee newEmployee = employees[i];
            upSalarys = newEmployee.getSalary();
            upSalarys = upSalarys * 1.1;
            newEmployee.setSalary(upSalarys);
            employees[i] = newEmployee;
        }
    }
    public static void lookingSmallsalaryDepartament(int departament) {
        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            Employee newEmployee = employees[i];
            if (departament == newEmployee.getDepartament()) {
                salarysDepartament[smallSalarysDepartamentCout]=newEmployee;
                smallSalarysDepartamentCout++;
            }
        }
        Employee newEmployee=salarysDepartament[0];
        smallSalarysDepartament=newEmployee.getSalary();
        for (int i = 0; i < smallSalarysDepartamentCout; i++) {
            Employee newEmployees=salarysDepartament[i];
            if (smallSalarysDepartament>newEmployees.getSalary()){
                smallSalarysDepartament=newEmployees.getSalary();
            }
        }
        System.out.println("Наименьшая зарплата по отделу №"+departament+" составляет "+smallSalarysDepartament+" рублей.");
    }
    public static void lookingHighsalaryDepartament(int departament) {
        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            Employee newEmployee = employees[i];
            if (departament == newEmployee.getDepartament()) {
                salarysDepartament[highSalarysDepartamentCout]=newEmployee;
                highSalarysDepartamentCout++;
            }
        }
        Employee newEmployee=salarysDepartament[0];
        highSalarysDepartament=newEmployee.getSalary();
        for (int i = 0; i < highSalarysDepartamentCout; i++) {
            newEmployee=salarysDepartament[i];
            if (highSalarysDepartament<newEmployee.getSalary()){
                highSalarysDepartament=newEmployee.getSalary();
            }
        }
        System.out.println("Наибольшая зарплата по отделу №"+departament+" Составляет "+highSalarysDepartament+" рублей.");
    }
    public static void calculateAllSalarysDepartament(int departament){
        System.out.println();
        allSalarysDepartament=0;
        allSalarysDepartamentCout=0;
        for (int i = 0; i < employees.length; i++) {
            Employee newEmployee = employees[i];
            if (departament == newEmployee.getDepartament()) {
                salarysDepartament[allSalarysDepartamentCout]=newEmployee;
                allSalarysDepartamentCout++;
            }
        }
        for (int i = 0; i < allSalarysDepartamentCout; i++) {
            Employee newEmployee = salarysDepartament[i];
            allSalarysDepartament+=newEmployee.getSalary();
        }
        System.out.println("Общие затраты на зарплату по отделу №"+departament+" составляет "+allSalarysDepartament+" рублей.");
    }
    public static void lookingAverageSalarysDepartament(int departament){
        System.out.println();
        allSalarysDepartament=0;
        allSalarysDepartamentCout=0;
        for (int i = 0; i < employees.length; i++) {
            Employee newEmployee = employees[i];
            if (departament == newEmployee.getDepartament()) {
                salarysDepartament[allSalarysDepartamentCout]=newEmployee;
                allSalarysDepartamentCout++;
            }
        }
        for (int i = 0; i < allSalarysDepartamentCout; i++) {
            Employee newEmployee = salarysDepartament[i];
            allSalarysDepartament+=newEmployee.getSalary();
        }
        allSalarysDepartament=allSalarysDepartament/allSalarysDepartamentCout;
        System.out.println("Средняя зарплата по отделу №"+departament+" составляет "+allSalarysDepartament+" рублей.");
    }
    public static void raiseAllSalarysDepartament(int departament,double index){
        System.out.println();
        allSalarysDepartament=0;
        allSalarysDepartamentCout=0;
        for (int i = 0; i < employees.length; i++) {
            Employee newEmployee = employees[i];
            if (departament == newEmployee.getDepartament()) {
                salarysDepartament[allSalarysDepartamentCout]=newEmployee;
                allSalarysDepartamentCout++;
            }
        }
        for (int i = 0; i < allSalarysDepartamentCout; i++) {
            Employee newEmployee = salarysDepartament[i];
            newEmployee.setSalary(newEmployee.getSalary()*index);
            salarysDepartament[i]=newEmployee;
        }
        for (int i = 0; i < allSalarysDepartamentCout; i++) {
            Employee newEmployee=salarysDepartament[i];
            employees[newEmployee.getA()-1]=salarysDepartament[i];
        }
        for (int i = 0; i < employees.length; i++) {
            Employee newEmployee = employees[i];
            System.out.println(newEmployee);
        }
    }
    public static void printDepartament(int departament){
        System.out.println();
        allDepartamentCount=0;
        for (int i = 0; i < employees.length; i++) {
            Employee newEmployee = employees[i];
            if (departament == newEmployee.getDepartament()) {
                salarysDepartament[allDepartamentCount]=newEmployee;
                allDepartamentCount++;
            }
        }
        for (int i = 0; i <allDepartamentCount ; i++) {
            Employee newEmployee = salarysDepartament[i];
            System.out.println("id: "+newEmployee.getA()+" ФИО: "+newEmployee.getName()+" Зарплата: "+newEmployee.getSalary());
        }
    }
    public static void lookingSalaryLessCount(int count){
        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            Employee newEmployee=employees[i];
            if (count>newEmployee.getSalary()){
                System.out.println("id: "+newEmployee.getA()+" ФИО: "+newEmployee.getName()+" Зарплата: "+newEmployee.getSalary());
            }
        }
    }
    public static void lookingSalaryMoreCount(int count){
        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            Employee newEmployee=employees[i];
            if (count<newEmployee.getSalary()){
                System.out.println("id: "+newEmployee.getA()+" ФИО: "+newEmployee.getName()+" Зарплата: "+newEmployee.getSalary());
            }
        }
    }
    public static void main(String[] args) {
        employees = new Employee[10];
        salarysDepartament=new Employee[10];
        allDepartament=new Employee[10];
        addStaff("Авдеев Александр Константинович", 3, 25000);
        addStaff("Любимов Артур Иванович", 2, 12000);
        addStaff("Воронцова Евгения Ярославовна", 2, 10000);
        addStaff("Смирнов Ростисал Арсентьевич", 1, 40000);
        addStaff("Сорокин Макар Александрович", 1, 100000);
        addStaff("Фомина Алиса Никитична", 1, 20000);
        addStaff("Ульянов Фёдор Степанович", 4, 28000);
        addStaff("Комиссарова Ангелина Даниловна", 5, 32000);
        addStaff("Родионов Владислав Григорьевич", 4, 26000);
        addStaff("Смирнов Иван Даниилович", 1, 10000);
        printAll();
        calculateSalary();
        lookingSmallSalary();
        lookingHighSalarys();
        lookingAverageSalary();
        printOnlyNames();
        raiseSalary();
        printAll();
        lookingSmallsalaryDepartament(2);
        lookingHighsalaryDepartament(1);
        calculateAllSalarysDepartament(1);
        lookingAverageSalarysDepartament(1);
        raiseAllSalarysDepartament(1,1.1);
        printDepartament(1);
        lookingSalaryLessCount(13000);
        lookingSalaryMoreCount(13000);
    }
}