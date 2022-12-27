public class Main {
    static Employee[] employees;
    static Employee[] salarysDepartament;
    static Employee[] allDepartament;
    private static int place=0;
    private static int id=0;
    public static void addStaff(String name, int departament, int salaty) {
        if (place >= 10) {
            System.out.println("Нельзя добавить работника, закончилось место");
        }
        id = place;
        Employee newEmployee = new Employee(name, departament, salaty);
        Main.employees[place++] = newEmployee;
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
        Employee.printAll();
        Employee.calculateSalary();
        Employee.lookingSmallSalary();
        Employee.lookingHighSalarys();
        Employee.lookingAverageSalary();
        Employee.printOnlyNames();
        Employee.raiseSalary();
        Employee.printAll();
        Employee.lookingSmallsalaryDepartament(2);
        Employee.lookingHighsalaryDepartament(1);
        Employee.calculateAllSalarysDepartament(1);
        Employee.lookingAverageSalarysDepartament(1);
        Employee.raiseAllSalarysDepartament(1,1.1);
        Employee.printDepartament(1);
        Employee.lookingSalaryLessCount(13000);
        Employee.lookingSalaryMoreCount(13000);
    }
}