package manalit.expEval;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionTest {
    @Test
    public void testEvaluate() throws Exception {
        Expression expression = new Expression(new Expression(2d), new Expression(3d), new PlusOperator());

        assertEquals(5d, expression.evaluate());
    }
}