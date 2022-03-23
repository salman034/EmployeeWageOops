package com.bl.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        int EMP_RATE_PER_HOUR = 20;
        int NUM_OF_WORKING_DAYS = 2;
        int empHrs, empWage, totalEmpWage = 0;

        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 1:
                    IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case 2:
                    IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage = empWage + totalEmpWage;
            System.out.println("Employee Wage : " + empWage);
        }
        System.out.println("Total Emp Wage :" + totalEmpWage);
    }
}
