package com.company;
import java.util.Scanner;
import java.lang.*;

public class Arms {



    public static boolean isArmstrong(String liczba){

        int dlugoscLiczby = liczba.length();


        int[] liczbarozbita = new int[dlugoscLiczby];


        int sumaArm = 0;

        for(int x=0; x<dlugoscLiczby; x++)
        {
            char cyfra = liczba.charAt(x);
            liczbarozbita[x] = Character.getNumericValue(cyfra);
            sumaArm += Math.pow(liczbarozbita[x],dlugoscLiczby);

        }
        if(sumaArm == Integer.parseInt(liczba))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

}
