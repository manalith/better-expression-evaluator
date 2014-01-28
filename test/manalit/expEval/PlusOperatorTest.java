package manalit.expEval;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PlusOperatorTest {
    @Test
    public void testAddition(){
        Operator subject = new PlusOperator();
        double result = subject.operate(new Expression(2d), new Expression(3d));

        assertEquals(5d, result);
    }
    
    @Test
    public void testAdditionOfMinusNumber(){
        Operator subject = new PlusOperator();
        double result = subject.operate(new Expression(2.0), new Expression(-3.0));

        assertEquals(-1.0, result);
    }
}
