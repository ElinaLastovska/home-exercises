package io.codelex.kontrolDarbs.exercise4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilesReader {
    private static final String PATH_TO_FILE = "C:/Users/PC/Documents/MajasDarbiJava/home-exercises/majasdarbs/src/main/java/io/codelex/kontrolDarbs/";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(PATH_TO_FILE + "InPut"));
        BufferedWriter out = new BufferedWriter(new FileWriter(PATH_TO_FILE + "OutPut"));


        List<String> list = new ArrayList<>();
        String line;
        while ((line = in.readLine()) != null) {
            list.add(line);
        }
        StringBuilder reverse = new StringBuilder();
        reverse.append(list);
        reverse.reverse();

        out.write(String.valueOf(reverse));

        in.close();
        out.close();
    }
}
