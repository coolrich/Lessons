package lesson12.ex11and12and13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordFinder {
    public static String findSmallest(String str) {
        Pattern pattern = Pattern.compile("[a-z|1-9]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        String word = matcher.find() ? matcher.group() : "";
        while (matcher.find()) {
            word = matcher.group().length() < word.length() ? matcher.group() : word;
        }
        return word;
    }

    public static int countOfLatinWords(String str) {
        Pattern pattern = Pattern.compile("[a-z]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        int count = 1;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static String palindromeFinder(String str) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        StringBuilder s = new StringBuilder();
        while (matcher.find()) {
            s.append(matcher.group().equals(new StringBuilder(matcher.group()).reverse().toString()) ? matcher.group() + " " : "");
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(findSmallest("aaaaaaa abc  d 1 safdas sf f"));
        System.out.println(countOfLatinWords("aaaaaaa abc  d 1 safdas sf f"));
        System.out.println(palindromeFinder("Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554 1"));
    }
}
