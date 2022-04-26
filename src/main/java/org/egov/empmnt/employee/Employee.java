package org.egov.empmnt.employee;

import org.egov.empmnt.department.Department;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

public class Employee {
    private int id;
    private String name;
    @Email(message = "Email should be valid")
    private  String email;

    @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile Number Should be Valid")
    private String mobile;

    private int age;

    private int department_id;

    private Department department;

    public Employee(){

    }

    public  Employee(int id,String name,String email,String mobile,int age,int department_id){
        this.id=id;
        this.name=name;
        this.email=email;
        this.mobile=mobile;
        this.age=age;
        this.department_id=department_id;

    }

    public Employee(String name, String email,String mobile,int age,int department_id) {
        this.name=name;
        this.email=email;
        this.mobile=mobile;
        this.age=age;
        this.department_id=department_id;

    }



    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", age=" + age +
                ", department_id=" + department_id +
                '}';
    }
}
