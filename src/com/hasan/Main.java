package com.hasan;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {




    public static void main(String[] args) throws Exception {



        String patternNode = "(?<=\":\")(.*?)(?=\"})";
        Pattern p= Pattern.compile(patternNode);
        int x ;
        int y ;

        File file = new File("C:\\Users\\Hasan\\Desktop\\a.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String data = null;
        String d =null;
        String st;
        while ((st = br.readLine()) != null) {
            String value = st;
            byte ptext[] = value.getBytes();
            data = new String(ptext, "UTF-8");
            d = d + data;
            System.out.println(st);
        }
        d= d.substring(10);
        System.out.println(d);



        Matcher m = p.matcher(d);
        boolean crrr = m.find();
        while(m.find()) {
            m.find();
            x = m.start();
            y = m.end();
            String testsqu = d.substring(x, y);
            System.out.println(testsqu);
            d = d.substring(y);
            m = p.matcher(d);
        }



        String[] TestArray = new String[30]; // combining both statements in one

        TestArray[0] = "koff_loffffff_aoff";
        TestArray[1] = "kon";  // original kon
        TestArray[2] = "kon_lon_aoff"; //kon_lon_aoff
        TestArray[3] = "koff";
        TestArray[4] = "koff_lon_aoff";
        TestArray[5] = "kon"; // original kon
        TestArray[6] = "kon_lon_aoff";
        TestArray[7] = "aon";
        TestArray[8] = "kon_lon_aon";
        TestArray[9] = "aon";
        TestArray[10] = "kon_lon_aon";
        TestArray[11] = "aon";
        TestArray[12] = "kon_lon_aon"; // original kon_lon_aon
        TestArray[13] = "aon";
        TestArray[14] = "kon_lon_aon";
        TestArray[15] = "koff";
        TestArray[16] = "koff_lon_aoff";
        TestArray[17] = "kon";
        TestArray[18] = "kon_lon_aoff";
        TestArray[19] = "aon";
        TestArray[20] = "kon_lon_aon";
        TestArray[21] = "koff";
        TestArray[22] = "koff_lon_aoff";
        TestArray[23] = "aon";
        TestArray[24] = "koff_loff_aoff";
        TestArray[25] = "-1";
        //*************************************************************
        model.setMethod();
        HashMap<Integer, HashMap<String, Edge>> Node = new HashMap<Integer, HashMap<String, Edge>>();
        Node = model.getnode();

        int key = 0;
        int testItr = 0;
        String nodename;
        String pahtname;
        nodename = TestArray[testItr];  // First Read
        ++testItr;


        if (Node.get(key).get(null).Target.VertexName == nodename) { //
            key = Node.get(key).get(null).Target.key; //

            while (TestArray[testItr] != "-1") {
                pahtname = TestArray[testItr]; // Second read
                ++testItr;
                boolean c = Node.get(key).containsKey(pahtname);

                if (!c) {
                    System.out.println(pahtname + "  that has connected to " + nodename + " is not found");
                    nodename = TestArray[testItr]; // Third Read kon_lon_aoff
                    ++testItr;
                    boolean Control = false;
                    for (String k : Node.get(key).keySet()) {
                        Edge hm = Node.get(key).get(k);
                        if (hm.Target.VertexName == nodename) {
                            key = hm.Target.key;
                            Control = true;
                        }

                    }
                    if (!Control) {
                        System.out.println("There is a double fault. " + pahtname + " and "
                                + nodename + " is not found. Please solve these  problem berfore you start the test!!! ");
                        return;
                    }


                } else {
                    nodename = TestArray[testItr]; // Third Read kon_lon_aoff
                    ++testItr;

                    if (Node.get(key).get(pahtname).Target.VertexName == nodename) {

                        key = Node.get(key).get(pahtname).Target.key;
                    } else {
                        System.out.println(Node.get(key).get(pahtname).Target.VertexName);
                        System.out.println(nodename + " that " + pahtname + " is connect to the " + " is not found");
                    }


                }


            }


        } else {
            System.out.println("It is false start");
        }


    }

}




