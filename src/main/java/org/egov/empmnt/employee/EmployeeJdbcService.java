package org.egov.empmnt.employee;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeJdbcService implements EmployeeDao{

        private JdbcTemplate jdbcTemplate;

public EmployeeJdbcService(JdbcTemplate jdbcTemplate){
    this.jdbcTemplate=jdbcTemplate;
}
    @Override
    public List<Employee> allEmployee() {
        var sql= "SELECT * from employee";
        return jdbcTemplate.query(sql,new EmployeeRowMapper()) ;
    }

    @Override
    public int createEmployee(Employee employee) {
        var sql ="INSERT INTO employee(name,email) VALUES(?,?,?)";
        return jdbcTemplate.update(sql,new Object[]{employee.getName(),employee.getEmail()});
    }

    @Override
    public int updateEmployee(Employee employee,int id) {
    var sql="UPDATE employee set name=?,email=?WHERE id=?";
        return jdbcTemplate.update(sql,employee.getName(),employee.getEmail(),id);
    }

    @Override
    public int deleteEmployee(int id) {
      var sql ="DELETE FROM employee WHERE id=?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public Employee employee(int id) {
    var sql	 = "SELECT * FROM employee WHERE id =?";
        return jdbcTemplate.queryForObject(sql,new EmployeeRowMapper(),id);
    }
}
