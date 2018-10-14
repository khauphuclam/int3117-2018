/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

/**
 *
 * @author Linh
 */
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;


public class TestEmployee extends TestCase{
    Employee emp;
    
    @Before@Override
    public void setUp(){
        emp = new Employee();
    }
    
    @Test
    public void testGetInfoInvalidName(){
        assertEquals("Invalid name or ID", emp.getInfo(null, 1));
    }
    
    @Test
    public void testGetInfoInvalidId(){
        assertEquals("Invalid name or ID", emp.getInfo("Batman", -1));
    }
    
    @Test
    public void testGetInfoValidInfo(){
        assertEquals("Name: Batman ID: 1", emp.getInfo("Batman", 1));
    }
    
    @Test
    public void testIdIsPrimeIdSmallerOrEqualToOne(){
        assertTrue(emp.idIsPrime(0) == false);
    }
    
    @Test
    public void testIdIsPrimeFalse(){
        assertFalse(emp.idIsPrime(12) == true);
    }
    
    @Test
    public void testIdIsPrimeTrue(){
        assertTrue(emp.idIsPrime(263) == true);
    }
    
    @Test
    public void testSalaryBonus13Percent(){
        assertEquals(2.665, emp.salaryBonus(263, 20.5));
    }
    
    @Test
    public void testSalaryBonus10Percent(){
        assertEquals(2.05, emp.salaryBonus(12, 20.5));
    }
}
