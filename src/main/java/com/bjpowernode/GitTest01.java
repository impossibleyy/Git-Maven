package com.bjpowernode;

public class GitTest01 {

    public int add(int n1,int n2){
        return n1 +n2;
    }
    public static void main(String[] args) {
        GitTest01 gitTest01 = new GitTest01();
        int add = gitTest01.add(100, 200);
        System.out.println("结果是="+add);
    }
}
