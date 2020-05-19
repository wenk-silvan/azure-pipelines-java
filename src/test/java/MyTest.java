import com.microsoft.demo.Demo;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
    }

    @Test
    public void test_method_2() {
        assertTrue(false);
    }
}