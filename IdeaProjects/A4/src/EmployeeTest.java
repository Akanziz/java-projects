import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void Employee() {
        Employee emp1 = new Employee("Kai", "Cenat", 2005, 100000.0);
        Employee emp2 = new Employee("John", "Cena", 1996, 112000.0);
        Employee emp3 = new Employee("Benedict", "Yiga", 2002, 0.0);
        Employee emp4 = new Employee("Demetrius", "Johnson", 2007, 783.0);
        Employee emp5 = new Employee("JJ", "Mccarthy",1893, 18500.0);

        assertEquals("CenaK05", emp1.getID());
        assertEquals("CenaJ96", emp2.getID());
        assertEquals("YigaB02", emp3.getID());
        assertEquals("JohnsD07", emp4.getID());
        assertEquals("MccarJ93", emp5.getID());


        assertEquals("Benedict, Yiga, 2002, 0.0, YigaB02", emp3.toString());
        assertEquals("Demetrius, Johnson, 2007, 783.0, JohnsD07", emp4.toString());
        assertEquals("JJ, Mccarthy, 1893, 18500.0, MccarJ93", emp5.toString());
        assertEquals("Kai, Cenat, 2005, 100000.0, CenatK05", emp1.toString());
        assertEquals("John, Cena, 1996, 112000.0, CenaJ96", emp2.toString());


        assertFalse(emp1.equals(emp2));
        assertTrue(emp1.equals(emp1));

        assertFalse(emp2.equals(emp1));
        assertTrue(emp2.equals(emp2));

        assertFalse(emp3.equals(emp1));
        assertTrue(emp3.equals(emp3));

        assertFalse(emp4.equals(emp5));
        assertTrue(emp4.equals(emp4));

        assertFalse(emp5.equals(emp4));
        assertTrue(emp5.equals(emp5));

        emp1.bonus();
        emp2.bonus();
        emp3.bonus();
        emp4.bonus();
        emp5.bonus();
        assertEquals(110000.0, emp1.getSalary(), .001);
        assertEquals(123200.0, emp2.getSalary(), .001);
        assertEquals(0.0, emp3.getSalary(), .001);
        assertEquals(861.3, emp4.getSalary(), .001);
        assertEquals(20350.0, emp5.getSalary(), .001);
    }
}
