package com.company;

import java.util.Scanner;

public class Jogo{


    public void jogar() {


        int numeroEscolhido;
        int jogadaAtual;
        String campo;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero de 0 a 100");
        campo = sc.nextLine();
        isNum(campo);
        if (ret ==true){

            System.out.println("sdf");

    }
        public boolean isNum(String strNum) {
            boolean ret = true;
            try {

                Double.parseDouble(strNum);

            }catch (NumberFormatException e) {
                ret = false;
            }
            return ret;
        }






        if (campo.matches("[0-9]+")){

            if (campo <= 100){

            }
            System.out.println("numerico");
        }
        else{
            System.out.println("nao numerico");
        }

        //numeroEscolhido = Integer.parseInt(sc.nextLine());


    }







}
