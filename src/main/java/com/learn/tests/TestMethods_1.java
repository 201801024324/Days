package com.learn.tests;

import java.io.File;

public class TestMethods_1 {
    @org.junit.Test
    public void methods_1(){
//        文件处理
//        File file_1 = new File("/home/hjl/Days/src/main/java/com/learn/tests/TestMethods_2.java");
//        System.out.println(file_1.isFile());
//        System.out.println(file_1.isAbsolute());
//        System.out.println(file_1.isDirectory());
//        System.out.println(file_1.isFile());
//        创建目录
        File path_1 = new File("/home/hjl/otherFiles");
        File file_2 = new File(path_1,"text_1");
        File file_3 = new File(path_1,"text_2.txt");

//        System.out.println(file_2.exists());;
//        System.out.println(path_1.exists());;
//        System.out.println(file_3.isFile());;
//        创建文件（文件不存在的时候自动创建）
//        File file_4 = new File(path_1,"text_3.txt");
//        try {
//            if (!file_4.exists()) {
//                if (file_4.createNewFile()){
//                    System.out.println("文件创建成功！");
//                    return;
//                }
//
//                System.out.println("文件创建失败！");
//                return;
//            }
//            System.out.println("文件已存在！");
//
//        }catch (Exception e){
//            System.out.println("文件创建失败！");
//            e.printStackTrace();
//        }finally{
//            System.out.println("程序已运行完毕！");
//        }
//        创建文件夹（目录）

/**
 * File path_1 = new File("/home/hjl/otherFiles");
 * path_1.mkdirs();多级目录创建
 * path_1.mkdir();单级文件夹创建
 *
 //        System.out.println(path_1);
 //        File path_2 = new File(path_1+"/tttt/ffff/www/sss");创建多级目录
 //        System.out.println(path_2.exists());此时该目录不存在
 //        System.out.println(path_2.mkdirs());创建该目录
 //        System.out.println(path_2.exists());目录已存在
 //        System.out.println(path_2.delete());删除最低一级目录（目录内有文件则无法删除）
 //        System.out.println(path_2.exists());此时目录不存在
  */
//path_1.delete();

//        System.out.println(path_1);
//        File path_2 = new File(path_1+"/tttt/ffff/www/sss");创建多级目录
//        System.out.println(path_2.exists());此时该目录不存在
//        System.out.println(path_2.mkdirs());创建该目录
//        System.out.println(path_2.exists());目录已存在
//        System.out.println(path_2.delete());删除最低一级目录（目录内有文件则无法删除）
//        System.out.println(path_2.exists());此时目录不存在
//        System.out.println(path_1);
    }

//    操作文件
    @org.junit.Test
    public void methods_2() throws Exception{
//        移动文件，修改文件or目录名称＞＞＞＞＞renameTo方法
//        获取路径
        /**
         * 说明：由于path_1定义时使用了绝对路径，因此获取该目录下文件的相对路径和绝对路径时无法看出区别，
         *      只有在定义（声明）时不指定绝对路径，创造出的目录和其中的文件则有对于项目的相对论路径
         */
//        File path_1 = new File("/home/hjl/otherFiles");
////        System.out.println(path_1.exists());
//        File file_1 = new File(path_1,"text_2.txt");
//        System.out.println(file_1.exists());
////        获取绝对路径
//        System.out.println(file_1.getAbsolutePath());
////        获取相对路径
//        System.out.println(file_1.getPath());
//        File path_2 = new File("otherFiles");
//        File file_2 = new File(path_2,"text_1.txt");
//查看文件夹和文件是否存在
//        System.out.println(path_2.exists());
//        System.out.println(file_2.exists());
////        创建不存在的文件夹与文件(创建文件时需要抛出异常)
//        System.out.println(path_2.mkdir());
//        System.out.println(file_2.createNewFile());
//        查看绝对路径和相对路径
//        System.out.println(file_2.getAbsolutePath());
//        System.out.println(file_2.getPath());
//        获取文件目录（不包含文件名）
//        System.out.println(file_2.getParent());
//        获取文件大小
//        System.out.println(file_2.length()+"字节(byte)");
//        System.out.println(file_2.length() * 8+"比特(bit)");
    }

    @org.junit.Test
    public void methods_3(){
        
    }
}
