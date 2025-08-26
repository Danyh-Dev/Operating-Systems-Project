# Assignment2-Memory Fragmentation Simulation

This project is part of the Operating Systems course.  
It simulates **memory management** using a **Fixed Partition** scheme and demonstrates **First-Fit, Best-Fit, and Worst-Fit** allocation strategies.

## Objective

The goal of this project is to simulate how memory is allocated and managed in a system with fixed-size memory blocks.  
It also shows how different allocation strategies affect **internal fragmentation** and memory utilization.

## Requirements

### Memory Blocks
- Memory is divided into a fixed number of blocks, which may have unequal sizes.  
- Each block has a **size**, **start and end address**, **status** (free or allocated), and **process ID** if allocated.  

### Allocation Strategies
- **First-Fit**: allocate the first block large enough for the request.  
- **Best-Fit**: allocate the smallest block that fits the request.  
- **Worst-Fit**: allocate the largest block available.  

### Simulation Tasks
- Allocate memory to processes if there is enough space; calculate internal fragmentation.  
- Deallocate memory for a specific process.  
- Display a detailed memory report including block number, size, addresses, status, allocated process, and internal fragmentation.

## Features
- Initialize memory blocks with custom sizes  
- Allocate memory using First-Fit, Best-Fit, and Worst-Fit strategies  
- Release memory of a specific process  
- Display detailed memory report  
- Calculate internal fragmentation  

## My Contributions
- Coordinated the overall simulation and final integration  
- Wrote and managed the **main menu interactions**  
- Implemented the **report generation method**  
- Finalized the README and documentation  

## Technologies
- Java  
- Memory blocks represented as objects or arrays
