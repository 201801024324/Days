package com.learn.tests;

import java.io.*;

public class TestMethod2 {
//    随机生成多个字符
    @org.junit.Test
    public void method_1() throws Exception {
//        for (char a : new char[]{'A', 'B', 'C', 'D', 'E'}){
//            System.out.print(a);
//        }
        char[] c = new char[]{'A','B','C','D','E'};
        int m = 0;
        File path = new File("otherFiles");
        if (!path.exists()){
            path.mkdirs();  //创建目录
        }
        FileOutputStream Fin = new FileOutputStream(path+"/text_1.txt",true);//追加模式
        for (int k=0; k<20000; ++k) {
            m = (int) ((Math.random()*5));
//            System.out.print(m);
//            System.out.print(c[m]);
            Fin.write(c[m]);
//            if (k%5 == 0)
//                Fin.write(' '); //只能存放字节，不能存放字符
            if (k%100 == 0)
                Fin.write('\n');
        }
        Fin.close();
        System.out.println("操作已完成！");
    }
}
