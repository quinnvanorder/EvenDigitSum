public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number >= 0){
            if (number < 10){
                if (number % 2 == 0){
                    return number;
                }
            }
            else {
                int sum = 0;
                int tempNumber = number;

                while (tempNumber >=10){
                    int tempSingleNumber = tempNumber % 10;
                    System.out.println(tempSingleNumber);
                    if (tempSingleNumber % 2 == 0){
                        sum += tempSingleNumber;
                    }
                    tempNumber = tempNumber / 10;

                }
                System.out.println(tempNumber);
                if (tempNumber % 2 == 0){
                    sum += tempNumber;
                }

                return sum;
            }
            return -1;

        }
        else{
            return -1;
        }
    }
}
