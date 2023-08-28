import java.util.Scanner;

public class Expendedora {
    public static void main(String[] args){

        String[] snacks = new String[17];


        // Armar un arreglo de 2 dimensiones, una dimension con numeros y otra con los snacks
        snacks[0]= "void";
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


        System.out.println("Ingrese un número del 1 al 16:");

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()){
            int number1 = sc.nextInt();
            if(number1 >= 0 && number1 < snacks.length){
                System.out.println("Haz seleccionado un: " + snacks[number1]);
            } else{
                System.out.println("El número " + number1 + " no es válido");
            }
        } else if(sc.hasNextDouble()) {
            double number2 = sc.nextDouble();
            System.out.println("El número " + number2 + " no es válido");
        }

    }
}
