package com.company;

public class Laptop {
    public String model = "Lenovo";
    public int memory = 256;
    public String colour = "gray";
    public int ram = 8;


    public double weight;
    public int price;

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", memory=" + memory +
                ", colour='" + colour + '\'' +
                ", ram=" + ram +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
