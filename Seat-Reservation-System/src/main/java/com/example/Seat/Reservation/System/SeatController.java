package com.example.Seat.Reservation.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SeatController {
    @Autowired
    SeatService seatService;
    @PostMapping("/add-seat")
    public String addSeat(@RequestBody Seat seat){
        seatService.addSeat(seat);
        return "Seat added successfully";
    }
    @PostMapping("/add-seat")
    public String addEmp(@RequestBody Employee employee){
        seatService.addEmp(employee);
        return "Employee added successfully";
    }
    @GetMapping("/vacant-seat")
    public int NoOfVacantSeat(@RequestParam String date){
        int vacantSeat = seatService.NoOfVacantSeat(date);
        return vacantSeat;
    }
    @GetMapping("/visited-emp")
    public int NoOfEmpMoreThen5times(){
        return seatService.NoOfEmpMoreThen5times();
    }
    @GetMapping("/same-team-on-date")
    public int NoOfSameTeamOnDate(@RequestParam String date, @RequestParam String team){
        return seatService.NoOfSameTeamOnDate(date, team);
    }
}
