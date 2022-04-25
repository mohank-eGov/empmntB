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


    public Employee(){

    }

    public  Employee(int id,String name,String email,String mobile,int age){
        this.id=id;
        this.name=name;
        this.email=email;
        this.mobile=mobile;
        this.age=age;

    }

    public Employee(String name, String email,String mobile,int age) {
        this.name=name;
        this.email=email;
        this.mobile=mobile;
        this.age=age;

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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", age=" + age +
                '}';
    }
}
