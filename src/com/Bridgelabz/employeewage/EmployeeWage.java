package com.Bridgelabz.employeewage;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int WORKING_DAYS_PER_MONTH = 20;

    static final int IS_FULL_TIME = 2;

    static final int IS_PART_TIME = 1;

    public static void employeeWageMethod() {
        int day = 1;
        int totalWage = 0;
        while (day <= WORKING_DAYS_PER_MONTH) {
            int dailyWage = 0;
            int employeeAttendance = (int) Math.floor(Math.random() * 10) % 3;
            switch (employeeAttendance) {
                case IS_FULL_TIME:
                    System.out.println("Employee is Full Time");
                    dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is Part Time");
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    break;
                default:
                    System.out.println("Absent");
            }
            totalWage = totalWage + dailyWage;
            System.out.println("Daily Wage for = " + day + " day = " + dailyWage);
            day++;
        }
    }

    public static void main(String[] args) {
        employeeWageMethod();
    }
}



    


