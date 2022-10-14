package io.codelex.kontrolDarbs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class fileReader {
    private static final String PATH_TO_FILE = "C:/Users/PC/Documents/MajasDarbiJava/home-exercises/majasdarbs/src/main/java/io/codelex/kontrolDarbs/";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(PATH_TO_FILE + "KdTask"));
        BufferedReader out = new BufferedReader(new FileReader(PATH_TO_FILE + "OutPut"));

        List<String> list = new ArrayList<>();
        String line;
        while ((line = in.readLine()) != null) {
            list.add(line);
        }
        for (Iterator<String> i = list.iterator(); i.hasNext(); ) {
            out.print((String) i.next());
        }
        Collections.reverse(list);
        in.close();
        out.close();
    }
}
