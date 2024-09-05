import java.util.Scanner;

public class main {
    /*double celTemp;
    double kelTemp;
    double faherTemp;*/

//1
    public static double cel_To_Kel(double celValue){
        double kelTemp;
        kelTemp = celValue + 273.15 ;
        System.out.println(" your KELVIN value is :");
        return kelTemp;
    }

//2
    public static double cel_To_faher(double celTemp){
        double faherTemp;
        faherTemp = (celTemp * 1.8) + 32 ;
        System.out.println(" your FAHRENHEIT value is :");
        return faherTemp;
    }

//3
    public static double kel_To_Cels(double kelValue){
        double celTemp;
        celTemp =kelValue - 273.15 ;
        System.out.println(" your CELSIUS value is :");
        return celTemp;
    }

//4
    public static double kel_To_faher(double kelValue){
        double faherTemp;
        faherTemp = (kelValue - 273.15) * 1.8 + 32 ;
        System.out.println(" your FAHRENHEIT value is :");
        return faherTemp;
    }

//5
    public static double faher_To_Cels( double fahvalue){
        double celTemp;
        celTemp = (fahvalue - 32) * 1.8 ;
        System.out.println(" your CELSIUS value is :");
        return celTemp;
    }

//6
    public static double faher_To_Kel( double fahvalue){
        double kelTemp;
        kelTemp = (fahvalue - 32) * 1.8 + 273.15;
        System.out.println(" your KELVIN value is :");
        return kelTemp;
    }




    public static void main(String[] args) {
        System.out.println();
        System.out.println("==============================***** WELCOME TO TEMPERATURE CONVERSION SYSTEM *****==============================");
        System.out.println();
        System.out.println("[1]. CELSIUS TO KELVIN \t\t\t\t\t       [2].  CELSIUS TO FAHRENHEIT \t\t\t\t\t  " );
        System.out.println();
        System.out.println("[3]. KELVIN TO CELSIUS\t\t\t\t\t        [4]. KELVIN TO FAHRENHEIT \t\t\t\t\t " );
        System.out.println();
        System.out.println("[5]. FAHRENHEIT TO CELSIUS\t\t\t\t\t    [6]. FAHRENHEIT TO KELVIN \t\t\t\t\t  " );
        System.out.println();
        System.out.println("========================================*****-ENTER 0 FOR EXIT*****========================================");

        Scanner sc = new Scanner(System.in);
        int input= sc.nextInt();



        if (input==1){
            System.out.println("enter CELSIUS value:");
           double celValue= sc.nextDouble();
           double res1= cel_To_Kel(celValue);
            System.out.println(res1);
        } else if (input ==2) {
            System.out.println("enter CELSIUS value:");
            double celValue= sc.nextDouble();
            double res2= cel_To_faher(celValue);
            System.out.println(res2);
        } else if (input==3) {
            System.out.println("enter KELVIN value:");
            double kelValue= sc.nextDouble();
            double res3= kel_To_Cels(kelValue);
            System.out.println(res3);
        }else if (input==4) {
            System.out.println("enter KELVIN value:");
            double kelValue= sc.nextDouble();
            double res1= kel_To_faher(kelValue);
            System.out.println(res1);
        }else if (input==5) {
            System.out.println("enter FAHRENHEIT value:");
            double fahValue= sc.nextDouble();
            double res1= faher_To_Cels(fahValue);
            System.out.println(res1);
        }else if (input==6) {
            System.out.println("enter FAHRENHEIT value:");
            double fahValue= sc.nextDouble();
            double res6= faher_To_Kel(fahValue);
            System.out.println(res6);
        }else {
            System.out.println("enter valid value");
        }

    }

}


