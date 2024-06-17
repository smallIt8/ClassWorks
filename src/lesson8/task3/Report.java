package src.lesson8.task3;

public class Report {

    public String generateReport() {

        System.out.println("Отчет о зарплате сотрудников:");
        System.out.println("-----------------------------------");
        for (Employee employee : ) {
            // Форматирование строки для вывода информации о сотруднике
            System.out.printf("%-20s %10.2f%n", employee.fullName, employee.salary);
        }
        System.out.println("-----------------------------------");
        return "";
    }
}
