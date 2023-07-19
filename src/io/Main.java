package io;

import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader - BufferedWriter
        // PrintWriter - PrintReader
        // Serialization

        // input from console
//        BufferedReader bufferedReader =
//                new BufferedReader(new InputStreamReader(System.in));
//        try {
////            String text = bufferedReader.readLine();
//            int num = Integer.parseInt(bufferedReader.readLine());
//            System.out.println(num + 10);
////            System.out.println(text);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            bufferedReader.close();
//        }

        // write to file
//        BufferedReader read = null;
//        BufferedWriter write = null;
//
//        try {
//            read = new BufferedReader(new InputStreamReader(System.in));
//            write = new BufferedWriter(new FileWriter("data.txt"));
//            String text;
//            while (true) {
//                text = read.readLine();
//                if (text.equals("exit"))
//                    break;
//                write.write(text + "\n");
//            }
//        }catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            read.close();
//            write.close();
//        }

        // read from file
        // 1 option read with int (по символьное чтение из файла)
        BufferedReader read = null;
//        try {
//            int num;
//            read = new BufferedReader(new FileReader("data.txt"));
//
//            while((num = read.read()) != -1) {
//                System.out.print((char)num);
//            }
//        }catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            read.close();
//        }

        // read from file with String
        try {
            String text;
            read = new BufferedReader(new FileReader("data.txt"));
            while ((text = read.readLine())!= null){
                System.out.println(text);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            read.close();
        }

    }
}
