package org.egov.empmnt.employee;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> allEmployee(){
        return employeeService.allEmployees();
    }

    @GetMapping("{id}")
    public Employee employee(@PathVariable("id") Integer id){
        return employeeService.employee(id);
    }

    @PostMapping
    public int createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @CrossOrigin(origins = "*",allowedHeaders = "*")
    @PutMapping("{id}")
    public int updateEmployee(@PathVariable Integer id,@RequestBody Employee employee){
        System.out.println(id+"id"+employee);
        return employeeService.updateEmployee(employee,id);
    }

    @CrossOrigin(origins = "*",allowedHeaders = "*")
    @DeleteMapping("{id}")
    public int deleteEmployee(@PathVariable("id") Integer id){
        return employeeService.deleteEmployee(id);
    }


}
