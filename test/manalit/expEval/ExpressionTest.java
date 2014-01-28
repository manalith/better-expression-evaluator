package manalit.expEval;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionTest {
    @Test
    public void testEvaluate() throws Exception {
        Expression expression = new Expression(new Expression(2d), new Expression(3d), new PlusOperator());
        assertEquals(5.0, expression.evaluate());
    }

    @Test
    public void test_for_evaluate_expression_with_multiple_operator() throws Exception {
        Expression expression = new Expression(new Expression(2.0), new Expression(3.0), new MinusOperator());
        assertEquals(-1.0, expression.evaluate());
    }

    @Test
    public void test_for_evaluate_expression() throws Exception {
        Expression twoPlusThree = e(e(3), e(2), plus());
        Expression multiplyByFour = e(twoPlusThree, e(4), multiply());
        Expression threeMultiplyByTwo = e(e(3), e(2), multiply());
        Expression expression = e(multiplyByFour, threeMultiplyByTwo, plus());
        assertEquals(26.0, expression.evaluate());
    }

    @Test
    public void test_for_evaluate_expression1() throws Exception {
        Expression threePlusFour = e(e(4), e(3), plus());
        Expression twoMultiplyThree= e(e(3), e(2), multiply());
        Expression addBoth = e(threePlusFour, twoMultiplyThree, plus());
        Expression substractThree = e(e(3), addBoth, minus());
        Expression divideFive = e(e(5), substractThree, division());
        assertEquals(2.0, divideFive.evaluate());
    }

    public static Expression e(double n) {
        return new Expression(n);
    }

    public static Expression e(Expression l, Expression r, Operator o) {
        return new Expression(r, l, o);
    }

    public static Operator plus() {
        return new PlusOperator();
    }

    public static Operator minus() {
        return new MinusOperator();
    }

    public static Operator division() {
        return new DivisionOperator();
    }

    public static Operator multiply() {
        return new MultiplyOperator();
    }
}