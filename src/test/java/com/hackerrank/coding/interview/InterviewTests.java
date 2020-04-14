package com.hackerrank.coding.interview;

import com.hackerrank.coding.SimpleTestSystem;
import org.junit.Assert;
import org.junit.Test;

public class InterviewTests {
    @Test
    public void leftShift() throws Exception {
        Assert.assertEquals("1", SimpleTestSystem.doTest(LeftRotation.class, "1 1 1"));
        Assert.assertEquals("1 2 3 4 5", SimpleTestSystem.doTest(LeftRotation.class, "5 5 1 2 3 4 5"));
        Assert.assertEquals("5 1 2 3 4", SimpleTestSystem.doTest(LeftRotation.class, "5 4 1 2 3 4 5"));
        Assert.assertEquals("2 3 4 5 1", SimpleTestSystem.doTest(LeftRotation.class, "5 1 1 2 3 4 5"));
        Assert.assertEquals("3 4 5 1 2", SimpleTestSystem.doTest(LeftRotation.class, "5 2 1 2 3 4 5"));
        Assert.assertEquals("77 97 58 1 86 58 26 10 86 51 41 73 89 7 10 1 59 58 84 77", SimpleTestSystem.doTest(LeftRotation.class, "20 10 41 73 89 7 10 1 59 58 84 77 77 97 58 1 86 58 26 10 86 51"));
    }


    @Test
    public void anagrams() {
        Assert.assertEquals("4", SimpleTestSystem.doTest(Anagrams.class, "cde\nabc"));
        Assert.assertEquals("0", SimpleTestSystem.doTest(Anagrams.class, "abc\nabc"));
        Assert.assertEquals("5", SimpleTestSystem.doTest(Anagrams.class, "aaaaaaa\naa"));
    }

    private IsBinaryTree.Node node(int data, IsBinaryTree.Node left, IsBinaryTree.Node right) {
        final IsBinaryTree.Node node = new IsBinaryTree.Node();
        node.data = data;
        node.left = left;
        node.right = right;

        return node;
    }

    private IsBinaryTree.Node least(int data) {
        final IsBinaryTree.Node node = new IsBinaryTree.Node();
        node.data = data;

        return node;
    }

    @Test
    public void isBinaryTree() {
        IsBinaryTree isBinaryTree = new IsBinaryTree();

        IsBinaryTree.Node rootNode = node(4,
                node(2, least(1), least(3)),
                node(6, least(5), least(7)));
        Assert.assertTrue(isBinaryTree.checkBST(rootNode));

        rootNode = node(5,
                node(2, least(1), least(3)),
                node(10,
                        node(9, least(6), null),
                        node(12, least(11), null)));
        Assert.assertTrue(isBinaryTree.checkBST(rootNode));

        rootNode = node(5,
                node(2, least(1), least(3)),
                node(10,
                        node(9, least(4), null),
                        node(12, least(11), null)));
        Assert.assertFalse(isBinaryTree.checkBST(rootNode));

        rootNode = node(4,
                node(2, least(1), least(3)),
                node(10, least(9), node(11, least(7), least(12))));
        Assert.assertFalse(isBinaryTree.checkBST(rootNode));

        rootNode = node(5,
                node(2, least(1), least(3)),
                node(6, least(4), least(7)));
        Assert.assertFalse(isBinaryTree.checkBST(rootNode));

        rootNode = node(4,
                node(2, least(1), least(3)),
                node(6, least(4), least(7)));
        Assert.assertFalse(isBinaryTree.checkBST(rootNode));

        rootNode = node(4,
                node(2, least(1), least(3)),
                node(6, least(1), least(7)));
        Assert.assertFalse(isBinaryTree.checkBST(rootNode));
    }


    @Test
    public void checkPhone() {
        Assert.assertEquals("2\n0", SimpleTestSystem.doTest(TriesContacts.class, "4\nadd hack\nadd hackerrank\nfind hac\nfind hak"));
        Assert.assertEquals("5\n4\n3\n2\n1\n0", SimpleTestSystem.doTest(TriesContacts.class, "11\nadd s\nadd ss\nadd sss\nadd ssss\n" +
                "add sssss\nfind s\nfind ss\nfind sss\nfind ssss\nfind sssss\nfind ssssss"));
    }

    @Test
    public void ransomNoteTest() {
        Assert.assertEquals("No", SimpleTestSystem.doTest(RansomNote.class, "15 17\n" +
                "o l x imjaw bee khmla v o v o imjaw l khmla imjaw x\n" +
                "imjaw l khmla x imjaw o l l o khmla v bee o o imjaw imjaw o"));
    }
}