package com.leetcode.problems.algorytms.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GroupAnagramsTest {

    private GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    public void fromExample() throws Exception {
        String[] given = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("ate", "eat", "tea"),
                Arrays.asList("nat", "tan"),
                Collections.singletonList("bat")
        );

        expected.forEach(Collections::sort);
        expected.sort(Comparator.comparingInt(Collection::size));

        List<List<String>> actual = groupAnagrams.groupAnagrams(given);
        actual.forEach(Collections::sort);
        actual.sort(Comparator.comparingInt(Collection::size));

        Assert.assertEquals(expected, actual);
    }
}