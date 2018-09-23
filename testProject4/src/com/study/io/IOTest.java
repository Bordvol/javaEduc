package com.study.io;

import java.io.File;
import java.io.FileNotFoundException;

public class IOTest {
    public static void main(String[] args) {
        int files = 0;
        int dirs = 0;
        System.out.println("counting");
        FileManager fileManager = new FileManager();
        System.out.println(fileManager.countFiles("D:\\git\\javaEduc\\testProject4\\src\\com\\study\\io"));
        System.out.println(fileManager.countDirs("D:\\git\\javaEduc\\testProject4\\src\\com\\study\\io"));
    }
}

      /*  System.out.println("Start reading from file");
        String path = null;

        try {
            readFromFile(path);
            System.out.println("read from file success");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        } catch (IllegalArgumentException e) {

        } catch (Exception e) {

        }

        System.out.println("Finish");
    }

    private static void readFromFile(String path) throws FileNotFoundException {
        if (path == null) {
            throw new FileNotFoundException("File not found");
        }
    }*/
//}