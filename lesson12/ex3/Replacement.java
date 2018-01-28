package lesson12.ex3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacement {
    public static String replacingWords(String s) {
        /**
         * Создаём объект pattern для интерпретации регулярного выражения
         */
        Pattern pattern = Pattern.compile("object\\soriented\\sprogramming", Pattern.CASE_INSENSITIVE);
        /**
         * Создаём объект типа Matcher для обработки регулярного выражения с помощью статического метода метода
         * matcher() передавая в него строку, в которой будут искаться совпадения по заданному шаблоному
         */
        Matcher matcher = pattern.matcher(s);
        /**
         * Сравниваем рег выр со строкой и ищем совпадения до тех пор пока не будут найдены все совпадения
         */
        while (matcher.find()) {
            s = matcher.replaceAll("OOP");
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(replacingWords("Object oriented programming is the most popular paradigm"));
        System.out.println(replacingWords("asdfsd ObjeCt OrIented programminG kdjfghisd"));
        System.out.println(replacingWords("ObjeCt OrIented programminG                 ObjeCt OrIented programminG"));
    }
}
