public class Main {
    static Employee[] employee;
    public static void main(String[] args){
        employee = new Employee[10];
        Employee.addStaff("Авдеев Александр Константинович",3,25000);
        Employee.addStaff("Любимов Артур Иванович",2,12000);
        Employee.addStaff("Воронцова Евгения Ярославовна",2,10000);
        Employee.addStaff("Смирнов Ярослав Арсентьевич",1,40000);
        Employee.addStaff("Сорокин Макар Александрович",1,100000);
        Employee.addStaff("Фомина Алиса Никитична",1,20000);
        Employee.addStaff("Ульянов Фёдор Степанович",4,28000);
        Employee.addStaff("Комиссарова Ангелина Даниловна",5,32000);
        Employee.addStaff("Родионов Владислав Григорьевич",4,26000);
        Employee.addStaff("Смирнов Иван Даниилович",1,10000);
        Employee.printAll();
        Employee.allSalaty();
        Employee.smallSalaty();
        Employee.highSalatys();
        Employee.averageSalaty();
        Employee.onlyNames();
        Employee.upSalaty();
        Employee.printAll();
    }
}