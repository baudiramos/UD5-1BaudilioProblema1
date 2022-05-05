import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String numero = "";


        ColasUtils colas = new ColasUtils(4);

        Scanner sc = new Scanner(System.in);

        while (!numero.equals("Q")) {

            System.out.println("Introduce un número o pulsa Q para salir");

            numero = sc.nextLine();

            if (!numero.equals("Q")) {
                float numeroFlotante = Float.parseFloat(numero);
                colas.enqueue(numeroFlotante);
            } else if (numero.equals("Q")) {
                System.out.println(colas);
            }

        }



    }
}
