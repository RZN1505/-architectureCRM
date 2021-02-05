package ru.geekbrains.java.crm;

import java.util.Map;

public class CRM  {
    public static void main(String[] args) {
        OneClub oneClub = new OneClub(new ClubOneFactory());
        Client client = oneClub.getClient();
        Admin admin = oneClub.getAdmin();
        Trainer trainer = oneClub.getTrainer();
        client.workOut();

        UpPlanService proxyCache = new ProxyCache();
        Map plan = proxyCache.getUpPlanById(1);
        String planInfo = (String) plan.get(1);
        System.out.println(planInfo);
    }
}


