package org.egov.empmnt.employee;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeDao employeeDao;


    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> allEmployees(){
        return employeeDao.allEmployee();
    }

    public Employee employee(int id){
        return employeeDao.employee(id);
    }
    public int createEmployee(Employee employee){
        return employeeDao.createEmployee(employee);
    }

    public int updateEmployee(Employee employee,int id){
           return employeeDao.updateEmployee(employee,id);
    }
    public int deleteEmployee(int id){
        return employeeDao.deleteEmployee(id);
    }


}
