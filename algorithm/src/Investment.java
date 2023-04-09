import java.util.Scanner;

public class Investment {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float ValorProyectado = 0;

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
            float monto = sc.nextFloat();
            System.out.println();
            System.out.println();

            switch (opcion) {

                case 1:

                    if (monto <= 0) {
                        System.out.println("monto invalido");
                        break;
                    }

                case 2:

                    if (monto <= 200) {
                        System.out.println("monto mínimo de inversión es de $200.000.");
                    }

                case 3:

                    if (monto > 200 && monto <= 5000000) {
                        ValorProyectado = (monto * 100) / 7;
                        System.out.println("Bienvenido al mundo de las inversiones: " + name);
                        System.out.println("Te recomendamos el producto de CDT para tu monto: " + monto);
                        System.out.println("De acuerdo a las ganancia que ofrecen el fondo son equivalentes al 7% del valor proyecto: " + ValorProyectado);
                        System.out.println("Monto + Rentabilidad: De acuerdo a tu inversión tus ganancias:" + monto + ValorProyectado);
                    }

                case 4:

                    if (monto > 5000000 && monto <= 25000000) {
                        ValorProyectado = (monto * 100) / 12;
                        System.out.println("Bienvenido al mundo de las inversiones: " + name);
                        System.out.println("Te producto de Acciones para tu monto: " + monto);
                        System.out.println("De acuerdo a las ganancia que ofrecen el fondo son equivalentes al 12% del valor proyecto: " + ValorProyectado);
                        System.out.println("Monto + Rentabilidad: De acuerdo a tu inversión tus ganancias:" + monto + ValorProyectado);
                    }

                case 5:

                    if (monto > 25000000) {
                        ValorProyectado = (monto * 100) / 20;
                        System.out.println("Bienvenido al mundo de las inversiones: " + name);
                        System.out.println("producto de Fondos de Inversión para tu monto: " + monto);
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

        System.out.println("Gracias por su interés en invertir, tu tipo de documento no puede invertir en el momento.");
    }

}

