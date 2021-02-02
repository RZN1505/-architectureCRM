package ru.geekbrains.java.crm;

public class CRM  {
    public static void main(String[] args) {
        OneClub oneClub = new OneClub(new ClubOneFactory());
        Client client = oneClub.getClient();
        Admin admin = oneClub.getAdmin();
        Trainer trainer = oneClub.getTrainer();
        client.workOut();
    }
}


