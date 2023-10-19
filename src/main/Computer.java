package main;

public class Computer {
    int ScreenSize;
    CPU myCPU;
    RAM myRAM;

    public Computer(int ScreenSize,  CPU myCPU, RAM myRAM ){
        this.ScreenSize = ScreenSize;
        this.myCPU= myCPU;
        this.myRAM=myRAM;

    }

}
