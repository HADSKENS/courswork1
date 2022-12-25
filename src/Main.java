public class Main {
    static Employee[] employees;
    static Employee[] salarysDepartament;
    static Employee[] allDepartament;

    public static void main(String[] args) {
        employees = new Employee[10];
        salarysDepartament=new Employee[10];
        allDepartament=new Employee[10];
        Employee.addStaff("Авдеев Александр Константинович", 3, 25000);
        Employee.addStaff("Любимов Артур Иванович", 2, 12000);
        Employee.addStaff("Воронцова Евгения Ярославовна", 2, 10000);
        Employee.addStaff("Смирнов Ростисал Арсентьевич", 1, 40000);
        Employee.addStaff("Сорокин Макар Александрович", 1, 100000);
        Employee.addStaff("Фомина Алиса Никитична", 1, 20000);
        Employee.addStaff("Ульянов Фёдор Степанович", 4, 28000);
        Employee.addStaff("Комиссарова Ангелина Даниловна", 5, 32000);
        Employee.addStaff("Родионов Владислав Григорьевич", 4, 26000);
        Employee.addStaff("Смирнов Иван Даниилович", 1, 10000);
        Employee.printAll();
        Employee.allSalary();
        Employee.smallSalary();
        Employee.highSalarys();
        Employee.averageSalary();
        Employee.onlyNames();
        Employee.upSalary();
        Employee.printAll();
        Employee.smallsalaryDepartament(2);
        Employee.highsalaryDepartament(1);
        Employee.allSalarysDepartament(1);
        Employee.averageSalarysDepartament(1);
        Employee.allupSalarysDepartament(1,1.1);
        Employee.printDepartament(1);
        Employee.salarylesscount(13000);
        Employee.salarymorecount(13000);
    }
}