package lr.sprngbut;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SprngbutApplicationTests {

	@Test
    void TestingTest() {
            Assertions.assertThat(1).isEqualTo(1);
	}
}
