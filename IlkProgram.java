    import java.util.Scanner;
public class IlkProgram{
    public static void main(String[] args){
        System.out.println("Power Rangers gibiyim - H4WK OFCX");
        System.out.println("* Operatörler , eşit , eşitsizlik *");
        System.out.println("----------------------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayı =>  ");
        int ilk = input.nextInt();
        System.out.println("----------------------------------------------------");
        System.out.print("ikinci sayı =>  ");
        int iki = input.nextInt();
        System.out.println("----------------------------------------------------");
        if(ilk != iki){
            System.out.println(ilk+ " eşit değildir " + iki);
        }
        if(ilk < iki){
            System.out.println("----------------------------------------------------");
            System.out.println(ilk+ " küçüktür "+ iki);
        }if(ilk <= iki){
            System.out.println("----------------------------------------------------");
            System.out.println(ilk+" küçük veya eşittir "+ iki);
        }if(ilk >= iki){
            System.out.println("----------------------------------------------------");
            System.out.println(ilk+" büyük veya eşittir "+ iki);
        }if(ilk > iki){
            System.out.println("----------------------------------------------------");
            System.out.println(ilk+" büyüktür "+ iki);
        }
    }
 
}
