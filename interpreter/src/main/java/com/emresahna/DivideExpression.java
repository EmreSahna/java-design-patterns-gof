package com.emresahna;

public class DivideExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public DivideExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) / rightExpression.interpret(context);
    }
}
