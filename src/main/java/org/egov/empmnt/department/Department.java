package org.egov.empmnt.department;

import org.egov.empmnt.employee.Employee;

public class Department {
    private int id;

    private String department;

    public Department(){}

    public Department(String department){
        this.department=department;
    }

    public Department(
            int id,String department
    ){
        this.id=id;
        this.department=department;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", department='" + department + '\'' +
                '}';
    }
}
