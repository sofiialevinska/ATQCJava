package HW;

public class ContractEmployee extends EmployeeBaseClass implements Employee {
    private String federalTaxIdMember;
    private double fixedmonthpay;

    public ContractEmployee(String name, String employeeId, String federalTaxIdMember, double fixedmonthpay) {
        this.name = name;
        this.employeeId = employeeId;
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedmonthpay = fixedmonthpay;
    }

    public double calculatePay() {
        return fixedmonthpay;
    }

}
