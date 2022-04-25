package org.egov.empmnt.department;

import org.egov.empmnt.employee.Employee;

public class Department {
    private int id;

    private String name;

    public Department(){}

    public Department(String name){
        this.name=name;
    }

    public Department(
            int id,String name
    ){
        this.id=id;
        this.name=name;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
