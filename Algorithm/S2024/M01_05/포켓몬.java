package Algorithm.S2024.M01_05;
import java.util.HashSet;

public class 포켓몬 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,3}));
    }
        public static int solution(int[] nums) {
        int maxPokemon = nums.length / 2;
        HashSet<Integer> uniquePokemon = new HashSet<>();

        for (int num : nums) {
            uniquePokemon.add(num);
        }

        return Math.min(maxPokemon, uniquePokemon.size());
    }
}
