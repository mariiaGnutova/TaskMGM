import org.junit.Assert;
import org.junit.Test;

public class StringCountTest {

    @Test
    public void longString() {
        StringCount stringObject = new StringCount();
        Assert.assertTrue("a7b".contains(stringObject.lastFirstCount("ad1r4h6ib")));
    }

    @Test
    public void empty() {
        StringCount stringObject = new StringCount();
        Assert.assertTrue(stringObject.lastFirstCount("") == null);
    }

    @Test
    public void oneChar() {
        StringCount stringObject = new StringCount();
        Assert.assertTrue("1".contains(stringObject.lastFirstCount("1")));
    }

    @Test
    public void twoChars() {
        StringCount stringObject = new StringCount();
        Assert.assertEquals("Test message", "d01", stringObject.lastFirstCount("d1"));
    }

}