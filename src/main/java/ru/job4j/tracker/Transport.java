package ru.job4j.tracker;

public interface Transport {
    void ride();

    void passenger(int count);

    int gasPrice(int gasCount);
}
