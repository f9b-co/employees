package fr.formation.employees.controllers;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.employees.informations.Employee;
import fr.formation.employees.informations.EmployeePatch;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @PostMapping()
    public void create(@RequestBody @Valid Employee employee) {
	System.out.println("Created employee " + employee);
    }

    @GetMapping("/{internId}")
    public Employee employee(@PathVariable("internId") long internId) {
	LocalDate birthDate = LocalDate.of(1960, 12, 25);
	LocalDate startDate = LocalDate.of(1985, 5, 8);
	Employee number1 = new Employee(0, 123456789, "One", "Number",
		birthDate, startDate, (float) 60000.00);
	System.out.println(number1);
	return number1;
    }

    @GetMapping()
    public ArrayList<Employee> getAll(@RequestParam("size") int size,
	    @RequestParam("page") int page) {
	LocalDate birthDate = LocalDate.of(1960, 12, 25);
	LocalDate startDate = LocalDate.of(1985, 5, 8);
	LocalDate birthDate2 = LocalDate.of(1985, 5, 8);
	LocalDate startDate2 = LocalDate.of(2005, 1, 1);
	System.out.println("size" + size + ", page=" + page);
	ArrayList<Employee> employees = new ArrayList<>();
	Employee number1 = new Employee(0, 123456789, "One", "Number",
		birthDate, startDate, (float) 60000.00);
	Employee number2 = new Employee(1, 987654321, "Two", "Num", birthDate2,
		startDate2, (float) 30000.00);
	employees.add(number1);
	employees.add(number2);
	System.out.println(employees);
	return employees;
    }

    @PutMapping("/{internId}")
    public void update(@PathVariable("internId") long internId,
	    @RequestBody @Valid Employee employee) {
	System.out.println("Update employee " + employee.getInternalId());
    }

    @DeleteMapping("/{internId}")
    public void delete(@PathVariable("internId") long internId) {
	System.out.println("Delete employee " + internId);
    }

    @PatchMapping("/{internId}/retired")
    public void retired(@PathVariable("internId") Long internId,
	    @RequestBody @Valid EmployeePatch employeePatch) {
	System.out.println("Patching retired employee id " + internId
		+ " with end date " + employeePatch);
    }
}
