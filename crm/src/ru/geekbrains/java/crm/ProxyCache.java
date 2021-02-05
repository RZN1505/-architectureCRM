package ru.geekbrains.java.crm;

import java.util.HashMap;
import java.util.Map;

public class ProxyCache implements UpPlanService {
    // ссылка на класс админа
    private final ClubOneAdmin admin = new ClubOneAdmin();

    // кэш графика
    private final HashMap<Integer, Map> plans = new HashMap<>();

    @Override
    public Map getUpPlanById (int clientId) {
        // если график уже имеется в кэше, выдать из кэша
        if (plans.containsKey(clientId)) {
            return plans.get(clientId);
        }
        // если еще нет, то запросить реальный (долгий) сервис
        else {
            Map plan = admin.getUpPlanById(clientId);
            plans.put(clientId, plan);
            return plan;
        }
    }

}
