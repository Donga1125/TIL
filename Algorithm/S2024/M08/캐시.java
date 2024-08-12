package Algorithm.S2024.M08;

import java.util.LinkedList;

public class 캐시 {

    public static void main (String [] args){

        System.out.println(solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
        System.out.println(solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));
        System.out.println(solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        System.out.println(solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        System.out.println(solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}));
        System.out.println(solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));

    }

    public static int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        LinkedList<String> cache = new LinkedList<>();
        int totalTime = 0;

        for (String city : cities) {
            city = city.toLowerCase();

            if (cache.contains(city)) {
                cache.remove(city);
                cache.addLast(city);
                totalTime += 1;
            } else {
                if (cache.size() == cacheSize) {
                    cache.removeFirst(); // LRU 삭제
                }
                cache.addLast(city);
                totalTime += 5;
            }
        }

        return totalTime;
    }
}
