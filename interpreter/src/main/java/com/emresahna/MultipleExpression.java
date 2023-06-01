package com.emresahna;

public class MultipleExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public MultipleExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) * rightExpression.interpret(context);
    }
}
