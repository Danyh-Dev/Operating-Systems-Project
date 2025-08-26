/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osproject;

/**
 *
 * @author ASUS
 */
class Process {
    int id;             
    int arrivalTime;    
    int burstTime;      
    int remainingTime;  
    int completionTime; 
    int waitingTime;    
    int turnaroundTime; 
    boolean completed;
    int switchCount;

    public Process(int id, int arrivalTime, int burstTime) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.remainingTime = burstTime; 
        this.completionTime = 0;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
        this.switchCount = 0;
        this.completed = false;
    }

}