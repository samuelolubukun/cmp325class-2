package main;

public class RAM {
    float capacity;
    String type;


    public RAM(float capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }


    @Override
    public String toString() {
        return "RAM{" +
                "capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }
}

