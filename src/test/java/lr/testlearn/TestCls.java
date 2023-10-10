package lr.testlearn;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestCls {

    private static final Logger LOG = LoggerFactory.getLogger(MainCls.class);

    @Test
    @DisplayName("mytest1")
    public void my1Test() throws Exception {

        int a = 10;
        Thread.sleep(3000);

        Assertions.assertThat(a).isEven();
        Assertions.assertThat(a).isEqualTo(10);
    }

    @Test
    @DisplayName("mytest2")
    public void my2Test() {

        int b = 5;
        int[] arr = {1, 2, 3, 4, 5};
        Assertions.assertThat(b).isEqualTo(5);
        Assertions.assertThat(arr).hasSize(5);
        Assertions.assertThat(b).isOdd();

    }
}
