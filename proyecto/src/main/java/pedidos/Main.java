package pedidos;

import pedidos.application.*;
import pedidos.ports.configuration.ApplicationConfiguration;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ApplicationConfiguration config =
                new ApplicationConfiguration();

        CreateOrderUseCase createOrderUseCase =
                config.createOrderUseCase();

        CreateProductUseCase createProductUseCase =
                config.createProductUseCase();

        FindOrderByIdUseCase findOrderByIdUseCase =
                config.findOrderByIdUseCase();

        FindProductByIdUseCase findProductByIdUseCase =
                config.findProductByIdUseCase();

        ListProductsUseCase listProductsUseCase =
                config.listProductsUseCase();

        PayOrderUseCase payOrderUseCase =
                config.payOrderUseCase();

        ProcessOrderUseCase processOrderUseCase =
                config.processOrderUseCase();

        ShipOrderUseCase shipOrderUseCase =
                config.shipOrderUseCase();



        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            opcion = mostrarMenu(sc);

            switch (opcion) {

                case 1:
                    System.out.println("Crear producto");
                    createOrderUseCase();
                    break;

                case 2:
                    System.out.println("Crear pedido");
                    break;

                case 3:
                    System.out.println("Buscar pedido");
                    break;

                case 4:
                    System.out.println("Mostrar total");
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 6);

        sc.close();
    }

    public static int mostrarMenu(Scanner sc) {

        System.out.println("\n===== SISTEMA DE PEDIDOS =====");
        System.out.println("1. Crear producto");
        System.out.println("2. Crear orden");
        System.out.println("3. Cambiar el estado de un pedido.");
        System.out.println("4. Buscar un producto");
        System.out.println("4. Buscar una orden");
        System.out.println("5. Mostrar total de un pedido");
        System.out.println("6. Ver todos los productos");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");

        return sc.nextInt();
    }
}