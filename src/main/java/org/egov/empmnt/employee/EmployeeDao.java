package org.egov.empmnt.employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> allEmployee();
    int createEmployee(Employee employee);
    int updateEmployee(Employee employee,int id);
    int deleteEmployee(int id );
    Employee employee(int id);
}
