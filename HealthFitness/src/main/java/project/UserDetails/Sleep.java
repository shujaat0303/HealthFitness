/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.UserDetails;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;
import org.openide.util.Exceptions;

/**
 *
 * @author perfect solution
 */
public class Sleep {
    private double time;
    private long hours;
    private long minutes;
    private LocalDate date;

    public Sleep() {
        
    }

    
    
    public Sleep(Float time) {
        this.time = time;
        hours = time.longValue();
        minutes = (long) ((time - hours)*60);
    }

    public Sleep(long hours, long minutes) {
        this.hours = hours;
        this.minutes = minutes;
        this.time = hours + minutes/60;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
        
    }

    public long getHours() {
        return hours;
    }

    public void setHours(long hours) {
        this.hours = hours;
    }

    public long getMinutes() {
        return minutes;
    }

    public void setMinutes(long minutes) {
        this.minutes = minutes;
    }
    
    
    
    
    public Duration sleepMode() {
        /*
         LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);
         */

        Runtime runtime = Runtime.getRuntime();
        Instant start = Instant.now();
        
        
        try {
            runtime.exec("rundll32.exe powrprof.dll,SetSuspendState 0,1,0");
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        
        
        JOptionPane.showConfirmDialog(null,
                "End Sleep Mode?",
                "Sleep Mode",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        Instant end = Instant.now();
        date = LocalDate.now();
        
        Duration timeElapsed = Duration.between(start, end);
        this.hours = timeElapsed.toHours();
        this.minutes = timeElapsed.toMinutes() % 60;
        this.time = (double)hours + (double)minutes/60;
        System.out.println("Time elapsed: " + hours + " hours and " + minutes + " minutes");
        return timeElapsed;

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
