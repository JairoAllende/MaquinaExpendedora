import java.util.Scanner;

public class Expendedora {
    public static void main(String[] args){

        String[] snacks = new String[17];

        snacks[1]= "Chocolate";
        snacks[2]= "Alfajor";
        snacks[3]= "Don Satur";
        snacks[4]= "Coca-Cola";
        snacks[5]= "Sprite";
        snacks[6]= "Chicle";
        snacks[7]= "Caramelo";
        snacks[8]= "Rocklets";
        snacks[9]= "Agua";
        snacks[10]= "Fanta";
        snacks[11]= "Turron";
        snacks[12]= "Paso de los Toros";
        snacks[13]= "BonOBon";
        snacks[14]= "Pringles";
        snacks[15]= "Doritos";
        snacks[16]= "Chetos";

        Double[] prices = new Double[17];

        prices[1]= 3.0;
        prices[2]= 3.5;
        prices[3]= 4.0;
        prices[4]= 5.0;
        prices[5]= 5.0;
        prices[6]= 2.0;
        prices[7]= 1.0;
        prices[8]= 3.0;
        prices[9]= 2.0;
        prices[10]= 5.0;
        prices[11]= 2.5;
        prices[12]= 4.0;
        prices[13]= 2.5;
        prices[14]= 6.0;
        prices[15]= 4.5;
        prices[16]= 3.8;

        System.out.println("Ingrese un número del 1 al 16:");

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()){
            int number1 = sc.nextInt();
            if(number1 >= 0 && number1 < snacks.length){
                System.out.println("Haz seleccionado un/a: " + snacks[number1]);
                System.out.println("El precio es de : " + prices[number1]);
                int buy = 0;

                do {
                    System.out.println("\n¿Confirma la compra?\n 0=No/1=Si");//<-Meter un LOOP aca???
                    Scanner scn = new Scanner(System.in);
                    buy = scn.nextInt();
                } while (buy != 0 && buy!= 1);//<- Agregar otro valor para acceder a un for que valla sumando t

                if (buy == 1) {
                    System.out.println("Ingrese dinero: ");
                    Scanner scn = new Scanner(System.in);
                    double money = Double.valueOf(scn.nextLine());
                    System.out.println(payment(money, prices[number1]));
                } else {
                    System.out.println("La compra se ha cancelado");
                }
            } else{
                System.out.println("El número " + number1 + " no es válido");
            }
        } else if(sc.hasNextDouble()) {
            double number2 = sc.nextDouble();
            System.out.println("El número " + number2 + " no es válido");
        }
    }

    public static String payment(double dinero, double precio){
        if (dinero >= precio){
            double variable1 = dinero - precio;
            return "Tu vuelto es de " + variable1 + "$\nGracias por tu compra!";
        }else {
            return "El dinero ingresado no es suficiente";
        }
    }
}
