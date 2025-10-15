package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        
        String input = Console.readLine();
        String delimiter = "[,:]";

        
        if(input.startsWith("//") && input.contains("\\n")) {
            int newlineIndex = input.indexOf("\\n");
            String customDelimiter = input.substring(2, newlineIndex);

            input = input.substring(newlineIndex + 2);
            delimiter = "[,:]|" + customDelimiter;
        }
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