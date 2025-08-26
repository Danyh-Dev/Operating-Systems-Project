# Process Scheduling Simulator

This project is part of the Operating Systems course.  
It simulates CPU process scheduling using the Shortest Remaining Time First (SRTF / Preemptive SJF) algorithm with FCFS as a tie-breaker when processes have equal burst times.

## Objective

The main goal of this project is to implement a CPU scheduling algorithm and simulate how it behaves in a multiprogramming environment.  
It also aims to demonstrate the algorithm's performance in terms of:  
- CPU utilization  
- Average turnaround time  
- Average waiting time  

## Requirements

### Processes
- Each process has a unique ID, an arrival time, and a CPU burst time.  
- Processes are represented as objects or data structures.

### Scheduling Algorithm
- Implements Shortest Remaining Time First (SRTF / Preemptive SJF).  
- Uses FCFS to break ties when two processes have the same CPU burst time.

### Event-Driven Simulation
- The simulation is event-driven, mimicking the passage of time and execution of processes.  
- An event queue keeps track of upcoming events like process arrival, start, and termination.

### Performance Metrics
- The program calculates and displays:  
  - CPU utilization  
  - Average turnaround time  
  - Average waiting time  

## Features
- Manual input of processes (ID, arrival time, CPU burst time)  
- Preemption is demonstrated  
- Displays a Gantt chart showing when each process starts and ends  
- Calculates and shows performance metrics  

## My Contributions
- Calculated and displayed performance metrics  
- Implemented Gantt chart visualization  
- Reviewed and debugged the code  

## Technologies
- Java  
- Processes represented as objects / data structures
