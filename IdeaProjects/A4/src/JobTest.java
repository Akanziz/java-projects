import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JobTest {
    @Test
    void addEmployee() {
        Job j1 = new Job();
        Employee emp1 = new Employee("Ben", "Rucker", 2004, 100000.0);
        Employee emp2 = new Employee("Maxo", "Roey", 2000, 114000.0);
        Employee emp3 = new Employee("Fresono", "TJK", 1999, 0.0);
        Employee emp4 = new Employee("Chaser", "Wamplery", 1023, 123.0);
        Employee emp5 = new Employee("Lukey", "Skywalker",1893 , 12000.0);

        j1.addEmployee(emp1);
        j1.addEmployee(emp2);
        j1.addEmployee(emp3);
        j1.addEmployee(emp4);
        j1.addEmployee(emp5);

        assertEquals(5, j1.getEmployees().size());
        assertEquals(emp1, j1.getEmployees().get(0));
        assertEquals(emp2, j1.getEmployees().get(1));
        assertEquals(emp3, j1.getEmployees().get(2));
        assertEquals(emp4, j1.getEmployees().get(3));
        assertEquals(emp5, j1.getEmployees().get(4));
    }

    @Test
    void removeEmployee() {
        Job j1 = new Job();
        Employee emp1 = new Employee("Lammy", "Thompson", 2004, 0.0);
        Employee emp2 = new Employee("Kelenna", "Onyemere", 2005, 114000.0);
        Employee emp3 = new Employee("Ben", "Smith", 1820, 1000000000.0);
        Employee emp4 = new Employee("Bro", "Pookie", 1996, 123.0);
        Employee emp5 = new Employee("Esther", "Will",2023, 12000.0);
        j1.addEmployee(emp1);
        j1.addEmployee(emp2);
        j1.addEmployee(emp3);
        j1.addEmployee(emp4);
        j1.addEmployee(emp5);

        assertEquals(5, j1.getEmployees().size());
        j1.removeEmployee(emp1);

        assertEquals(4, j1.getEmployees().size());
        assertEquals(emp2, j1.getEmployees().get(0));
        assertEquals(emp3, j1.getEmployees().get(1));
        assertEquals(emp4, j1.getEmployees().get(2));
        assertEquals(emp5, j1.getEmployees().get(3));

        j1.removeEmployee(emp5);
        assertEquals(3, j1.getEmployees().size());
        assertEquals(emp2, j1.getEmployees().get(0));
        assertEquals(emp3, j1.getEmployees().get(1));
        assertEquals(emp4, j1.getEmployees().get(2));
    }

    @Test
    void computeAverageSalary() {
        Job j1 = new Job();
        Employee emp1 = new Employee("Lammy", "Thompson", 2004, 0.0);
        Employee emp2 = new Employee("Kelenna", "Onyemere", 2005, 114000.0);
        Employee emp3 = new Employee("Ben", "Smith", 1820, 1000.0);
        Employee emp4 = new Employee("Bro", "Pookie", 1996, 123.0);
        Employee emp5 = new Employee("Esther", "Will",2023, 12000.0);
        j1.addEmployee(emp1);
        j1.addEmployee(emp2);
        j1.addEmployee(emp3);
        j1.addEmployee(emp4);
        j1.addEmployee(emp5);
        assertEquals(Optional.of(25424.6), j1.computeAverageSalary());

        Job j2 = new Job();
        Employee emp6 = new Employee("Lammy", "Thompson", 2004, 10.0);
        Employee emp7 = new Employee("Kelenna", "Onyemere", 2005, 114000.0);
        Employee emp8 = new Employee("Ben", "Smith", 1820, 1000.0);
        Employee emp9 = new Employee("Bro", "Pookie", 1996, 123.0);
        Employee emp10 = new Employee("Esther", "Will",2023, 12000.0);
        j2.addEmployee(emp6);
        j2.addEmployee(emp7);
        j2.addEmployee(emp8);
        j2.addEmployee(emp9);
        j2.addEmployee(emp10);
        assertEquals(Optional.of(25426.6), j2.computeAverageSalary());

        Job j3 = new Job();
        assertEquals(Optional.empty(), j3.computeAverageSalary());
    }

    @Test
    void highestPaid() {
        Job j1 = new Job();
        Employee emp1 = new Employee("Lammy", "Thompson", 2004, 10.0);
        Employee emp2 = new Employee("Kelenna", "Onyemere", 2005, 114000.0);
        Employee emp3 = new Employee("Ben", "Smith", 1820, 1000.0);
        Employee emp4 = new Employee("Bro", "Pookie", 1996, 123.0);
        Employee emp5 = new Employee("Esther", "Will",2023, 12000.0);
        j1.addEmployee(emp1);
        j1.addEmployee(emp2);
        j1.addEmployee(emp3);
        j1.addEmployee(emp4);
        j1.addEmployee(emp5);
        assertEquals(Optional.of(emp2), j1.highestPaid());

        Job j2 = new Job();
        Employee emp6 = new Employee("Andrew", "Thompson", 2004, 1000.0);
        Employee emp7 = new Employee("Max", "Roe", 2000, 2000.0);
        Employee emp8 = new Employee("Freson", "TJ", 1999, 3000.0);
        Employee emp9 = new Employee("Chase", "Wampler", 1023, 4000.0);
        Employee emp10 = new Employee("Luke", "Wampler",1893, 5000.0);
        j2.addEmployee(emp6);
        j2.addEmployee(emp7);
        j2.addEmployee(emp8);
        j2.addEmployee(emp9);
        j2.addEmployee(emp10);
        assertEquals(Optional.of(emp5), j2.highestPaid());

        Job j3 = new Job();
        assertEquals(Optional.empty(), j3.highestPaid());
    }

    @Test
    void testToString() {
        Job j1 = new Job();
        Employee emp1 = new Employee("Lammy", "Thompson", 2004, 10.0);
        Employee emp2 = new Employee("Kelenna", "Onyemere", 2005, 114000.0);
        Employee emp3 = new Employee("Ben", "Smith", 1820, 1000.0);
        Employee emp4 = new Employee("Bro", "Pookie", 1996, 123.0);
        Employee emp5 = new Employee("Esther", "Will",2023, 12000.0);
        j1.addEmployee(emp1);
        j1.addEmployee(emp2);
        j1.addEmployee(emp3);
        j1.addEmployee(emp4);
        j1.addEmployee(emp5);

        assertEquals("[" + emp1.toString() + ", "
                + emp2.toString() + ", "
                + emp3.toString() + ", "
                + emp4.toString() + ", "
                + emp5.toString() + "]", j1.toString());

        Job j2 = new Job();
        Employee emp6 = new Employee("Aaron", "Thompson", 1978, 95000.0);
        Employee emp7 = new Employee("Wayne", "Allen", 1950, 54000.0);
        j2.addEmployee(emp6);
        j2.addEmployee(emp7);

        assertEquals("[" + emp6.toString() + ", "
                + emp7.toString() + "]", j2.toString());
    }

}
