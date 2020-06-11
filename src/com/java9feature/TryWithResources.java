package com.java9feature;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        TryWithResources.resourceHandle();
    }

    static void resourceHandle() throws IOException {

        BufferedReader reader1 = new BufferedReader(new FileReader("book.txt"));
        // in java 7 and
        // need to define inside one more variable to close the resource this is bug in code.
        try(BufferedReader reader2 = reader1){
            System.out.println(reader2);
        }

        // but now in java 9 we can use like that this more effective than java 7 amd java 8 syntax
        try (reader1) {
            System.out.println(reader1.readLine());
        }
    }
}

