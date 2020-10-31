package HW;

public class SalariedEmployee extends EmployeeBaseClass implements Employee {
    private String socialSecurityNumber;
    private double hourlyrate;
    private double numhours;

    public SalariedEmployee(String name, String employeeId, String socialSecurityNumber, double hourlyrate, double numhours) {
        this.name = name;
        this.employeeId = employeeId;
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyrate = hourlyrate;
        this.numhours = numhours;
    }

    public double calculatePay() {
        return hourlyrate * numhours;
    }
}
