package com.organization.name;

class Employee {
	
		  private String empId;
		  private Call currentCall;
		  private CallManager callManager;

		  Employee(String empId, CallManager callManager) {
		    this.setEmpId(empId);
		    this.callManager = callManager; 
		   }

		  
		  public boolean isFree() {
		    return this.currentCall == null;
		  }

		  private void escalateCall() {
		    if (!isFree()) {
		      currentCall.incrementRank();
		      callManager.putCallInWaitQueue(currentCall);
		    }
		  }

		  public void assignCall(Call call) {
		    System.out.println(getEmpId() + " Received call!");
		    currentCall = call;
		  }


		public String getEmpId() {
			return empId;
		}

		public void setEmpId(String empId) {
			this.empId = empId;
		}
		}
