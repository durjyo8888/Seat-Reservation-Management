package com.example.Seat.Reservation.System;

public class Employee {
    private int empId;
    private String team;

    public Employee() {
    }

    public Employee(int empId, String team) {
        this.empId = empId;
        this.team = team;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
