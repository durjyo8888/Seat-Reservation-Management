package com.example.Seat.Reservation.System;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class SeatRepository {
    HashMap<Integer,Seat> seatDb = new HashMap<>();
    HashMap<Integer,Employee> employeeDb = new HashMap<>();
    public void addSeat(Seat seat) {
        seatDb.put(seat.getSeatNo(), seat);
    }

    public void addEmp(Employee employee) {
        employeeDb.put(employee.getEmpId(),employee);
    }

    public int NoOfVacantSeat(String date) {
        int vacantSeat = 0;
        for(Seat seat : seatDb.values()){
            if(seat.getDate().equals(date) && !seat.isReserved()){
                vacantSeat++;
            }
        }
        return vacantSeat;
    }

    public int NoOfEmpMoreThen5times() {
        int count = 0;
        Map<Integer,Integer> empMap = new HashMap<>();
        for(Seat seat : seatDb.values()){
            int employeeId = seat.getEmpId();
            empMap.put(employeeId, empMap.getOrDefault(employeeId,0)+1);
        }
        for(int visit : empMap.values()){
            if(visit > 5){
                count++;
            }
        }
        return count;
    }

    public int NoOfSameTeamOnDate(String date, String team) {
        int empCount = 0;
        for(Seat seat : seatDb.values()){
            if(seat.getDate().equals(date) && seat.isReserved()){
                for(Employee employee : employeeDb.values()){
                    if(employee.getTeam().equals(team) && seat.getDate().equals(date)){
                        empCount++;
                    }
                }
            }
        }
        return empCount;
    }
}
