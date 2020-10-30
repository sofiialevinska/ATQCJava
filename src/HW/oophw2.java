package HW;

public class oophw2 {
    public static void main(String[] args) {
        EmployeeBaseClass [] employee = new EmployeeBaseClass[5];
        employee [0] = new ContractEmployee("Olena","0", "0000", 45);
        employee [1] = new SalariedEmployee("Igor","1", "1social", 23.6, 12);
        employee [2] = new ContractEmployee("Oleksandra", "2", "2222", 4.89);
        employee[3] = new SalariedEmployee("Oleh", "3", "3social", 23, 12.56);

        employee [4] = null;

        for (int i  = 0; i < employee.length-2; i++) {
            for (int j=i+1; j< employee.length-1; j++) {
                if (employee [j].calculatePay()>employee[i].calculatePay())
                {
                    employee [4] = employee[i];
                    employee [i] = employee [j];
                    employee [j] = employee [4];
                }
            }
        }
            for (int i = 0; i < employee.length-1; i++) {
            System.out.println("\nID: " + employee[i].employeeId + "\nname: " + employee[i].name + "\nAverage monthly salary: " + String.format("%.2f", (employee[i].calculatePay())));
        }
    }
}
