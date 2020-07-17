package com.example.homeap.controller;

public class IndexTest {


        public static void main(String[] args){


            String indexOfTestOne = "    Hello world   ";

            String indexOfTestTwo = "    Hello";


            System.out.println("1번째 :" + indexOfTestOne.indexOf("o") );

            System.out.println("2번째 :" + indexOfTestOne.indexOf("x") );

            System.out.println("3번째 :" + indexOfTestOne.indexOf("o",5) );


            System.out.println("4번째 :" + indexOfTestTwo.indexOf("o") );

            System.out.println("5번째 :" + indexOfTestTwo.indexOf("el") );


            System.out.println("1번째 :" +  indexOfTestOne.lastIndexOf("o") );

            System.out.println("2번째 :" +  indexOfTestOne.lastIndexOf("x") );


            System.out.println("3번째 :" +  indexOfTestOne.lastIndexOf("H",5) );


    }






}
