package com.hasan;

// testr okuma son

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)),("UTF-16"));
        return data;
    }



    public static void main(String[] args) throws Exception {



        String patternNode = "(?<=\":\")(.*?)(?=\"})";
        Pattern p= Pattern.compile(patternNode);
        int x ;
        int y ;

        File file = new File("C:\\Users\\Hasan\\Desktop\\a.txt");

        String data = readFileAsString("C:\\Users\\Hasan\\Desktop\\a.txt");
       // System.out.println(data);
        Queue<String> q = new LinkedList<>();


        Matcher m = p.matcher(data);

        while(m.find()) {
            x = m.start();
            y = m.end();
            String testsqu = data.substring(x, y);
           // System.out.println(testsqu);
            q.add(testsqu);


            data = data.substring(y);
            m = p.matcher(data);
        }





        model.setMethod();
        HashMap<Integer, HashMap<String, Edge>> Node = new HashMap<Integer, HashMap<String, Edge>>();
        Node = model.getnode();



        int key = 0;
        String pahtname;
        String nodename;
        boolean  TestFaultConroller = false;

         nodename = q.peek();
         q.remove();
         pahtname = q.peek();


        if (Node.get(key).get(null).Target.VertexName.equals(nodename)) { //
            key = Node.get(key).get(null).Target.key; //
            while (!q.isEmpty()) {
                if(Node.get(key).containsKey(pahtname)){
                    q.remove();
                    nodename = q.peek();

                    if(Node.get(key).get(pahtname).Target.VertexName.equals(nodename)){
                        key =  Node.get(key).get(pahtname).Target.key;
                        q.remove();
                        pahtname = q.peek();
                    }else {
                        TestFaultConroller = true;
                        break;
                    }
                    }
                    else{
                    TestFaultConroller = true;
                    break;
                }

//////////////////////////////////////////
            }

        } else {
            TestFaultConroller = true;

        }


        if (TestFaultConroller) {
            System.out.println("This is mutant");
        }
        else{
            System.out.println("This is live");
        }







    }

}




