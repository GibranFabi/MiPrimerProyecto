import java.util.Scanner;

public class MenuHelados {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int opcion;
            String helado;

            do {
                System.out.println("Bienvenido a la heladería!");
                System.out.println("1. Helado de vainilla");
                System.out.println("2. Helado de chocolate");
                System.out.println("3. Helado de fresa");
                System.out.println("4. Salir");
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
                        helado = "Helado de fresa";
                        break;
                    case 4:
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
            } while (opcion != 4);
        }
    }
}