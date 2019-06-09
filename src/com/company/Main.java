package com.company;

public class Main {

    public static void main(String[] args) {

        //numero de tentativas do jogo
        int attempts = 5;
        int choices[] = new int[10];
        int i;

        Jogo jg = new Jogo();
        int numberChoiced = (jg.choiceNum());
        //System.out.println("o numero escolhido foi: " + Double.toString(numberChoiced));

        choices[0] = numberChoiced;


        // coloca os numeros escolhidos em um array

        for (i = 1; i <= attempts; i++) {

            numberChoiced = (jg.choiceNum());
            System.out.println("o numero escolhido foi: " + Double.toString(numberChoiced));
            choices[i] = numberChoiced;

            String result = jg.test(choices[0], choices[i]);
            System.out.println(result);

            if (result == "Voçe acertou, parabens!!") {

                break;

            }


        }

        //for (int a = 0; a <= choices.length; a++) {
            jg.printResult(choices[0], numberChoiced);
        jg.printResult(choices[1], numberChoiced);
        jg.printResult(choices[2], numberChoiced);
        jg.printResult(choices[3], numberChoiced);
        jg.printResult(choices[4], numberChoiced);



    }

}


