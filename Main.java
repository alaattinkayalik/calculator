import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("1-4 Arasında Bir Sayı Giriniz (1-Toplama , 2-Çıkarma , 3-Çarpma , 4-Bölme)= ");
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
        switch (selection)
        {
            case(1):
                System.out.println("Birinci Sayıyı Giriniz = ");
                int num1 = input.nextInt();
                System.out.println("İkinci Sayıyı Giriniz = ");
                int num2 = input.nextInt();
                int tottaladdition = addition(num1,num2);
                System.out.println("Sonuç = "+tottaladdition);
                break;
            case(2):
                System.out.println("Birinci Sayıyı Giriniz = ");
                double num3 = input.nextInt();
                System.out.println("İkinci Sayıyı Giriniz = ");
                double num4 = input.nextInt();
                double totalsubtraction = subtraction(num3,num4);
                System.out.println("Sonuç = "+totalsubtraction);
                break;
            case(3):
                System.out.println("Birinci Sayıyı Giriniz = ");
                int num5 = input.nextInt();
                System.out.println("İkinci Sayıyı Giriniz = ");
                int num6 = input.nextInt();
                double totalmultiplication = multiplication(num5,num6);
                System.out.println("Sonuç = "+totalmultiplication);
                break;
            case(4):
                System.out.println("Birinci Sayıyı Giriniz = ");
                float num7 = input.nextInt();
                System.out.println("İkinci Sayıyı Giriniz = ");
                float num8 = input.nextInt();
                float totaldivision = division(num7,num8);
                System.out.println("Sonuç = "+totaldivision);
                break;
            default:
        }
    }
    public static int addition(int num1,int num2)
    {
        return num1+num2;
    }
    public static double subtraction(double num1,double num2)
    {
        return num1-num2;
    }
    public static int multiplication(int num1,int num2){
        return num1*num2;
    }
    public static float division(float num1,float num2){
        return num1/num2;
    }
}