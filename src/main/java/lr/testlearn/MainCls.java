package lr.testlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainCls {

    private static final Logger log = LoggerFactory.getLogger(MainCls.class);

    @Override
    public String toString() {
        return "MainCls{" + '}';
    }

    public static void main(String[] args) {

        String toString = new MainCls().toString();

        System.out.println(toString);

    }
}
