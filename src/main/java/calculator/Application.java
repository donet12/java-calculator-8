package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        try{
            String input = Console.readLine();
            String delimiter = "[,:]";

        
            if(input.startsWith("//") && input.contains("\\n")) {
                int newlineIndex = input.indexOf("\\n");
                String customDelimiter = input.substring(2, newlineIndex);

                input = input.substring(newlineIndex + 2);
                delimiter = "[,:]|" + customDelimiter;
            } else {
                throw new IllegalArgumentException("잘못된 커스텀 구분자 형식입니다.");
            }
            String[] numbers = input.split(delimiter);
            int sum = 0;
            
            for(String number : numbers){
                if(!number.trim().isEmpty()){
                    int num = Integer.parseInt(number.trim());
                    if(num < 0){
                        throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
                    }
                    sum += Integer.parseInt(number.trim());
                }
            }
            
            System.out.println("결과 : " + sum);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("잘못된 형식입니다.");
        }
    }
}