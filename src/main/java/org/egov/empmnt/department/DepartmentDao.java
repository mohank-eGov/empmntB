package org.egov.empmnt.department;

import java.util.List;

public interface DepartmentDao {
    List<Department> allDepartments();

    int createDepartment(Department department);

    int updateDepartment(Department department,int id);

    int deleteDepartment(int id);

    Department department(int id);
}
