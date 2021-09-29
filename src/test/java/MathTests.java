import org.junit.Assert;
import org.junit.Test;

public class MathTests {
    @Test
    public void test_add_1() {
        Assert.assertEquals(7, Math.add(3, 4));
    }

    @Test
    public void test_add_2() {
        Assert.assertEquals(6, Math.add(3, 3));
    }
}
