package com.Bridgelabz.employeewage;

/**
 * UC2: Calculate Daily Employee Wage
 */

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;

    public static void main(String[] args) {

        int employeeAttendence = (int)Math.round(Math.random());
        System.out.println(employeeAttendence);

        int dailyWage = 0;

        if (employeeAttendence == 1){
            System.out.println("Employee is Present");
            dailyWage = WAGE_PER_HOUR*FULL_TIME_HOUR;
        }else{
            System.out.println("Employee is Absent");
        }
        System.out.println("Daily Wage = "+dailyWage);
    }

}
