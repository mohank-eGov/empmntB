package org.egov.empmnt.department;

import org.egov.empmnt.employee.Employee;

public class Department {
    private int department_id;

    private String department;

    public Department(){}

    public Department(String department){
        this.department=department;
    }

    public Department(
            int department_id,String department
    ){
        this.department_id=department_id;
        this.department=department;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Department{" +
                "department_id=" + department_id +
                ", department='" + department + '\'' +
                '}';
    }
}
