package com.hasan;

import java.util.HashMap;

public class model {


 static HashMap<Integer, HashMap<String,Edge>> Node = new HashMap<Integer,HashMap<String,Edge>>();


 static void setMethod(){

  HashMap<String,Edge> n0 = new HashMap<>();
  Vertex N0 = new Vertex();
  N0.VertexName = "start_model";
  N0.key = 0;

  HashMap<String,Edge> n1 = new HashMap<>();
  Vertex N1 = new Vertex();
  N1.VertexName = "koff_loff_aoff";
  N1.key = 1;

  HashMap<String,Edge> n2 = new HashMap<>();
  Vertex N2 = new Vertex();
  N2.VertexName = "kon_lon_aoff";
  N2.key = 2;

  HashMap<String,Edge> n3 = new HashMap<>();
  Vertex N3 = new Vertex();
  N3.VertexName = "kon_lon_aon";
  N3.key = 3;

  HashMap<String,Edge> n4 = new HashMap<>();
  Vertex N4 = new Vertex();
  N4.VertexName = "koff_lon_aoff";
  N4.key = 4;

  HashMap<String,Edge> n5 = new HashMap<>();
  Vertex N5 = new Vertex();
  N5.VertexName = "koff_loff_aon";
  N5.key = 5;

  Edge E0 = new Edge();


  E0.EdgeName = null;
  E0.Target = N1;
  Edge E1 = new Edge();
  E1.EdgeName = "kon";
  E1.Target = N2;

  Edge E2 = new Edge();
  E2.EdgeName = "koff";
  E2.Target = N4;

  Edge E3 = new Edge();
  E3.EdgeName = "aon";
  E3.Target = N1;

  Edge E4 = new Edge();
  E4.EdgeName = "aon";
  E4.Target = N3;

  Edge E5 = new Edge();
  E5.EdgeName = "aon";
  E5.Target = N3;

  Edge E6 = new Edge();
  E6.EdgeName = "koff";
  E6.Target = N4;

  Edge E7 = new Edge();
  E7.EdgeName = "aon";
  E7.Target = N5;

  Edge E8 = new Edge();
  E8.EdgeName = "aon";
  E8.Target = N5;

  Edge E9 = new Edge();
  E9.EdgeName = "kon";
  E9.Target = N2;

  Edge E10 = new Edge();
  E10.EdgeName = "kon";
  E10.Target = N2;

  n0.put(E0.EdgeName,E0);

  n1.put(E1.EdgeName,E1);

  n2.put(E2.EdgeName,E2);

  n4.put(E3.EdgeName,E3);

  n2.put(E4.EdgeName,E4);

  n3.put(E5.EdgeName,E5);

  n3.put(E6.EdgeName,E6);

  n1.put(E7.EdgeName,E7);

  n5.put(E8.EdgeName,E8);

  n5.put(E9.EdgeName,E9);

  n4.put(E10.EdgeName,E10);

  Node.put(N0.key, n0);

  Node.put(N1.key, n1);

  Node.put(N2.key, n2);

  Node.put(N3.key, n3);

  Node.put(N4.key, n4);

  Node.put(N5.key, n5);

 }
 static HashMap<Integer, HashMap<String, Edge>> getnode(){
  return Node;
 }

}
