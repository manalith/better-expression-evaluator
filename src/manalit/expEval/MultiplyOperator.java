package manalit.expEval;

/**
 * Created by manalit on 1/28/14.
 */
public class MultiplyOperator implements Operator {
    @Override
    public double operate(Expression right, Expression left) {
        return right.evaluate() * left.evaluate();
    }
}
