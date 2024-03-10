import java.util.Stack;

public class InfixExpressionCalculator {
    public static void main(String[] args) {
        String expression = "(1 + 2 / 4 * 5) - (12 + 43) ^ 2";
        double result = calculateInfixExpression(expression);
        System.out.println("Result: " + result);
    }

    public static double calculateInfixExpression(String expression) {
        String[] tokens = expression.split(" ");
        Stack<Double> operandStack = new Stack<>();
        Stack<String> operatorStack = new Stack<>();

        for (String token : tokens) {
            if (isNumeric(token)) {
                operandStack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                while (!operatorStack.isEmpty() && hasHigherPrecedence(operatorStack.peek(), token)) {
                    double operand2 = operandStack.pop();
                    double operand1 = operandStack.pop();
                    double result = performOperation(operatorStack.pop(), operand1, operand2);
                    operandStack.push(result);
                }
                operatorStack.push(token);
            } else if (token.equals("(")) {
                operatorStack.push(token);
            } else if (token.equals(")")) {
                while (!operatorStack.peek().equals("(")) {
                    double operand2 = operandStack.pop();
                    double operand1 = operandStack.pop();
                    double result = performOperation(operatorStack.pop(), operand1, operand2);
                    operandStack.push(result);
                }
                operatorStack.pop();
            }
        }

        while (!operatorStack.isEmpty()) {
            double operand2 = operandStack.pop();
            double operand1 = operandStack.pop();
            double result = performOperation(operatorStack.pop(), operand1, operand2);
            operandStack.push(result);
        }

        return operandStack.pop();
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("^");
    }

    public static boolean hasHigherPrecedence(String operator1, String operator2) {
        int precedence1 = getOperatorPrecedence(operator1);
        int precedence2 = getOperatorPrecedence(operator2);
        return precedence1 >= precedence2;
    }

    public static int getOperatorPrecedence(String operator) {
        switch (operator) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
            default:
                return -1;
        }
    }

    public static double performOperation(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            case "^":
                return Math.pow(operand1, operand2);
            default:
                return 0;
        }
    }
}
