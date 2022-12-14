package ru.mirea.task24.task24_2;

public class Client {
    private String name;
    private int age;
    Client(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void sit(Chair chair) {
        System.out.println("Client sat down on " + chair.toString());
    }
}
