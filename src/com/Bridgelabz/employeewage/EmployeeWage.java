package com.Bridgelabz.employeewage;

/**
 * UC1: Check Employee is Present or Absent
 */

public class EmployeeWage {
    public static void main(String[] args) {

        int employeeAttendence = (int)Math.round(Math.random());
        System.out.println(employeeAttendence);

        if (employeeAttendence == 1){
            System.out.println("Employee is Present");
        }else{
            System.out.println("Employee is absent");
        }
    }
}
