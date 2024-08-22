package Java_zadachi.TopInterview_150;

import java.util.*;

//https://leetcode.com/problems/insert-delete-getrandom-o1/description/?envType=study-plan-v2&envId=top-interview-150

/*
2 Способа:
 1. Две Хешмапы (27ms)
 2. Хешмап и Лист (чуть проще и может быть быстрее, 26ms)
 */


public class Q_12_InsertDeleteGetRandom {
    public static void main(String[] args) {
        RandomizedSet tmp = new RandomizedSet();

        tmp.insert(5);
        tmp.insert(12);
        tmp.insert(6);
        tmp.insert(8);

        for (int i = 0; i < 20; i++) {
            System.out.println(tmp.getRandom());
        }

        System.out.println("    ");

        tmp.remove(5);
        tmp.remove(12);
        tmp.remove(6);

        for (int i = 0; i < 10; i++) {
            System.out.println(tmp.getRandom());
        }

    }
}

class RandomizedSet {
    Map<Integer, Integer> indexes;
    Random randObj;
    int lastIndx = -1;
    Map<Integer, Integer> dict;

    public RandomizedSet() {
        randObj = new Random();
        dict = new HashMap<>();
        indexes = new HashMap<>();
    }

    public boolean insert(int val) {
        if (dict.containsKey(val)) return false;
        else {
            indexes.put(++lastIndx, val);
            dict.put(val, lastIndx);
            return true;
        }
    }

    //вместо удаления нужно поменять удаляемый с последним, а потом удалить последний
    public boolean remove(int val) {
        if (dict.containsKey(val)) {
            int indxRemove = dict.get(val); //индекс удаляемого числа
            int lastIntgr = indexes.get(lastIndx); //последнее число
            indexes.replace(indxRemove, lastIntgr);
            indexes.remove(lastIndx);
            dict.replace(lastIntgr, indxRemove);
            dict.remove(val);
            lastIndx--;
            return true;
        } else {
            return false;
        }
    }
    public int getRandom() {
        int indx = randObj.nextInt(0, lastIndx + 1);
        return indexes.get(indx);
    }
}

class RandomizedSet2 {

    Map<Integer, Integer> map;
    List<Integer> list;
    Random random;

    public RandomizedSet2() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        int lastElement = list.get(list.size() - 1);
        list.set(map.get(val), lastElement);
        map.put(lastElement, map.get(val));
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
