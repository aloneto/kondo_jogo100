package com.company;

import java.util.Scanner;

public class Jogo {


    public int choiceNum() {


        int num = 999;
        int jogadaAtual;

        String input;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero de 0 a 100");
        input = sc.nextLine();

        boolean numValid = validNum(input);
        if (numValid == true) {
            num = Integer.parseInt(input);
            System.out.println("validado");

        } else {
            choiceNum();
        }
        return num;

    }


    public boolean validNum(String strNum) {
        boolean num = true;
        if (strNum.length() <= 2) {

            System.out.println("quantidade digitos aceito: validando se é numero: " + strNum);

        } else {
            System.out.println("Atenção >>>> muitos digitos, digite um numero de 0 a 100!");
            return false;
        }


        try {

            Integer.parseInt(strNum);
            System.out.println("numero aceito e validado: " +strNum);


        } catch (
                NumberFormatException e) {
            System.out.println("Atenção >>>> digite um numero de 0 a 100!");
            num = false;
        }
        return num;
    }


}


