package ru.mirea.task4.task4_4;

public class Monitor {
    private String resolution;

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Monitor(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolution='" + resolution + '\'' +
                '}';
    }
}
