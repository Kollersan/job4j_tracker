package ru.job4j.tracker;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("ride");
    }

    @Override
    public void passenger(int count) {
        System.out.println("Число пассажиров: " + count);
    }

    @Override
    public int gasPrice(int gasCount) {
        return gasCount * 60;
    }
}
