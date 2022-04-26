package org.egov.empmnt.department;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentDao departmentDao;


    public DepartmentService(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    public List<Department> allDepartment(){
        return departmentDao.allDepartments();
    }

    public Department department(int id){
        return departmentDao.department(id);
    }

    public  int createDepartment(Department department){
        return departmentDao.createDepartment(department);
    }

    public  int updateDepartment(Department department,int id){
        return departmentDao.updateDepartment(department,id);
    }

    public int deleteDepartment(int id){
        return departmentDao.deleteDepartment(id);
    }
}
