package ru.geekbrains.java.crm;

public class ClubOneTrainer implements Trainer {
    public void train() {
        System.out.println("ClubOneTrainer train");
    }

    public void update(Admin subjectAdmin, String strUpdateInfo) {
        System.out.println("ClubOneTrainerObserver update from AdminSubject" + strUpdateInfo);
    };
}
