package com.kaiv.patterns.Behavioral.Interpreter;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String exp = "a + b";
        Expression parse = parse(exp);

        Map<String, Integer> context = new HashMap<>();
        context.put("a", 10);
        context.put("b", 3);

        int result = parse.interpret(context);
        System.out.println(result);

    }

    private static Expression parse(String exp){

        ArrayDeque<Expression> stack = new ArrayDeque<>();

        Arrays.stream(exp.split(" ")).filter(token -> Character.isLetter(token.charAt(0))).forEach(token -> {
            stack.push(parseToken(token, stack));
        });

        Arrays.stream(exp.split(" ")).filter(token -> !Character.isLetter(token.charAt(0))).forEach(token -> {
            stack.push(parseToken(token, stack));
        });
        return stack.pop();
    }

    private static Expression parseToken(String token, ArrayDeque<Expression> stack){

        Expression left, right;

        switch (token){
            case "+":
                right = stack.pop();
                left = stack.pop();
                return Expression.Plus(left, right);
            default:
                return Expression.variable(token);
        }
    }
}
