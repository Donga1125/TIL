package Algorithm.S2024.M11;

public class 방금그곡 {
    public static void main (String[] args){
        System.out.println(solution("ABCDEFG", new String[]{"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"} ));

    }

    public static String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int maxPlayTime = 0;

        //입력된 멜로디와 악보에서 #을 소문자로 변환하여 통일
        String memory = convertMelody(m);

        for (String info : musicinfos) {
            String[] details = info.split(",");
            String startTime = details[0];
            String endTime = details[1];
            String title = details[2];
            String melody = convertMelody(details[3]);

            //재생 시간 계산
            int playTime = calculatePlayTime(startTime, endTime);

            //재생 시간에 맞춰서 전체 재생 멜로디를 생성
            String playedMelody = buildPlayedMelody(melody, playTime);

            //기억한 멜로디가 전체 재생 멜로디에 포함되는지 확인
            if (playedMelody.contains(memory)) {
                //가장 긴 재생 시간 먼저, 재생 시간이 같으면 먼저 입력된 곡 먼저
                if (playTime > maxPlayTime) {
                    maxPlayTime = playTime;
                    answer = title;
                }
            }
        }

        return answer;
    }


    
    //시작 시간과 종료 시간을 이용해 재생 시간을 분 단위로 계산
    private static int calculatePlayTime(String start, String end) {
        String[] startTime = start.split(":");
        String[] endTime = end.split(":");
        int startHour = Integer.parseInt(startTime[0]);
        int startMinute = Integer.parseInt(startTime[1]);
        int endHour = Integer.parseInt(endTime[0]);
        int endMinute = Integer.parseInt(endTime[1]);

        return (endHour * 60 + endMinute) - (startHour * 60 + startMinute);
    }


    //#포함된 음을 소문자로 변환하여 멜로디 통일
    private static String convertMelody(String melody) {
        return melody.replace("C#", "c")
                .replace("D#", "d")
                .replace("F#", "f")
                .replace("G#", "g")
                .replace("A#", "a");
    }

    //재생 시간에 맞춰 반복하여 전체 재생 멜로디 생성
    private static String buildPlayedMelody(String melody, int playTime) {
        StringBuilder playedMelody = new StringBuilder();
        int melodyLength = melody.length();

        for (int i = 0; i < playTime; i++) {
            playedMelody.append(melody.charAt(i % melodyLength));
        }

        return playedMelody.toString();
    }
}
