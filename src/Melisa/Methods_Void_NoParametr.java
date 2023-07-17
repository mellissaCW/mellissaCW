package Melisa;

public class Methods_Void_NoParametr {
    public static void main(String[] args) {

        // 1. paramtresiz / void bir method
        menu();  // method call

        int sayi1 = 3;
        int sayi2 = 5;
        System.out.println(sayi1+sayi2);
        menu();

    }  // main dışı

    public static void menu() {
        System.out.println("Hoşgeldiniz");
        System.out.println("para yatırmak için 1 e basın");
        System.out.println("para cekmek için 2 ye basın");
        System.out.println("cıkmak için 3 e basın");
    }
} // class parantezi
