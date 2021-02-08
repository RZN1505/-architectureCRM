package ru.geekbrains.java.crm;

import java.util.ArrayList;
import java.util.List;

//subject
public interface Admin {
    public void drawUpPlan(int clientId, int trainerId, int kindId);

    // подключить Наблюдателя
    public void addObserver(Observer observer);

    // отключить Наблюдателя
    public void deleteObserver(Observer observer);

    // проинформировать подписантов об изменениях
    void notify(String strUpdateInfo);

}
