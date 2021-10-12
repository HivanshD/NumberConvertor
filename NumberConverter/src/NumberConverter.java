import java.util.Scanner;
public class NumberConverter{
    public static void main(String [] args){
        Scanner options= new Scanner(System.in);
        System.out.println("choose one of the following Binary(1), Decimal(2), Hexadecimal(3)");
        int option=options.nextInt();
        if (option==1){
            System.out.println("Enter a binary number");
            int number=options.nextInt();
            System.out.println("Your binary number is equal to the decimal number " +binaryToDecimal(number));
            System.out.println("Your binary number is equal to the hexadecimal " +binaryToHex(number));
        }
        if (option==2){
            System.out.println("Enter a decimal number");
            int number=options.nextInt();
            System.out.println("Your decimal number is equal to the binary number " +decimalToBinary(number));
            System.out.println("Your decimal number is equal to the hexadecimal " +decimalToHex(number));
        }
        if (option==3){
            System.out.println("Enter a hexadecimal number");
            String number=options.next();
            System.out.println("Your hexadecimal is equal to the decimal number " +hexToDecimal(number));
            System.out.println("Your hexadecimal is equal to the decimal number " +hexToBinary(number));
        }
    }
    public static int binaryToDecimal(int b){
        int decimalvalue=0;
        int bin= b;
        int base=0;
        while (bin>0){
            decimalvalue += (Math.pow(2,base))*(bin%2);
            bin=bin/10;
            base ++;
        }
        return decimalvalue;
    }
    public static String binaryToHex(int b){
        int decimalvalue=0;
        int bin= b;
        int base=0;
        int remainder;
        String finalResult=("");
        char hexLetters[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while (bin>0){
            decimalvalue += (Math.pow(2,base))*(bin%2);
            bin=bin/10;
            base ++;
        }
        while (decimalvalue>=1){
            remainder=decimalvalue%16;
            finalResult=hexLetters[remainder]+finalResult;
            decimalvalue = decimalvalue/16;
        }
        return finalResult;
    }
    public static String decimalToBinary(int d){
        int decimal=d;
        String binary=("");
        int remainder;
        while (decimal>=1){
            remainder= decimal%2;
            binary=""+remainder+binary;
            decimal=decimal/2;
        }
        return binary;
    }
    public static String decimalToHex(int d){
        int decimalvalue=d;
        int remainder;
        String finalResult=("");
        char hexLetters[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while (decimalvalue>=1){
            remainder=decimalvalue%16;
            finalResult=hexLetters[remainder]+finalResult;
            decimalvalue = decimalvalue/16;
        }
        return finalResult;
    }
    public static int hexToDecimal(String h){
        int strLength =h.length();
        int base=1;
        int decimalvalue=0;
        for (int x=strLength-1; x>=0; x--){
            if (h.charAt(x) >= '0' && h.charAt(x) <= '9'){
                decimalvalue += (h.charAt(x) - 48)*base;
                base*=16;
            }
            else if (h.charAt(x) >= 'A' && h.charAt(x) <= 'F'){
                decimalvalue += (h.charAt(x) - 55)*base;
                base*=16;
            }
        }
        return decimalvalue;
    }
    public static String hexToBinary(String h){
        int strLength =h.length();
        int base=1;
        int decimalvalue=0;
        for (int x=strLength-1; x>=0; x--){
            if (h.charAt(x) >= '0' && h.charAt(x) <= '9'){
                decimalvalue += (h.charAt(x) - 48)*base;
                base*=16;
            }
            else if (h.charAt(x) >= 'A' && h.charAt(x) <= 'F'){
                decimalvalue += (h.charAt(x) - 55)*base;
                base*=16;
            }
        }
        String binary=("");
        int remainder;
        while (decimalvalue>=1){
            remainder= decimalvalue%2;
            binary=""+remainder+binary;
            decimalvalue=decimalvalue/2;
        }
        return binary;
    }
}
