package org.egov.empmnt.department;

public class DepartmentController {

    private  final  DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
}
