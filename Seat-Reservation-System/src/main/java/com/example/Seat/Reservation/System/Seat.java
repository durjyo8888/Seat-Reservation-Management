package com.example.Seat.Reservation.System;

public class Seat {
    private int seatNo;
    private int empId;
    private String date;
    private boolean isReserved;

    public Seat() {
    }

    public Seat(int seatNo, int empId, String date, boolean isReserved) {
        this.seatNo = seatNo;
        this.empId = empId;
        this.date = date;
        this.isReserved = isReserved;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }
}
