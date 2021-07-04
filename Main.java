public class Main{

    public static void main(String[] args) {

        numberToWords(0);


    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }
        if (number == 0){
            System.out.println("Zero");
        }
        int digit = 0;
        int numberDigitCount = getDigitCount(number);
        int reverseDigitCount = getDigitCount(reverse(number));


       number = reverse(number);


        while (number > 0){

            digit = number % 10;

            switch (digit){
                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;

                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;

                case 5:
                    System.out.println("Five");
                    break;

                case 6:
                    System.out.println("Six");
                    break;

                case 7:
                    System.out.println("Seven");
                    break;

                case 8:
                    System.out.println("Eight");
                    break;

                case 9:
                    System.out.println("Nine");
                    break;

                case 0:
                    System.out.println("Zero");
                    break;
            }

            number /= 10;

        }
        for (int i = reverseDigitCount; i < numberDigitCount; i++){
            System.out.println("Zero");
        }

    }

    public static int reverse (int number){
        int reverse = 0;
        while (number != 0){
            reverse *= 10;
            reverse += number % 10;;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        int count = 0;

        if (number < 0){
            return -1;
        }
        if (number == 0){
            return 1;
        }
        while (number > 0){

            number /= 10;
            count++;
        }

        return count;
    }
}


