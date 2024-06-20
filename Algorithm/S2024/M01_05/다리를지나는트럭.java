package Algorithm.S2024.M01_05;
import java.util.*;
public class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
            Queue<Integer> bridge = new LinkedList<>();
            int time = 0;
            int currentWeight = 0;

            for (int truck : truck_weights) {
                while (true) {
                    if (bridge.isEmpty()) {
                        bridge.offer(truck);
                        currentWeight += truck;
                        time++;
                        break;
                    } else if (bridge.size() == bridge_length) {
                        currentWeight -= bridge.poll();
                    } else {
                        if (currentWeight + truck <= weight) {
                            bridge.offer(truck);
                            currentWeight += truck;
                            time++;
                            break;
                        } else {
                            bridge.offer(0);
                            time++;
                        }
                    }
                }
            }

            return time + bridge_length;
        }
    }

