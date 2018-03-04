package lesson12.ex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * а) Дано два числа, например 3 и 56, необходимо составить следующие строки:
 * 3 + 56 = 59
 * 3 – 56 = -53
 * 3 * 56 = 168.
 * Используем метод StringBuilder.append().
 * б) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
 * в) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
 */
public class StringBuilderTest1 {
    public int number1, number2;
    public StringBuilder mathExpression;

    public StringBuilderTest1(int number1, int number2, Signs sign) {
        this.number1 = number1;
        this.number2 = number2;
        mathExpression = new StringBuilder();
        mathExpression.append(number1).append(sign).append(number2).append("=").append(number1 + number2);
    }

    public static void main(String[] args) {
        StringBuilderTest1 sbt;
        System.out.println((sbt = new StringBuilderTest1(1, 1, Signs.PLUS)).getMathExpression());
        System.out.println(sbt.replaceSB("=", " equals "));
        System.out.println(sbt.replaceSB(" equals ", "="));
        System.out.println(sbt.replaceInsertDelete("=", " equals "));
    }

    public StringBuilder getMathExpression() {
        return mathExpression;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public StringBuilderTest1 replaceInsertDelete(String which, String to) {
        Pattern pattern = Pattern.compile(which);
        Matcher matcher = pattern.matcher(mathExpression);
        while (matcher.find()) {
            mathExpression.delete(matcher.start(), matcher.end());
            mathExpression.insert(matcher.start(), to);
        }
        return this;
    }

    public StringBuilderTest1 replaceSB(String which, String to) {
        Pattern pattern = Pattern.compile(which);
        Matcher matcher = pattern.matcher(mathExpression);
        while (matcher.find()) {
            mathExpression = mathExpression.replace(matcher.start(), matcher.end(), to);
        }
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(mathExpression);
    }

    enum Signs {
        PLUS("+"), MINUS("-"), MULT("*"), DIV("/");

        private String sign;

        Signs(String s) {
            sign = s;
        }

        public String getSign() {
            return sign;
        }

        @Override
        public String toString() {
            return sign;
        }

    }
}
