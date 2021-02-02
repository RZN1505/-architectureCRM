package ru.geekbrains.java.crm;

public class OneClub {
    private Client client;
    private Admin admin;
    private Trainer trainer;
    public OneClub (ClubOneFactory factory) {
        this.client = factory.createClient();
        this.admin = factory.createAdmin();
        this.trainer = factory.createTrainer();

    }
    public Client getClient() {
        return client;
    }

    public Admin getAdmin() {
        return admin;
    }

    public Trainer getTrainer() {
        return trainer;
    }
}
