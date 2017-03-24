package com.hackerrank.coding.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
* Original task text on https://www.hackerrank.com/challenges/ctci-contacts
* We're going to make our own Contacts application! The application must perform two types of operations:
* 1. add name, where <i>name</i> is a string denoting a contact name. This must store <i>name</i> as a new contact in
*    the application.
* 2. find partial, where <i>partial</i> is a string denoting a partial name to search the application for. It must count
*    the number of contacts starting with <i>partial</i> and print the count on a new line.
*
* Given <i>n</i> sequential add and find operations, perform each operation in order.
*
* <b>Input Format</b>
*
* The first line contains a single integer, <i>n</i>, denoting the number of operations to perform.
* Each line <i>i</i> of the <i>n</i> subsequent lines contains an operation in one of the two forms defined above.
*
* <b>Constraints</b>
* <ul>
*   <li>1 <= n <= 10^5</li>
*   <li>1 <= |name| <= 21</li>
*   <li>1 <= |partial| <= 21</li>
*   <li>It is guaranteed that <i>name</i> and <i>partial</i> contain lowercase English letters only.</li>
*   <li>The input doesn't have any duplicate <i>name</i> for the <i>add</i> operation.</li>
*   <li>Output Format</li>
* </ul>
*
* For each find partial operation, print the number of contact names starting with <i>partial</i> on a new line.
*
* <b>Sample Input</b>
*
* 4
* add hack
* add hackerrank
* find hac
* find hak
*
* <b>Sample Output</b>
*
* 2
* 0
* */

public class TriesContacts {
    private static class Trie {
        final Map<Character, Trie> subTrie = new HashMap<>();
        final Trie parentNode;
        boolean isWord = false;
        int subWords = 0;

        Trie(Trie parentNode) {
            this.parentNode = parentNode;
        }
    }

    private static void putValue(Trie currentNode, String value) {
        for (char ch : value.toCharArray()) {
            final Trie prevNode = currentNode;
            currentNode = currentNode.subTrie.computeIfAbsent(ch, k -> new Trie(prevNode));
        }
        currentNode.isWord = true;
        Trie parentNode = currentNode;
        while ((parentNode = parentNode.parentNode) != null) {
            parentNode.subWords += 1;
        }
    }

    private static int countElements(Trie trie) {
        if (trie == null) {
            return 0;
        }
        return  (trie.isWord ? 1 : 0) + trie.subWords;
    }

    private static int findValuesCount(Trie currentNode, String value) {
        int count = 0;
        for (char ch : value.toCharArray()) {
            currentNode = currentNode.subTrie.get(ch);
            if (currentNode == null) {
                return 0;
            }
        }

        return count + countElements(currentNode);
    }

    public static void main(String[] args) {
        Trie root = new Trie(null);

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();

            switch (op){
                case "add":
                    putValue(root, contact);
                    break;
                case "find":
                    System.out.println(findValuesCount(root, contact));
                    break;
            }
        }
    }
}
