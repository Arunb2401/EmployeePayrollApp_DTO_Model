package com.bridgelabz.employeepayroll.Controller;

import com.bridgelabz.employeepayroll.DTO.EmployeePayrollDTO;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<String> getEmployeePayrollData() {
        return new ResponseEntity<String>("Get Call is Successfull !!!",HttpStatus.OK);
    }
    
    @GetMapping("/get/{empId}")
    public ResponseEntity<String> getEmployeePayrollData(
        @RequestBody EmployeePayrollDTO employeepayrollDTO) {
            return new ResponseEntity<String>("Get call is succesfull for ID: " + employeepayrollDTO, HttpStatus.OK);
        }

    @PostMapping("/create")
    public ResponseEntity<String> addEmployeePayrollData(
                                @RequestBody EmployeePayrollDTO employeepayrollDTO) {
        return new ResponseEntity<String>("Created Employee payroll Data for:"  + employeepayrollDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeePayrollData(
        @RequestBody EmployeePayrollDTO employeePayrollDTO) {
            return new ResponseEntity<String>("Updated Employee Payroll Data for: " + employeePayrollDTO, HttpStatus.OK);
        }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String>deleteEmployeePayrollData(@PathVariable("empId") int empId) {
        return new ResponseEntity<String>("Deleted the Employee Data for: " + empId, HttpStatus.OK);
    }


}
