package pedidos;

import pedidos.adapters.out.InMemoryOrderRepository;
import pedidos.application.CreateOrderUseCase;
import pedidos.application.GetOrderUseCase;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Repository
        InMemoryOrderRepository repository =
                new InMemoryOrderRepository();

        // Use Cases
        CreateOrderUseCase createOrderUseCase =
                new CreateOrderUseCase(repository);

        GetOrderUseCase getOrderUseCase =
                new GetOrderUseCase(repository);

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            opcion = mostrarMenu(sc);

            switch (opcion) {

                case 1:
                    System.out.println("Crear producto");
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

        } while (opcion != 5);

        sc.close();
    }

    public static int mostrarMenu(Scanner sc) {

        System.out.println("\n===== SISTEMA DE PEDIDOS =====");
        System.out.println("1. Crear producto");
        System.out.println("2. Crear pedido");
        System.out.println("3. Buscar pedido");
        System.out.println("4. Mostrar total de un pedido");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");

        return sc.nextInt();
    }
}