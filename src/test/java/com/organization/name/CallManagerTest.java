package com.organization.name;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CallManagerTest {

//    @Test(expected = NullPointerException.class)
//    public void testEmployeeInvalidCreation() {
//    	rank = 3;
//    	CallManager manager = new CallManager();
//    	
//        new Employee("R1", manager);
//    }

    @Test
    public void test01CallManagerCreateCustRep() {
    	CallManager manager = new CallManager();
   	    Employee employee = new Employee("R1", manager); 
    	manager.addCustomerRep(employee);
    	assertNotNull(manager);
	    assertEquals(employee.getEmpId(),"R1");
	    assertEquals(employee.isFree(),true);
 
 		    manager.addCustomerRep(new Employee("R2", manager));
		    manager.addCustomerRep(new Employee("R3", manager));

		    manager.addSupervisor(new Employee("Supervisor1", manager));

		    manager.addManager(new Employee("M1", manager));
         
	    
    }
    
    @Test
    public void test02CallManagerCreateSupervisor() {
    	CallManager manager = new CallManager();
   	    Employee employee = new Employee("Supervisor1", manager); 
    	manager.addSupervisor(employee);
    	assertNotNull(manager);
	    assertEquals(employee.getEmpId(),"Supervisor1");
	    assertEquals(employee.isFree(),true);
    }

    @Test
    public void test03CallManagerCreateManager() {
    	CallManager manager = new CallManager();
   	    Employee employee = new Employee("Manager1", manager); 
    	manager.addManager(employee);
    	assertNotNull(manager);
	    assertEquals(employee.getEmpId(),"Manager1");
	    assertEquals(employee.isFree(),true);
    }

    @Test
    public void test04DispatchCall() {
    	 CallManager manager = new CallManager();
    	 Employee employee = new Employee("R1", manager);
    	 Caller caller = new Caller("CALLER");
     	 Call call = new Call(caller);
     	 employee.assignCall(call);
     	 assertEquals(employee.isFree(),false);
        
    }
}

