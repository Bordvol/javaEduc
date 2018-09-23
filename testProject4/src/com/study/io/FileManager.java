package com.study.io;

import java.io.File;

// public static int countFiles(String path)
// - принимает путь к папке, возвращает количество файлов в папке и всех подпапках по пути

        import java.io.File;

// public static int countDirs(String path)
// - принимает путь к папке, возвращает количество папок в папке и всех подпапках по пути
public class FileManager {

    // recursion.
    // NO STATIC FIELDS IN A CLASS!!!!!!!!
    public static int countFiles(String path) {
        File file = new File(path);
        File [] files = file.listFiles();
        int i=0;
        for (File localFile: files) {
            if (localFile.isFile()){
                i++;
            }
            else {
                i = i + countFiles((localFile.getPath()));
            }
        }
        return i;
    }

    public static int countDirs(String path) {
        File file = new File(path);
        File [] files = file.listFiles();
        int i=0;
        for (File localFile: files) {
            if (localFile.isDirectory()){
                i = i + countDirs((localFile.getPath()));
                i++;
            }
        }
        return i;
    }
}