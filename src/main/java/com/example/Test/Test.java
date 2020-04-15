package com.example.Test;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String dir = "C:\\Users\\3C\\Desktop\\test";
        File file = new File(dir);

        //new FilenameFilter() {}匿名内部类
        String[] filesList = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("ext");
            }
        });
        Arrays.asList(filesList).forEach(System.out::println);
    }




}
