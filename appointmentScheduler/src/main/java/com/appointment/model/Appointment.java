package com.appointment.model;

import java.time.LocalDateTime;
import java.util.List;

public class Appointment {
    private long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<User> appointmentAttendee;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setAppointmentAttendee(List<User> appointmentAttendee) {
        this.appointmentAttendee = appointmentAttendee;
    }

    public List<User> getAppointmentAttendee() {
        return appointmentAttendee;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

}
