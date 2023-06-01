package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Context context = new Context();
        context.setVariable("x", 5);
        context.setVariable("y", 7);
        context.setVariable("z", 10);

        Expression expression = new AddExpression(
                new MultipleExpression(
                        new MinusExpression(
                                new NumberExpression(context.getVariable("z")),
                                new NumberExpression(context.getVariable("x"))
                        ),
                        new NumberExpression(context.getVariable("x"))
                ),
                new DivideExpression(
                        new NumberExpression(context.getVariable("y")),
                        new NumberExpression(context.getVariable("x"))
                )
        );
        logger.info("Result: {}", expression.interpret(context));
    }
}
