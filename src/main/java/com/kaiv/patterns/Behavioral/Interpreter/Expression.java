package com.kaiv.patterns.Behavioral.Interpreter;

import java.util.Map;

interface Expression {
    int interpret(Map<String, Integer> context);

    static Expression Plus(Expression left, Expression right){
        return context -> left.interpret(context) + right.interpret(context);
    }

    static Expression variable(String name){
        return context -> context.getOrDefault(name, 0);
    }
}