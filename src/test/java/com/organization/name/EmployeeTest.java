package com.organization.name;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EmployeeTest {

//    @Test(expected = NullPointerException.class)
//    public void testEmployeeInvalidCreation() {
//    	rank = 3;
//    	CallManager manager = new CallManager();
//    	
//        new Employee("R1", manager);
//    }

    @Test
    public void test01EmployeeCreation() {
    	 CallManager manager = new CallManager();
    	 Employee employee = new Employee("R1", manager);

         assertNotNull(employee);
         assertEquals(employee.getEmpId(),"R1");
         assertEquals(employee.isFree(),true);
        
    }

    @Test
    public void test02EmployeeStatusAssignCall() {
    	 CallManager manager = new CallManager();
    	 Employee employee = new Employee("R1", manager);
    	 Caller caller = new Caller("CALLER");
     	 Call call = new Call(caller);
     	 employee.assignCall(call);
     	 assertEquals(employee.isFree(),false);
        
    }
}

