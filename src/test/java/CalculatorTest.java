import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {
    // 전체실행 : Shift + F10
    // 해당 메소드만 실행 : Ctrl + Shift + F10
    
    // 단축어 입력 후 Tab 누르면 자동완성, Ctrl + J 누르면 관련 단축어 목록 보여줌
    // Shift 두번 -> code template -> Live Templates에서 단축어 확인 및 커스텀 단축어 생성 가능

    Calculator calculator;
    Long time;

    // 메소드 실행 전 미리 동작해놓을 것들 작성 : Alt + Insert -> Setup Method
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        time = System.currentTimeMillis();
    }

    // 메소드가 끝난 후 실행될 것들 작성 : Alt + Insert -> TearDown Method
    @AfterEach
    void tearDown() {
        System.out.println("결과 : " + (System.currentTimeMillis() - time) + "ms"); // 끝난 후 시간 - 시작할 때 시간
    }

    // 테스트코드 먼저 작성 후 Alt + Enter -> Create Class / Method 하면 클래스 / 메소드 자동 생성
    @Test
    void plusTest() {
        int result = calculator.plus(1, 3);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void minusTest() {
        int result = calculator.minus(4, 2);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void multiplyTest() {
        int result = calculator.multiply(1, 3);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void divisionTest() {
        int result = calculator.division(4, 2);
        assertThat(result).isEqualTo(2);
    }
}