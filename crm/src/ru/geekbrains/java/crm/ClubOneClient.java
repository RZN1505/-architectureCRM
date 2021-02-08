package ru.geekbrains.java.crm;

public class ClubOneClient implements Client {
    public void workOut() {
        System.out.println("ClubOneClient workOut");
    }
    public void update(Admin subjectAdmin, String strUpdateInfo) {
        System.out.println("ClubOneClientObserver update from AdminSubject" + strUpdateInfo);
    };
}
