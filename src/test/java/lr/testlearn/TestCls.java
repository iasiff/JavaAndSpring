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
    public void my1Test() {

        int a = 10;
        Assertions.assertThat(a).isEven();
        Assertions.assertThat(a).isEqualTo(10);
    }

    @Test
    @DisplayName("mytest2")
    public void my2Test() {

        int b = 5;
        int[] arr = {1, 2, 3, 4, 5};
        Assertions.assertThat(b).isEqualTo(5);
        Assertions.assertThat(b).isOdd();
    }

    @Test
    @DisplayName("mytest3")
    public void my3Test() throws Exception {

        int a = 10;
        Assertions.assertThat(a).isEven();
        Assertions.assertThat(a).isEqualTo(10);
    }

    @Test
    @DisplayName("mytest4")
    public void my4Test() {

        int b = 5;
        int[] arr = {1, 2, 3, 4, 5};
        Assertions.assertThat(b).isEqualTo(5);
        Assertions.assertThat(b).isOdd();

    }
}
