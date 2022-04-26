package org.egov.empmnt.employee;

import org.egov.empmnt.department.DepartmentRowMapper;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeJdbcService implements EmployeeDao{

        private JdbcTemplate jdbcTemplate;

public EmployeeJdbcService(JdbcTemplate jdbcTemplate){
    this.jdbcTemplate=jdbcTemplate;
}
    @Override
    public List<Employee> allEmployee() {
        var sql= "SELECT * from employee,department where employee.department_id=department.id";
        return jdbcTemplate.query(sql, new ResultSetExtractor<List<Employee>>() {
            @Override
            public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
               List<Employee> employees=new ArrayList<Employee>();
               int employeeId = 0;
               Employee currentEmployee=null;
               int employeeIdx=0;
               int departmentIdx=0;

               while (rs.next()){

                   if(currentEmployee == null || !(employeeId == rs.getInt("id"))){
                       employeeId=rs.getInt("id");
                       currentEmployee = new EmployeeRowMapper().mapRow(rs,employeeIdx++);
                       departmentIdx=0;
                       employees.add(currentEmployee);
                   }
                   currentEmployee.setDepartment(new DepartmentRowMapper().mapRow(rs,departmentIdx++));

               }
               return employees;
            }
        }) ;
    }

    @Override
    public int createEmployee(Employee employee) {
        var sql ="INSERT INTO employee(name,email,mobile,age,department_id) VALUES(?,?,?,?,?)";
        return jdbcTemplate.update(sql,new Object[]{employee.getName(),employee.getEmail(),employee.getMobile(),employee.getAge(),employee.getDepartment_id()
        });
    }

    @Override
    public int updateEmployee(Employee employee,int id) {
    var sql="UPDATE employee set name=?,email=?,mobile=?,age=?,department_id=? WHERE id=?";
        return jdbcTemplate.update(sql,employee.getName(),employee.getEmail(),employee.getMobile(),employee.getAge(),employee.getDepartment_id(),id);
    }

    @Override
    public int deleteEmployee(int id) {
      var sql ="DELETE FROM employee WHERE id=?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public Employee employee(int id) {
    var sql	 = "SELECT * FROM employee,department WHERE employee.department_id=department.id and employee.id =?";
        return jdbcTemplate.query(sql,new ResultSetExtractor<Employee>(){

            @Override
            public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
                Employee employee=null;
                int row=0;
                while (rs.next()){
                    if(employee==null) {
                        employee = new EmployeeRowMapper().mapRow(rs, row);
                    }
                    employee.setDepartment(new DepartmentRowMapper().mapRow(rs,row));
                    row++;
                }
                return employee;
            }
        },id);
    }
}
