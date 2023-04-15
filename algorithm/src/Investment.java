/**
 * Este programa se recibir un nomnre de usuario, monto y tipo de identificación
 * Calculando a partir de un monto el fondo sugerido por TYBA
 *
 * @author duban@tyba.com.co
 */

import java.util.Scanner;

public class Investment {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long ValorProyectado = 0;

        System.out.println("---BIENVENIDO A TYBA TU MEJOR ELECCIÓN PARA INVERTIR---");
        System.out.println();
        System.out.println("Ingrese Su Nombre: ");
        System.out.println();
        String name = sc.nextLine();
        System.out.println();
        System.out.println("Listado de documentos de identificación para TYBA");
        System.out.println();
        System.out.println("1. Cédula de ciudadanía");
        System.out.println("2. Cédula de extranjería");
        System.out.println("3. Pasaporte,Permisos especial de permanencia, Registro civil o Tarjeta de identidad");
        System.out.println("4. Salir");
        System.out.println();
        System.out.println("Digite documento válido");
        int opcion = sc.nextInt();

        if (opcion == 1 || opcion == 2) {

            System.out.println("Monto que vas a invertir: ");
            long monto = sc.nextLong();
            System.out.println();
            System.out.println();

            switch (opcion) {

                case 1:

                    if (monto <= 0) {
                        System.out.println("Montó inválido, solo se aceptan número positivos");
                        break;
                    }

                case 2:

                    if (monto <= 199) {
                        System.out.println("Monto mínimo de inversión es de $200.000 Debes invertir un valor mayor Gracias");
                    }

                case 3:

                    if (monto >= 200 && monto <= 5000000) {
                        ValorProyectado = (monto * 100) / 7;
                        System.out.println("Bienvenido al mundo de las inversiones: " + name);
                        System.out.println("Tu producto recomendable para tu monto es CDT: " + monto);
                        System.out.println("De acuerdo a las ganancia que ofrecen el fondo son equivalentes al 7% del valor proyecto: " + ValorProyectado);
                        System.out.println("Monto + Rentabilidad: De acuerdo a tu inversión tus ganancias:" + monto + ValorProyectado);
                    }

                case 4:

                    if (monto >= 5000001 && monto <= 25000000) {
                        ValorProyectado = (monto * 100) / 12;
                        System.out.println("Bienvenido al mundo de las inversiones: " + name);
                        System.out.println("Tu producto recomendable para tu monto es Acciones: : " + monto);
                        System.out.println("De acuerdo a las ganancia que ofrecen el fondo son equivalentes al 12% del valor proyecto: " + ValorProyectado);
                        System.out.println("Monto + Rentabilidad: De acuerdo a tu inversión tus ganancias:" + monto + ValorProyectado);
                    }

                case 5:

                    if (monto >= 25000001) {
                        ValorProyectado = (monto * 100) / 20;
                        System.out.println("Bienvenido al mundo de las inversiones:" + name);
                        System.out.println("Tu producto recomendable para tu monto es Fondos de Inversión.:  " + monto);
                        System.out.println("De acuerdo a las ganancia que ofrecen el fondo son equivalentes al 20% del valor proyecto: " + ValorProyectado);
                        System.out.println("Monto + Rentabilidad: De acuerdo a tu inversión tus ganancias:" + monto + ValorProyectado);
                    }
                    break;

            }


        } else if (opcion == 3) {
            InversionNoPermitida();
        }
    }


    static void InversionNoPermitida() {

        System.out.println("Gracias por su interés en invertir, tu tipo de documento no puede invertir este momento.");
    }

}

