package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(WordCount.class.getResource(file).toURI());
        List<String> result = Files.readAllLines(path, charset);

        System.out.println("Lines = " + result.size());

        long charCount = 0;
        long charCount2 = 0;
        long wordCount = 0;
        long wordCount2 = 0;
        for (String s : result) {

            charCount = Arrays.stream(s.split("")).count();
            charCount2 += charCount;
            wordCount = Arrays.stream(s.split(" ")).count();
            wordCount2 += wordCount;
        }
        System.out.println("words = " + wordCount2);
        System.out.println("Chars = " + charCount2);
        
    }
}
