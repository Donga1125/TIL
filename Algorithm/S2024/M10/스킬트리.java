package Algorithm.S2024.M10;

public class 스킬트리 {
    public static void main (String[] args){
        System.out.println(solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String skill_tree : skill_trees) {
            String filteredSkills = "";

            // 스킬트리에서 skill에 포함된 스킬만 추출
            for (int i = 0; i < skill_tree.length(); i++) {
                if (skill.contains(String.valueOf(skill_tree.charAt(i)))) {
                    filteredSkills += skill_tree.charAt(i);
                }
            }

            // 추출된 스킬이 선행 스킬 순서를 만족하는지 확인
            if (skill.startsWith(filteredSkills)) {
                answer++;
            }
        }

        return answer;
    }

}
