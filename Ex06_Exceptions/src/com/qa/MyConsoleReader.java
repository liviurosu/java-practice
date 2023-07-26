package com.qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyConsoleReader {
    public MyConsoleReader() {
    }

    public void readInputPrint() {
        StringBuffer sb = new StringBuffer();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            try {
                System.out.println("enter a line of text or 'stop' ");

                for(String line = br.readLine(); !line.equals("stop"); line = br.readLine()) {
                    sb.append(line + "\n");
                    System.out.println("enter a line of text or 'stop'");
                }
            } catch (Throwable var6) {
                try {
                    br.close();
                } catch (Throwable var5) {
                    var6.addSuppressed(var5);
                }

                throw var6;
            }

            br.close();
        } catch (IOException var7) {
            System.out.println("error on console input: " + var7);
            var7.printStackTrace();
        }

    }

    public static void main(String[] args) {
        MyConsoleReader mcr = new MyConsoleReader();
        mcr.readInputPrint();
    }
}