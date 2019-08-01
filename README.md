# CallCenterdemoProject #

## Requirement: ##

There are three kinds of employees: CustomerRep, Supervisor and Manager.
When a call receives then it is assigned to the CustomerRep first who is available.
If no CustomerRep is free or not able to handle it then its escalated to next level Supvisor.
If no Supervisor is free or not able to handle it then its forwarded to Manager.

## Analysis: ##
Create the following Objects
* Employee (CustomeRep, Supervisor, Manager)
* Call
* Caller
* CallManager

## Object relationships are: ##
* CallManager has many employees. 
* There can be only one call per Employee.
* An Employee can manage only one caller at a time.
* CustomerRep will receive the call first if CustomerRep is not able to handle the call then it will forward to supervisor, in case;  if supervisor is busy then it will escalate to Manager.

# Note: Project still need to be refactor and add more functionality #
