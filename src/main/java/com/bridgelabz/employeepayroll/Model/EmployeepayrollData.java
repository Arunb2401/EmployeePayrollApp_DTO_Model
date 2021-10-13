package com.bridgelabz.employeepayroll.Model;

import com.bridgelabz.employeepayroll.DTO.EmployeePayrollDTO;

public class EmployeepayrollData {
    private int employeeId;
    private String name;
    private long salary;

    public EmployeepayrollData(){ }

    public EmployeepayrollData(int empId, EmployeePayrollDTO employeePayrollDTO){
        this.employeeId = empId;
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
    }
    
    public int getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getsalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
}
