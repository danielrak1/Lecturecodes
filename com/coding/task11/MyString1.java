package com.coding.task11;

public class MyString1 {
    private char [] chars;

    public MyString1(char[] chars){
        this.chars = chars;
    }

    public char charAt(int index){
        if(index<0 || index > chars.length-1);
        System.out.println("Index is not supported, IndexOutOfBoundException " +
                "would be thrown");
        return '0';
    }

    public int length(){
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        if (begin < 0 || end > length() || begin > end) {
            System.out.println("Index is not supported, IndexOutOfBoundException " +
                    "would be thrown");
            return new MyString1(new char[]{'E', 'R', 'R', 'O', 'R',});
        }
        char[] sub = new char[end - begin];
        for(int i=0, j=begin; j<end; i++, j++) {
            sub[i]=chars[j];
        }
        return new MyString1(sub);


    }
}
