package ru.geekbrains.java.crm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClubOneAdmin implements Admin, UpPlanService {
    private List<Observer> observerList = new ArrayList<>();
    public void drawUpPlan(int clientId, int trainerId, int kindId)
    {
        System.out.println("ClubOneAdmin drawUpPlan");
    }

    public void addObserver(Observer obs) {
        observerList.add(obs);
    }

    public void deleteObserver(Observer obs) {
        observerList.remove(obs);
    }

    public void notify(String strUpdateInfo){
        for (Observer observer : observerList) {
            observer.update(this, strUpdateInfo);
        }
    }

    @Override
    public Map getUpPlanById (int clientId) {
        Map<Integer, String> dictionary = new HashMap<>();
        dictionary.put(clientId, "upPlan1");
        System.out.println("DrawUpPlan from bd");

      return  dictionary;
    }
}
