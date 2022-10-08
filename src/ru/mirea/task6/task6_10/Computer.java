package ru.mirea.task6.task6_10;

//Создать класс, описывающий сущность компьютер (Computer). Для
//описания составных частей компьютера использовать отдельные классы
//(Processor, Memory, Monitor). Описать необходимые свойства и методы для
//каждого класса. Для названий марок компьютера используйте перечисления (enum)

public class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private ComputerBrands brand;

    public Computer(Processor processor, Memory memory, Monitor monitor, ComputerBrands brand) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.brand = brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public ComputerBrands getBrand() {
        return brand;
    }

    public void setBrand(ComputerBrands brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", monitor=" + monitor +
                ", brand=" + brand +
                '}';
    }
}
