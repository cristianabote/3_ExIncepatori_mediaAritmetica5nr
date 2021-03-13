package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// creeaza un program a carei metoda calculeaza media a 5 numere.

        System.out.println(media());

    }
    public static float media() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti cele 5 numere: " );
        float sum=0;
        for(int i=0; i<5;i++){
            int nr=scan.nextInt();
            sum=sum+nr;

        }
       float media = sum / 5;
       return media;
    }

}
