package com.thesis;

public class AppointmentStats {
    public int totalAppointments;
    public int completedAppointments;
    public double noShowRate;


    public AppointmentStats(int totalAppointments, int completedAppointments, double noShowRate) {
        this.totalAppointments = totalAppointments;
        this.completedAppointments = completedAppointments;
        this.noShowRate = noShowRate;
    }
}
