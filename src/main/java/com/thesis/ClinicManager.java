package com.thesis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ClinicManager {
    public Map<Integer, Doctor> doctors;
    public List<Appointment> appointments;


    public ClinicManager() {
        doctors = new HashMap<>();
        appointments = new ArrayList<>();
    }


    public void addDoctor(Doctor doctor) {
        doctors.put(doctor.doctorId, doctor);
    }


    public void addAppointment(Appointment appointment) {
        // System.out.println("Key is:" + appointment.get);
        if (!doctors.containsKey(appointment.doctorId)) {
            return;
        }
        appointments.add(appointment);
    }


    public AppointmentStats getAppointmentStatistics() {
        int total = appointments.size();


        int completed = 0;
        for (Appointment a : appointments) {
            if (a.status == AppointmentStatus.COMPLETED) {
                completed++;
            }
        }


        int noShows = 0;
        for (Appointment a : appointments) {
            if (a.status == AppointmentStatus.NO_SHOW) {
                noShows++;
            }
        }


        double noShowRate;
        if (total > 0) {
            noShowRate = (double) noShows / total;
        } else {
            noShowRate = 0.0;
        }


        return new AppointmentStats(total, completed, noShowRate);
    }


}
