package com.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
////        }
//        String F_name= "SHahab";
//        String L_name="Nawaz";
////        String FUll_name=F_name+ " "+L_name;
//        String FUll_name=F_name.concat(" ").concat("Middle name ").concat(L_name);
//        System.out.println(FUll_name);
//        ArrayList<String> S=new ArrayList<>();
//        S.a
//ArrayList<String> color= new ArrayList<>();
//color.add("RED");
//color.add("BLACK");
//color.add("RED");
//System.out.println(color);
//int size=color.size();
////for(String colors : color){
////    System.out.println(colors);
////}
//        color.add(0, "Yellow");
//        String retrieve=color.get(1);
//        System.out.println("THis is retireve  element from a 1 index element position"+ " "+retrieve);
//        String Update=color.set(2,"Orange");
//        System.out.println("This is update"+ " "+color);
//        String Remove=color.remove(2);
//        System.out.println("AFter remove" +" "+ color);
//boolean search =color.contains("Orange");
//System.out.println(search);


//        for(int i=0; i<size; i++){
//            System.out.println(color.get(i));
//        }

//        ArrayList<Integer> num=new ArrayList <>();
//num.add(8);
//num.add(9);
//num.add(45);
//num.add(12);
////        Collections.sort(num);
//
//        System.out.println(num);
//        ArrayList<Integer>num2=new ArrayList<>();
//        num2.add(56);
//        num2.add(98);
//
//        num2.addAll(num);
//        System.out.println(num2);
//        Collections.reverse(num2);
//        System.out.println(num2);
// List<Integer>sub_list =num2.subList(0,3);
// System.out.println(sub_list);
// int[] Rahul={4,7,6,4};
//// System.out.println(Arrays.toString(Rahul));
//        for(int num:Rahul){
//            System.out.println(num);
//        }
 int [] array={8,4,7,2,5,8,9};
 for (int i=0; i<array.length-1; i++){
     for (int j=0; j<array.length-i-1; j++){
        if (array[j]< array[j+1]){
            int temp=array[j];
            array[j]=array[j+1];
            array[j+1]=temp;

        }
     }
 }
 System.out.println(Arrays.toString(array));
}
}