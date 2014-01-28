package manalit.expEval;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by manalit on 1/28/14.
 */
public class MultiplyOperatorTest {
    @Test
    public void testMultiply(){
        Operator subject = new MultiplyOperator();
        double result = subject.operate(new Expression(3d), new Expression(2d));

        assertEquals(6d, result);
    }
}
