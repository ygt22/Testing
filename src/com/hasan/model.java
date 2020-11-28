// Name of the package must be same as the directory
// under which this file is saved
package com.hasan;

import java.util.HashMap;

 public class model
{
 static HashMap<Integer, HashMap<String,Edge>> Node = new HashMap<Integer,HashMap<String,Edge>>();

 static void setn(){
   Vertex N0 = new Vertex();
   Vertex N1 = new Vertex();
  Vertex N2 = new Vertex();
   Vertex N3 = new Vertex();
   Vertex N4 = new Vertex();
   Vertex N5 = new Vertex();


   Edge E0 = new Edge();
   Edge E1 = new Edge();
   Edge E2 = new Edge();
   Edge E3 = new Edge();
   Edge E4 = new Edge();
   Edge E5 = new Edge();
   Edge E6 = new Edge();
   Edge E7 = new Edge();
   Edge E8 = new Edge();
   Edge E9 = new Edge();
   Edge E10 = new Edge();


   HashMap<String,Edge> n0 = new HashMap<>();
   HashMap<String,Edge> n1 = new HashMap<>();
   HashMap<String,Edge> n2 = new HashMap<>();
   HashMap<String,Edge> n3 = new HashMap<>();
   HashMap<String,Edge> n4 = new HashMap<>();
   HashMap<String,Edge> n5 = new HashMap<>();

  N0.VertexName = "start_model";
  N0.key = 0;
  N1.VertexName = "koff_loff_aoff";
  N1.key = 1;
  N2.VertexName = "kon_lon_aoff";
  N2.key = 2;
  N3.VertexName = "kon_lon_aon";
  N3.key = 3;
  N4.VertexName = "koff_lon_aoff";
  N4.key = 4;
  N5.VertexName = "koff_loff_aon";
  N5.key = 5;

  E0.EdgeName = null;
  E0.Source = N0;
  E0.Target = N1;
  E1.EdgeName = "kon";
  E1.Source = N1;
  E1.Target = N2;
  E2.EdgeName = "koff";
  E2.Source = N2;
  E2.Target = N4;
  E3.EdgeName = "aon";
  E3.Source = N4;
  E3.Target = N1;
  E4.EdgeName = "aon";
  E4.Source = N2;
  E4.Target = N3;
  E5.EdgeName = "aon";
  E5.Source = N3;
  E5.Target = N3;
  E6.EdgeName = "koff";
  E6.Source = N3;
  E6.Target = N4;
  E7.EdgeName = "aon";
  E7.Source = N1;
  E7.Target = N5;
  E8.EdgeName = "aon";
  E8.Source = N5;
  E8.Target = N5;
  E9.EdgeName = "kon";
  E9.Source = N5;
  E9.Target = N2;
  E10.EdgeName = "kon";
  E10.Source = N4;
  E10.Target = N2;

  n0.put(E0.EdgeName,E0);
  n1.put(E1.EdgeName,E1);
  n1.put(E7.EdgeName,E7);
  n2.put(E2.EdgeName,E2);
  n2.put(E4.EdgeName,E4);
  n3.put(E5.EdgeName,E5);
  n3.put(E6.EdgeName,E6);
  n4.put(E3.EdgeName,E3);
  n4.put(E10.EdgeName,E10);
  n5.put(E8.EdgeName,E8);
  n5.put(E9.EdgeName,E9);
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