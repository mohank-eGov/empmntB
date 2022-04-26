package org.egov.empmnt.department;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "department")
public class DepartmentController {

    private  final  DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<Department> allDepartments() {
        return departmentService.allDepartment();
    }

    @GetMapping("{id}")
    public Department department(@PathVariable("id") Integer id){
        return departmentService.department(id);
    }

    @PostMapping
    public int createDepartment(@RequestBody Department department){
        return departmentService.createDepartment(department);
    }

    @CrossOrigin(origins = "*",allowedHeaders = "*")
    @PutMapping("{id}")
    public int updateDepartment(@PathVariable Integer id,@RequestBody Department department){
        return departmentService.updateDepartment(department,id);
    }

    @CrossOrigin(origins = "*",allowedHeaders = "*")
    @DeleteMapping("{id}")
    public int deleteEmployee(@PathVariable("id") Integer id){
        return  departmentService.deleteDepartment(id);
    }

}
