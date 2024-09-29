package org.example.javattd28.service;

import org.example.javattd28.rapido.Task;
import org.example.javattd28.rapido.Vehicle;

import java.util.Date;

public class JobTaskMapping {

    public Task task;
    public Vehicle vehicle;
    public Date startTime;
    public Date endTime;

    @Override
    public String toString() {
        return "JobTaskMapping{" +
                "task=" + task +
                ", vehicle=" + vehicle +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
