package com.organization.name;
import org.junit.Test;

import static org.junit.Assert.*;


public class CallTest {

//    @Test(expected = NullPointerException.class)
    @Test(expected = java.lang.RuntimeException.class)
    public void test01CallCreationWithNullParameter() {
    	try {
        new Call(null);
        throw new RuntimeException("should be failed");
    	} catch (AssertionError ex) {
    		System.out.println(ex);
    		assertTrue(ex.getMessage(), ex.getMessage().contains("Error"));
    	}
    }

    
    @Test()
	public void test02CallCreationWithInvalidRank() {
    	try {
    	CallManager manager = new CallManager();
    	Employee employee = new Employee("R1", manager);
    	
    	Caller caller = new Caller("CALLER");
    	Call call = new Call(caller);
    	call.setEmployee(employee);
    	
    	assertEquals(call.getRank(),1);
    	}catch (AssertionError ex) {
    	assertEquals(ex.getMessage(), ex.getMessage().contains("<0> but was:<1>"));
    	}
    }
    
}
