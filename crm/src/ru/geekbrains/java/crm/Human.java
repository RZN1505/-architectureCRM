package ru.geekbrains.java.crm;

public abstract class Human {
    public abstract Client createClient();
    public abstract Admin createAdmin();
    public abstract Trainer createTrainer();
}