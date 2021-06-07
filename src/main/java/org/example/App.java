package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colton Flynn
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner Obj = new Scanner(System.in);

        System.out.print( "How many people? ");
        int people = Integer.parseInt(Obj.nextLine());

        System.out.print( "How many pizzas do you have? ");
        int pizzas = Integer.parseInt(Obj.nextLine());

        System.out.print( "How many slices per pizza? ");
        int slicesPerPizza = Integer.parseInt(Obj.nextLine());

        int totalSlices = pizzas * slicesPerPizza;
        int slicesPerPerson = totalSlices/people;
        int leftover = totalSlices-(slicesPerPerson * people);

        System.out.println(people+" people with "+pizzas+" pizzas ("+totalSlices+" slices)");
        System.out.println("Each person gets "+slicesPerPerson+" pieces of pizza.");
        System.out.println("There are "+leftover+" leftover pieces.");
    }
}