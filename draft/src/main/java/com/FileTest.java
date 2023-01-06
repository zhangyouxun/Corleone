package com;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("x1x.md");

        OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(path));
        String s = "xs12dahu8129a0---111--";
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);

        for (byte aByte : bytes) {
            outputStream.write(aByte);
        }
        outputStream.close();


        InputStream inputStream = new BufferedInputStream(Files.newInputStream(path));
        int available = inputStream.available();
        byte[] bf = new byte[available];
        int read = inputStream.read(bf);
        System.out.println(read);
        String s1 = new String(bf, StandardCharsets.UTF_8);
        System.out.println(s1);

        inputStream.close();

        Files.delete(path);

    }
}

