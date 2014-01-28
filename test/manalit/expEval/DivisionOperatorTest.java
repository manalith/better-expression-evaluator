package manalit.expEval;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by manalit on 1/28/14.
 */
public class DivisionOperatorTest {
    @Test
    public void testDivision(){
        Operator subject = new DivisionOperator();
        double result = subject.operate(new Expression(6d), new Expression(2d));

        assertEquals(3d, result);
    }
    @Test
    public void testDivision1(){
        Operator subject = new DivisionOperator();
        double result = subject.operate(new Expression(6.0), new Expression(2.0));

        assertEquals(3.0, result);
    }
}
