import java.util.Scanner;

public class MenuHelados {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int opcion;
            String helado;

            do {
                System.out.println("Bienvenido a la heladería don Omar y Pepe!");
                System.out.println("1. Helado de vainilla");
                System.out.println("2. Helado de chocolate");
                System.out.println("3. Helado de coco");
                System.out.println("4. Helado de limon");
                System.out.println("5. Helado de mango");
                System.out.println("6. Helado de oreo");
                System.out.println("7. Helado de Crema y galletas");
                System.out.println("8. Helado de Chispas de chocolate");
                System.out.println("9. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = input.nextInt();
                System.out.print("\033[H\033[2J");
                System.out.flush();

                switch (opcion) {
                    case 1:
                        helado = "Helado de vainilla";
                        break;
                    case 2:
                        helado = "Helado de chocolate";
                        break;
                    case 3:
                        helado = "Helado de coco";
                        break;
                    case 4:
                        helado = "Helado de limon";
                        break;
                    case 5:
                        helado = "Helado de mango";
                        break;
                    case 6:
                        helado = "Helado de oreo";
                        break;
                    case 7:
                        helado = "Helado de Crema y galletas";
                        break;
                    case 8:
                        helado = "Helado de Chispas de chocolate";
                        break;
                    case 9:
                        System.out.println("Gracias por visitarnos. ¡Vuelva pronto!");
                        helado = "";
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor seleccione una opción válida.");
                        helado = "";
                        break;
                }
                if(!helado.isEmpty()) {
                    System.out.println("Usted seleccionó: " + helado);
                }
            } while (opcion != 9);
        }
    }
}