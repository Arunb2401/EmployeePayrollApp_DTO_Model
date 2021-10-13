package com.bridgelabz.employeepayroll.DTO;

public class EmployeePayrollDTO {
    public String name;
    public long salary;

    public EmployeePayrollDTO(String name, long salary){}
        @Override
        public String toString(){
        return "name=" + name + "salary=" + salary;
        }
    
}
