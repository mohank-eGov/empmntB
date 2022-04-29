package org.egov.empmnt.department;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentRowMapper implements RowMapper<Department> {
    @Override
    public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Department(
                rs.getInt("department_id"),
                rs.getString("department")
        );
    }
}
