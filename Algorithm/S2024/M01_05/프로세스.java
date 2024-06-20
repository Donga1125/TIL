package Algorithm.S2024.M01_05;

import java.util.LinkedList;
import java.util.Queue;

public class 프로세스 {
        public static void main(String[] args) {
            System.out.println(solution(new int[]{2,1,3,2}, 2));
        }
        public static int solution(int[] priorities, int location) {
            int answer = 0;
            Queue<Document> queue = new LinkedList<>();

            for (int i = 0; i < priorities.length; i++) {
                queue.offer(new Document(i, priorities[i]));
            }

            int order = 1;
            while (!queue.isEmpty()) {
                Document current = queue.poll();
                boolean isPrinted = true;

                for (Document doc : queue) {
                    if (doc.priority > current.priority) {
                        isPrinted = false;
                        break;
                    }
                }

                if (!isPrinted) {
                    queue.offer(current);
                } else {
                    if (current.index == location) {
                        answer = order;
                        break;
                    }
                    order++;
                }
            }

            return answer;
        }

        static class Document {
            int index;
            int priority;

            public Document(int index, int priority) {
                this.index = index;
                this.priority = priority;
            }
        }
    }
