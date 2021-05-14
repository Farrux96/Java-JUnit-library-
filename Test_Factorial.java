package TestData;
import JUnit.After;
import JUnit.Assert;
import JUnit.Before;
import JUnit.Test;
public class FactorialTest {
    private MyMath instance;
    @Before
    public void beforeEach() {
        instance = new MyMath();
    }
    @Test
    public void factorialTest() {
        int x = instance.factorial(10);
        assert(x == 3628800);
    }
    @Test(expected = Exception.class)
    public void testFactorialExeption() throws Exception {
        instance.factorialExeption(-42);
    }
    @After
    public void afterEach() {
        Assert.isFalse(true);
    }
}
