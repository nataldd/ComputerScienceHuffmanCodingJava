package com.company;

public class InternalNode  extends Node{
    Node left;
    Node right;
    @Override
    void buildCode(String code) {
        super.buildCode(code);
        left.buildCode(code + "0");
        right.buildCode(code + "1");
    }

    public InternalNode(Node left, Node right) {
        super(left.sum + right.sum);
        this.left = left;
        this.right = right;
    }
}
