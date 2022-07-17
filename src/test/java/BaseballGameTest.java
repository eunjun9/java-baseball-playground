import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaseballGameTest {

    BaseballGame baseballGame;
    int random;
    String result;

    @BeforeEach
    void setUp() {
        random = (int)(Math.random() * (999-100+1)) + 100; //456;
        result = "456";
    }

    @Test
    void gameTest() {
        int bs;
        char barr[] = String.valueOf(random).toCharArray();
        char carr[] = result.toCharArray();

        int strike = 0, ball = 0, out = 0;

        for (int i = 0; i < 3; i++) {
            bs = String.valueOf(random).indexOf(result.charAt(i));
//            System.out.println(bs);
            if(bs != -1) {
                if(barr[i] == carr[i]) {
                    strike++;
                } else {
                    ball++;
                }
            }
            if(bs == -1) out++; // if(조건) -> Ctrl + Shift + Enter : 중괄호 자동 생성
        }

        System.out.println("정답 : " + random);
        System.out.println(strike + "스트라이크 " + ball + "볼 " + out + "아웃");
    }

}
