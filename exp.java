import java.util.Scanner;

public class exp {
    public static void main(String[] args) {
        int i, otop = -1, ptop = -1;
        int len;
        String[] infix;
        String[] post;
        String[] op;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an infix expression: ");
        String expression = scanner.nextLine();

        infix = expression.split(" ");
        len = infix.length;
        post = new String[len];
        op = new String[len];

        for (i = 0; i < len; i++) {
            String str = infix[i];

            if (isNumeric(str)) {
                post[++ptop] = str;
            } else if (str.equals("(")) {
                op[++otop] = str;
            } else if (str.equals(")")) {
                while (otop != -1 && !op[otop].equals("(")) {
                    post[++ptop] = op[otop--];
                }
                if (otop != -1 && !op[otop].equals("(")) {
                    System.out.println("Invalid Expression");
                    return;
                } else {
                    otop--;
                }
            } else {
                while (otop != -1 && precedence(str) <= precedence(op[otop])) {
                    post[++ptop] = op[otop--];
                }
                op[++otop] = str;
            }
        }

        while (otop != -1) {
            post[++ptop] = op[otop--];
        }

        // Printing the postfix expression
        System.out.print("Postfix expression: ");
        for (i = 0; i <= ptop; i++) {
            System.out.print(post[i] + " ");
        }
    }

    public static int precedence(String str) {
        switch (str) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
        }
        return -1;
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
