package src.lesson8.task3;

//Отчет о сотрудниках, часть 1
//- Создать класс Employee, у которого есть переменные класса - fullName, salary.
//- Создать массив содержащий несколько объектов этого типа.
//- Создать класс Report со статическим методом generateReport, в котором выводится информация о зарплате всех сотрудников.
//- Используйте форматирование строк. Пусть salary будет выровнено по правому краю,
// десятичное значение имеет 2 знака после запятой и можете добавить что-нибудь свое.



public class Employee {

    private String fullName;
    private double salary;

    public void start(){
        array();
    }

    public Employee() {
    }

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public Object array(){
        Employee[] person = {
                new Employee("Сидоров А.В.",1050.54),
                new Employee("Петров П.С.", 1537.12),
                new Employee("Васичкин Л.Е", 1234.75)
        };
        return "";
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
