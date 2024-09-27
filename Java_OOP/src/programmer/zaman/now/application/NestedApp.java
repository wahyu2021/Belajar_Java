package programmer.zaman.now.application;

import programmer.zaman.now.data.Company;

public class NestedApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Wahyu Wahid Nugroho");

        Company.Employee employee = company.new Employee();
        employee.setName("Jhon");

        System.out.println(company.getName());
        System.out.println(company.getName());
    }
}
