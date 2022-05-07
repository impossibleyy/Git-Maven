package com.bjpowernode;

public class GitTest01 {

    public int add(int n1,int n2){
        return n1 +n2;
    }

    public int sub(int n1,int n2){
        return n1 - n2;
    }

    public int div(int n1,int n2){
        return n1/n2;
    }
    public static void main(String[] args) {
        GitTest01 gitTest01 = new GitTest01();
        int add = gitTest01.add(100, 200);
        System.out.println("结果是="+add);
        int sub = gitTest01.sub(100, 200);
        System.out.println("结果是="+sub);
        int div = gitTest01.div(200, 100);
        System.out.println("结果是="+div);
        System.out.println("这是hot-fix修改的内容！！");
    }
}
