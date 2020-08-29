package oop_assign05;
/*
Author:  Andrew Samuel
Started on:  [4/10/20]
*/
/*
This code is for Assignment 5 in Professor Soibam's CS 3300 class [M (1:00-2:15)]
*/
public class main {
    public static void main(String[] args) {
        String line_br = "###########################################################";
        
        Doctor  bw = new Doctor ("Surgery");
        bw.setName("Blake", "Winter");
        
        Patient ma = new Patient ("A001", 22, bw, new Date (8, 5, 1997), new Date (3, 10, 2020), new Date (3, 15, 2020));
        ma.setName("Mike", "Anderson");       
   
        Bill b1 = new Bill (ma, bw);
        
        System.out.println(ma);
        System.out.println(bw);
        System.out.println(b1);
        System.out.println(line_br);
        
        Doctor  hs = new Doctor ("Medicine");
        hs.setName("Hannah", "Shives");
        
        Patient jd = new Patient ("A002", 43, hs, new Date (3, 11, 1977), new Date (1, 3, 2020), new Date (1, 15, 2020));
        jd.setName("John", "Daugherty");
        
        Bill b2 = new Bill (jd, hs);
        
        System.out.println(jd);
        System.out.println(hs);
        System.out.println(b2);
        System.out.println(line_br);
        
        Patient bh = new Patient ("A003", 35, hs, new Date (9, 27, 1984), new Date (2, 6, 2020), new Date (2, 20, 2020));
        bh.setName("Ben", "Hayes");
        
        Bill b3 = new Bill (bh, hs);
        
        System.out.println(bh);
        System.out.println(hs);
        System.out.println(b3);
        System.out.println(line_br);
        
        Patient jh = new Patient ("A004", 32, bw, new Date (8, 15, 1987), new Date (2, 10, 2020), new Date (2, 12, 2020));
        jh.setName("Jennifer", "Hilton");
        
        Bill b4 = new Bill (jh, bw);
        
        System.out.println(jh);
        System.out.println(bw);
        System.out.println(b4);
    }
}
