package com.company;

public class Node implements Comparable<Node>{
    final int sum;
    String code;

    void buildCode(String code) {
        this.code = code;

    }
    public Node(int sum) {
        this.sum = sum;
    }
    @Override
    public int compareTo(Node o) {
        return Integer.compare(sum, o.sum);
    }

}
