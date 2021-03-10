package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int Nombre =-110;
        Scanner scan = new Scanner(System.in);

        while(Nombre!=42){
            System.out.print("Entrer un nombre : ");
            Nombre = scan.nextInt();
            if (Nombre!=42){
                System.out.println("Mauvaise reponse!!");
            }
        }
        System.out.println("Bravo!!");
        scan.close();

    }
}

