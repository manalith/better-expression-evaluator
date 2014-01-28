package manalit.expEval;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by manalit on 1/28/14.
 */
public class MinusOperatorTest {
    @Test
    public void testSubstraction(){
        Operator subject = new MinusOperator();
        double result = subject.operate(new Expression(3d), new Expression(2d));

        assertEquals(1d, result);
    }
}
