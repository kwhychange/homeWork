
import org.junit.Test;
import static org.junit.Assert.*;

public class StatsObjTest {
    @Test
    public void abcTest1() {
        boolean result = StatsObj.abcTest("123abc");
        assertEquals(true, result);
    }
    @Test
    public void abcTest2() {
        boolean result = StatsObj.abcTest("123.abc");
        assertEquals(false, result);
    }
    @Test
    public void abcTest3() {
        boolean result = StatsObj.abcTest("abc.123");
        assertEquals(true, result);
    }
    @Test
    public void abcTestBlank() {
        boolean result = StatsObj.abcTest("");
        assertEquals(false, result);
    }
    @Test
    public void alternateStrings1() {
        String result = StatsObj.alternateStrings("abc" , "xyz");
        assertEquals("axbycz" , result);
    }
    @Test
    public void alternateStrings2() {
        String result = StatsObj.alternateStrings("Hi" , "There");
        assertEquals("HTihere" , result);
    }
    @Test
    public void alternateStrings3() {
        String result = StatsObj.alternateStrings("xxxx" , "Thereee");
        assertEquals("xTxhxexreee" , result);
    }
    @Test
    public void alternateStrings4() {
        String result = StatsObj.alternateStrings("Thereee" , "xxxx");
        assertEquals("Txhxexrxeee" , result);
    }
    @Test
    public void alternateStringsBlank() {
        String result = StatsObj.alternateStrings("" , "");
        assertEquals("" , result);
    }
}