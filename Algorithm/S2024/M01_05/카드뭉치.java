package Algorithm.S2024.M01_05;

public class 카드뭉치 {
    public static void main (String[]args){
        String [] cards1 = {"i", "drink", "water"};
        String [] cards2 = {"want", "to"};
        String [] cards3 = {"i", "want", "to", "drink", "water"};

        System.out.println(solution(cards1,cards2,cards3));

    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0, index2 = 0;
        int len1 = cards1.length, len2 = cards2.length;

        for (String word : goal) {
            if (index1 < len1 && word.equals(cards1[index1])) {
                index1++;
            } else if (index2 < len2 && word.equals(cards2[index2])) {
                index2++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
