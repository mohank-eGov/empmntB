package org.egov.empmnt.department;

import org.egov.empmnt.employee.EmployeeRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentJdbcService implements DepartmentDao{

    private JdbcTemplate jdbcTemplate;

    public DepartmentJdbcService(JdbcTemplate jdbcTemplate){this.jdbcTemplate=jdbcTemplate;}

    @Override
    public List<Department> allDepartments() {
        var sql= "SELECT * from department";
        return jdbcTemplate.query(sql,new DepartmentRowMapper());
    }

    @Override
    public int createDepartment(Department department) {
        var sql ="INSERT INTO department(name) VALUES(?)";

        return jdbcTemplate.update(sql,new Object[]{department.getDepartment()});
    }

    @Override
    public int updateDepartment(Department department, int id) {
        var sql="UPDATE department set name=? WHERE departmentId=?";

        return jdbcTemplate.update(sql,department.getDepartment(),id);
    }

    @Override
    public int deleteDepartment(int id) {
        var sql ="DELETE FROM department WHERE departmentId=?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public Department department(int id) {
        var sql	 = "SELECT * FROM department WHERE departmentId =?";
        return jdbcTemplate.queryForObject(sql,new DepartmentRowMapper(),id);
    }
}
