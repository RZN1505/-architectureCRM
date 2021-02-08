package ru.geekbrains.java.crm;

//observer
public interface Observer {
    public void update(Admin subjectAdmin, String strUpdateInfo);
}