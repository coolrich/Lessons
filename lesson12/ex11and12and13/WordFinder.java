package lesson12.ex11and12and13;

import jdk.nashorn.api.tree.Tree;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordFinder {
    public static List<StringBuilder> findSmallest(String str) {
        Pattern pattern = Pattern.compile("[a-z]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        List<StringBuilder> strings = new ArrayList<StringBuilder>();
        int count = 0;
        while (matcher.find()) {
            strings.add(new StringBuilder());
            for (int i = 0; i < matcher.group().length(); i++) {
                strings.get(count).append(matcher.group().charAt(i));
            }
            count++;
        }
        strings.sort(new Comparator<StringBuilder>() {
            @Override
            public int compare(StringBuilder o1, StringBuilder o2) {
                return o1.length() > o2.length() ? 1 : -1;
            }
        });
        count = 1;
        List<StringBuilder> result = new ArrayList<StringBuilder>();
        result.add(strings.get(0));
        while (count < strings.size() && (strings.get(0).length() == strings.get(count).length())) {
            result.add(strings.get(count++));
        }
        return result;
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
        System.out.println(countOfLatinWords("aaaaaaa abc  d 1 safdas sf f"));
        System.out.println(palindromeFinder("Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554 1"));
        System.out.println(findSmallest("afasdfs ffffffffffffffffff s aaaaa b"));
    }
}
