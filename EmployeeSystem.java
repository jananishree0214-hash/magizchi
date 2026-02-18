

class Employee 
{
    Employee(int salary) {}
}

class PermanentEmployee extends Employee implements Runnable {
    PermanentEmployee(int salary) { super(salary); }
    public void calculateSalary() {
        System.out.println("Permanent Employee Salary Calculated");
    }
    @Override
    public void run() { calculateSalary(); }
}

class ContractEmployee extends Employee implements Runnable {
    ContractEmployee(int salary) { super(salary); }
    public void calculateSalary() {
        System.out.println("Contract Employee Salary Calculated");
    }
    public void run() { calculateSalary(); }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        new Thread(new PermanentEmployee(30000)).start();
        new Thread(new ContractEmployee(20000)).start();
    }

    
}
