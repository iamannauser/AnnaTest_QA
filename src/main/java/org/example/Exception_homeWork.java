package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Exception_homeWork {

    private void readFile(String filePath) throws IOException {
        try {
            throw new IOException("виняток");
        } catch (IOException e) {
            System.err.println("помилка: " + e.getMessage());
            throw e;
        }
    }

    private void triggerRuntimeException() {
        throw new RuntimeException("неперевірений виняток");
    }

    public static void main(String[] args) {
        Exception_homeWork homework = new Exception_homeWork();

        try {
            homework.readFile("path/to/your/file.txt");
        } catch (IOException e) {
            System.err.println("обробка винятку: " + e.getMessage());
        }

        try {
            homework.triggerRuntimeException();
        } catch (RuntimeException e) {
            System.err.println("обробка RuntimeException: " + e.getMessage());
        }
    }
}
