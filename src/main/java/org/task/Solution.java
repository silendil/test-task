package org.task;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public List<Integer> topN(Stream<Integer> input) {
        List<Integer> result = new LinkedList<>();
        input.forEach(a -> {
            int index = -(Collections.binarySearch(result, a, Collections.reverseOrder()) + 1);
            if (index < 10) {
                result.add(index, a);
            }
            if (result.size() > 10)
                result.remove(10);
        });
        return result;
    }
}
