package manalit.expEval;

/**
 * Created by manalit on 1/27/14.
 */
public class Expression {
    Double value;
    Expression left, right;
    Operator operator;

    public Expression(Double value){
        this.value = value;
    }

    Expression(Expression left, Expression right, Operator operator){
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public double evaluate(){
        return (value!=null)? value: operator.operate(left,right);
    }
}