package com.resto.comparator.memory;

public class C {
    private int x;
    private int y;

    public static void main(String [] args) {
        System.out.println("The Objects Size is " + 
        		ObjectSizeFetcher.getObjectSize(new C()));
    }
}