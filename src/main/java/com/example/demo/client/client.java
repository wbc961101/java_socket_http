package com.example.demo.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 9999);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String str = "first ";
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, "utf-8"));

            while (true) {
                str = bufferedReader.readLine();
                System.out.println(str.length());
                bufferedWriter.write(str);
                bufferedWriter.write("\n");
                bufferedWriter.flush();
//                socket.shutdownOutput();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
