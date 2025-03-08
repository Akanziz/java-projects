import java.util.ArrayList;
import java.util.Optional;

class Job {

    private ArrayList<Employee> employees;

    public Job() {
        this.employees = new ArrayList<>();
    }
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    public ArrayList<Employee> getEmployees(){
        return employees;
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }
    public void removeEmployee(Employee e){
        employees.remove(e);
    }
    public Optional<Double> computeAverageSalary(){
        if (employees.isEmpty()) {
            return Optional.empty();
        }
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        double averageSalary = totalSalary / employees.size();
        return Optional.of(averageSalary);
    }
    public Optional<Employee> highestPaid(){
        if (employees.isEmpty()) {
            return Optional.empty();
        }
        Employee highestPaidEmployee = employees.get(0);
        for (Employee employee : employees){
            if (employee.getSalary() > highestPaidEmployee.getSalary())
                highestPaidEmployee = employee;
        }
        return Optional.of(highestPaidEmployee);
    }

    // override toString method
    public String toString(){
        return employees.toString();
    }
}