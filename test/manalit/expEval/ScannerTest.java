package manalit.expEval;

import org.junit.Assert;
import org.junit.Test;

public class ScannerTest {
    @Test
    public void testGivesTheNextCharacterOfString() throws Exception {
        Scanner sc = new Scanner("manu");

        Assert.assertEquals('m', sc.next());
        Assert.assertEquals('a', sc.next());
        Assert.assertEquals('n', sc.next());
        Assert.assertEquals('u', sc.next());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testWhenNextIsNotPresent() throws Exception {
        Scanner sc = new Scanner("");

        sc.next();
    }

    @Test
    public void testWithWhiteSpaces() throws Exception {
        Scanner sc = new Scanner(" a");

        Assert.assertEquals('a', sc.next());
    }

    @Test
    public void testWhiteSpacesBetweenCharacters() throws Exception {
        Scanner sc = new Scanner("b a");

        Assert.assertEquals('b', sc.next());
        Assert.assertEquals('a', sc.next());
    }

    @Test
    public void testMultipleWhiteSpaces() throws Exception {
        Scanner sc = new Scanner("b      a");

        Assert.assertEquals('b', sc.next());
        Assert.assertEquals('a', sc.next());
    }
}
