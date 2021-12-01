package com.thoughtworks.collection;

import java.util.List;
import java.util.Comparator;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream().reduce(0, (returnNumber, number) -> number%2 != 0 ? number : returnNumber);
    }

    public String getLongest(List<String> words) {
        return words.stream().reduce("", (returnWord, word) -> word.length() > returnWord.length() ? word : returnWord );
    }

    public int getTotalLength(List<String> words) {
        return 0;
    }
}
