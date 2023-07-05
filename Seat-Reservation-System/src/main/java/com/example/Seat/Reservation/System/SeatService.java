package com.example.Seat.Reservation.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    @Autowired
    SeatRepository seatRepository;
    public void addSeat(Seat seat) {
        seatRepository.addSeat(seat);
    }

    public void addEmp(Employee employee) {
        seatRepository.addEmp(employee);
    }

    public int NoOfVacantSeat(String date) {
        return seatRepository.NoOfVacantSeat(date);
    }

    public int NoOfEmpMoreThen5times() {
        return seatRepository.NoOfEmpMoreThen5times();
    }

    public int NoOfSameTeamOnDate(String date, String team) {
        return seatRepository.NoOfSameTeamOnDate(date, team);
    }
}
