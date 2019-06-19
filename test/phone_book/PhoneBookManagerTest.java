/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone_book;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PhoneBookManagerTest {
    
    
    
    String user = "unknown";
    String number = "123456";
    String university = "uni";
    String company = "theco";
    String year="1984";
    
    public PhoneBookManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createManagerInst method, of class PhoneBookManager.
     */
    @Test
    public void testCreateManagerInst() {
        
        PhoneBookManager result = PhoneBookManager.createManagerInst();
        assertEquals(PhoneBookManager.class.isInstance(result), true);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addPhoneInfo method, of class PhoneBookManager.
     */
    
    

    
}
