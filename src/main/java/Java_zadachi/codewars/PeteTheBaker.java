package Java_zadachi.codewars;

import java.util.Map;

public class PeteTheBaker {

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        if (recipe.keySet().size() > available.keySet().size()) return 0;
        int minAmount = Integer.MAX_VALUE, tmp;
        for (String recipPart : recipe.keySet()) {
            if (!available.containsKey(recipPart)) return 0;
            else {
                tmp = available.get(recipPart) / recipe.get(recipPart);
                if (tmp < minAmount) minAmount = tmp;
            }
        }
        return minAmount;
    }

    public static void main(String[] args) {
        Map<String, Integer> recipe = Map.of("flour", 500, "sugar", 200, "eggs", 1);
        Map<String, Integer> available = Map.of("flour", 1200, "sugar", 1200, "eggs", 5, "milk", 200);

        System.out.println(cakes(recipe, available));
    }
}
