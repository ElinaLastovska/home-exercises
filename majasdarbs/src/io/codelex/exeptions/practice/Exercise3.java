package io.codelex.exeptions.practice;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise3 {

    public static void cat(File file) throws IOException {

        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (NullPointerException npe) {
            System.out.println("File not found");
        } finally {
            if (input != null) {
                input.close();
            }
        }

    }
}
