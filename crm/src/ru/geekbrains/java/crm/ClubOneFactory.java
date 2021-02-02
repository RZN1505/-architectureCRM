package ru.geekbrains.java.crm;

public class ClubOneFactory extends  Human {
    public Client createClient() {
        return new ClubOneClient();
    }

    public Admin createAdmin() {
        return new ClubOneAdmin();
    }

    public Trainer createTrainer() {
        return new ClubOneTrainer();
    }
}