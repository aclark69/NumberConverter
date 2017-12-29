
/* Andrew Clark
 * 9/09/2014
 * COSC 221
 * A menu driven program that take a number or binary 8 bit sequence 
 * and will convert it into a binary 8 bit 
 * sequence or number
 */
import java.util.Scanner;
public class Conversion
{
    public static void main(String a[])
    {
        Scanner keyboard = new Scanner(System.in);
        //glass dtb = new glass();

        int response;
        boolean cont = true;
        
        while(cont)
        {
            System.out.println("Enter '1' to convert a deciaml to binary");
            System.out.println("Enter '2' to convert a binary to decimal");
            System.out.println("Enter '3' to quit");
            response = keyboard.nextInt();
            String binaryNumber = "";
            String reverse = "";
            
            switch (response)
            {
                case 1: if(response == 1)
                {
                    System.out.println("Enter a number between 0 and 255");
                    int number = keyboard.nextInt();
                    int count = 0;
                    

                    while(number > -1 && count < 8)
                    {
                        if(number%2 == 0)
                        {
                            binaryNumber = binaryNumber + 0;
                            number = number/2;
                            count = count + 1;
                        }
                        else if(number%2 == 1)
                        {
                            binaryNumber = binaryNumber + 1;
                            number = number/2;
                            count = count + 1;
                        }
                    }

                    //System.out.println("Your binary number is " + binaryNumber);
                    
                    int length = binaryNumber.length();
                    
                    for ( int i = length - 1 ; i >= 0 ; i-- )
                    {
                       reverse = reverse + binaryNumber.charAt(i);
                    }
                    
                    System.out.println("The binary version is: "+reverse);
                    
              
                    //dtb.binary(binaryNumber);
                    //dtb.printBinaryFormat(number);
                }

                case 2: if(response == 2)
                {
                    System.out.println("Please enter a 8-bit bianry number");
                    binaryNumber = keyboard.next();
                    int result = 0;

                    for(int i = 0; i<8; i++)
                    {
                        if(binaryNumber.charAt(i) == '0')
                        {
                            result = result + 0;
                        }
                        else if(binaryNumber.charAt(i) == '1')
                        {
                            result = result + ((int) (Math.pow(2,7-i)));
                        }
                    }
                    System.out.println("The decimal number is " + result);
                }

                case 3: if(response == 3)
                {
                    System.exit(0);
                }
            }
        }
    }
}
/***
 * case 2: if(response == 2)
{
System.out.println("Enter binary code");
//binaryNumber = keyboard.nextInt();
//bd.getDecimalFromBinary(binaryNumber);
//convert to binary
//bd.getDecimalFromBinary(number);
System.out.println("Binary Conversion is this");
}

 */
