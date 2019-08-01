package com.organization.name;

import java.util.ArrayList;
import java.util.List;

class CallManager {
	  List<List<Employee>> employeeLevels;
	  List<List<Call>> waitQueue;

	  CallManager() {
	    this.employeeLevels = new ArrayList<>();
	    this.employeeLevels.add(new ArrayList<>());
	    this.employeeLevels.add(new ArrayList<>());
	    this.employeeLevels.add(new ArrayList<>());
	    this.waitQueue = new ArrayList<List<Call>>();
	  }

	  private Employee findCallHandler(Call call) {
	    /* check all Customer Reps */
	    for (Employee custRep: employeeLevels.get(0)) {
	      if (custRep.isFree()) return custRep;
	    }

	    /* check for Supervisor  */
	    for (Employee supervisor: employeeLevels.get(1)) {
	      if (supervisor.isFree()) return supervisor;
	    }

	    /* check for Manager */
	    for (Employee manager: employeeLevels.get(2)) {
	      if (manager.isFree()) return manager;
	    }

	    // No one is free
	    return null; // Play music here.. or ask for callback number
	  }

	  public void addCustomerRep(Employee emp) {
	    employeeLevels.get(0).add(emp);
	  }

	  public void addSupervisor(Employee emp) {
	    employeeLevels.get(1).add(emp);
	  }

	  public void addManager(Employee emp) {
	    employeeLevels.get(2).add(emp);
	  }

	  public void dispatch(Caller caller) {
	    dispatch(new Call(caller));
	  }

	  public void dispatch(Call call) {
	    /* check if any Customer Repr is free */
	    Employee handler = findCallHandler(call);
	    if (handler == null) {
	      System.out.println("All Customer Rep are busy and press 1 for call back or wait for CSR");
	      putCallInWaitQueue(call);
	      return;
	    }
	    handler.assignCall(call);
	    call.setEmployee(handler);
	  }

	  public void putCallInWaitQueue(Call call) {
	    waitQueue.get(call.getRank()).add(call);
	  }
	}

