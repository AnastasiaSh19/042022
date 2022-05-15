package ru.gb.shalaeva.HomeWork5;

public class HomeWork5 {

    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Ivanov Ivan", "Doctor", "ivivan@mail.com", "89151111111",55000,21);
        empCorp[1] = new Employee("Petrov Petr", "Firefighter", "petrov@mail.com", "89151111112",60000,42);
        empCorp[2] = new Employee("Sidorov Sidr", "Manager", "sidorov@mail.com", "89151111113",80000,23);
        empCorp[3] = new Employee("Egorova Olga", "Cleaner", "egorova@mail.com", "89151111114",9000,19);
        empCorp[4] = new Employee("Mishina Sveta", "Artist", "mishina@mail.com", "89151111116",7000,50);
        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);
    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}

