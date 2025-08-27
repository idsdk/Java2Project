package w0827;

import java.util.Random;

public class Verbs {
    public static void main(String[] args) {
        String[] verbs = {"삶이 있는 한 희망은 있다.", "산다는 것 그것은 치열한 전투이다.", "직업에서 행복을 찾아라. 아니면 행복이 무엇인지 절대 모를 것이다", "신은 용기있는자를 결코 버리지 않는다", "피할수 없으면 즐겨라", "내일은 내일의 태양이 뜬다", "계단을 밟아야 계단 위에 올라설수 있다", "행복은 습관이다,그것을 몸에 지니라"};

        Random rand = new Random();

        int todayIndex = rand.nextInt(verbs.length);
        System.out.println("오늘의 명언 : " + verbs[todayIndex]);
    }
}
