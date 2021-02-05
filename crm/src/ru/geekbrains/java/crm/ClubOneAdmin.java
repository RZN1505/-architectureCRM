package ru.geekbrains.java.crm;

import java.util.HashMap;
import java.util.Map;

public class ClubOneAdmin implements Admin, UpPlanService {
    public void drawUpPlan() {
        System.out.println("ClubOneAdmin drawUpPlan");
    }
    @Override
    public Map getUpPlanById (int clientId) {
        Map<Integer, String> dictionary = new HashMap<>();
        dictionary.put(clientId, "upPlan1");
        System.out.println("DrawUpPlan from bd");

      return  dictionary;
    }
}
