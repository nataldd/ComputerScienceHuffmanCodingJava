package com.company;

public class LeafNode extends  Node{
    char symbol;
    @Override
    void buildCode(String code) {
        super.buildCode(code);
        System.out.println(symbol + ": " + code);
    }
    public LeafNode(char symbol, int count) {
        super(count);
        this.symbol = symbol;
    }
}