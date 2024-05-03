package cajero;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int opcion = 0, depos = 0, retiro = 0, saldo = 0, saldoant = 0;
        do {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar deposito");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Consultar saldo anterior");
            System.out.println("5. Salir");
            System.out.println("Que oparación desea realizar: ");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Tu saldo es de:" + saldo + " pesos");
                    break;

                case 2:
                    System.out.println("¿Cuanto deseas depositar?");
                    depos = leer.nextInt();
                    System.out.println("Deposito exitoso");
                    saldo = saldo + depos;
                    saldoant = saldo - depos;
                    System.out.println("Saldo nuevo: " + saldo);
                    System.out.println("Saldo anterior: " + saldoant);
                    break;

                case 3:
                    System.out.println("¿Cuanto de sea retirar? ");
                    retiro = leer.nextInt();

                    if (saldo < retiro) {
                        System.out.println("No puedes realizar retiro saldo insuficiente");
                    } else {
                        saldo = saldo - retiro;
                        System.out.println("Retiro exitoso");

                    }
                    System.out.println("Tu saldo actual es: " + saldo);
                    break;

                case 4:
                    System.out.println("¿Desea consultar saldo anterior?");
                    System.out.println("Saldo anterior: " + saldo);
                    break;

                case 5:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Número no válido...");
            }

            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Continuar");
            System.out.println("2. Salir");
            opcion = leer.nextInt();

        } while (opcion == 1);
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Continuar");
        System.out.println("2. Salir");
        opcion = leer.nextInt();
    }
}
