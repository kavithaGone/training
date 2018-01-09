package com.kavitha.examples2;


import java.io.*;
import java.util.*;

class Arraylist
{
 public static void main(String[] args)
                    throws IOException
 {
  
     int n = 5;

     
     ArrayList<Integer> a = new ArrayList<Integer>(n);

  
     for (int i=1; i<=n; i++)
         a.add(i);

     
     System.out.println(a);

     
     a.remove(3);

 
     System.out.println(a);

 
     for (int i=0; i<a.size(); i++)
         System.out.print(a.get(i)+" ");
 }
}