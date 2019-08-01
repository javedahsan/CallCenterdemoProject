High level Call Center Design:

Requirement:
1. There are three kinds of employees: CustomerRep, Supervisor and Manager
2. When a call receives then it is assigned to the CustomerRep first who is available
3. If no CustomerRep is free or not able to handle it then its escalated to next level Supvisor.
4. If no Supervisor is free or not able to handle it then its forwarded to Manager.

Analysis:
 
  Create the following Objects 
  
  Employee (CustomeRep, Supervisor, Manager),
  Call,
  Caller,
  CallManager

  Object relationships are:
  -------------------------
  CallManager has many employees
  There can be only one call per Employee
  There can be only one caller per caller
  An Employee can manage only one caller at a time
  CustomerRep will receive the call first
  if CustomerRep is not able to handle the call then it will forward to supervisor
  if supervisor is busy then it will escalate to Manager 