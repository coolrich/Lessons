package lesson12.ex11and12and13;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordFinder {
    public static List<String> findSmallest(String str) {
        Pattern pattern = Pattern.compile("[a-z]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        Map<Integer, Integer> wordsLength = new TreeMap<>();
        List<String> words = new ArrayList<>();
        int count = 0;
        while (matcher.find()) {
            Set<String> stringSet = new TreeSet<>();
            for (int i = 0; i < matcher.group().length(); i++) {
                stringSet.add(String.valueOf(matcher.group().charAt(i)));
            }
            words.add(matcher.group());
            wordsLength.put(count++, stringSet.size());
        }
        int minNumOfLttrs = wordsLength.get(0);
        for (int i = 1; i < wordsLength.size(); i++) {
            minNumOfLttrs = minNumOfLttrs <= wordsLength.get(i) ? minNumOfLttrs : wordsLength.get(i);
        }
        List<String> smallestWords = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if (wordsLength.get(i) <= minNumOfLttrs) {
                smallestWords.add(words.get(i));
            }
        }
        return smallestWords;
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
        System.out.println(findSmallest("afasdfs ffffffffffffffffff s aaaaa b sdfghjk g g fghjk rtyu asertyuikl"));
    }
}
