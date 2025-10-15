package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        String input = Console.readLine();
        String delimiter = "[,:]";

        String[] numbers = input.split(delimiter);
        int sum = 0;

        for(String number : numbers){
            if(!number.trim().isEmpty()){
                sum += Integer.parseInt(number.trim());
            }
        }

        System.out.println("결과 : " + sum);
    }
}