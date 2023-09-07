import java.util.Scanner;

public class Expendedora {
    public static Double price(int cantidad, double precio){
        double variable1 = cantidad * precio;
        return variable1;
    }

    /**
     *Descripción:Función que ingresando el dinero y especificando el precio del producto, se informa el vuelto
     *
     * @param dinero Dinero ingresado por el usuario
     * @param precio El precio del producto que se elige
     * @return en caso de que el dinero ingresado no sea suficiente, se le informa al usuario
     * */
    public static String payment(double dinero, double precio){
        if (dinero >= precio){
            double vuelto = dinero - precio;
            return "Tu vuelto es de " + vuelto + "$\nGracias por tu compra!";
        }else {
            return "El dinero ingresado no es suficiente";
        }
    }

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
        double var1;

        if (sc.hasNextInt()){
            int number1 = sc.nextInt();
            int buy = 0;
            int quantity = 0;

            if(number1 >= 0 && number1 < snacks.length){
                System.out.println("\nHaz seleccionado un/a: " + snacks[number1]);
                System.out.println("El precio de es: " + prices[number1] + "$");

                System.out.println("¿Cuántos deseas comprar?");
                quantity = sc.nextInt();
                System.out.println("\nEl precio total es de " + price(quantity, prices[number1]) + "$");

                do {
                    System.out.println("¿Confirma la compra?\n 0=No/1=Si");//<-Meter un LOOP aca???
                    buy = sc.nextInt();
                } while (buy != 0 && buy!= 1);

                if (buy == 1) {
                    System.out.println("\nIngrese dinero: ");
                    Scanner scn = new Scanner(System.in);//<- for?
                    double money = scn.nextDouble();
                    System.out.println("\n" + payment(money, price(quantity, prices[number1])));
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
}
