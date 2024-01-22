import java.util.Scanner;

public class Holidayzer {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Holidays holydayzer = new Holidays();

        holydayzer.add("01/01/2024", "Confraternização Mundial");
        holydayzer.add("12/02/2024", "Carnaval");
        holydayzer.add("13/02/2024", "Carnaval");
        holydayzer.add("29/03/2024", "Sexta-feira Santa");
        holydayzer.add("21/04/2024", "Tiradentes");
        holydayzer.add("01/05/2024", "Dia do Trabalho");
        holydayzer.add("30/05/2024", "Corpus Christi");
        holydayzer.add("07/09/2024", "Independência do Brasil");
        holydayzer.add("12/10/2024", "Nossa Senhora Aparecida");
        holydayzer.add("02/11/2024", "Finados");
        holydayzer.add("15/11/2024", "Proclamação da República");
        holydayzer.add("20/11/2024", "Dia Nacional de Zumbi e da Consciência Negra");
        holydayzer.add("25/12/2024", "Natal");

        System.out.println("""
                                                          .
                                                       .' |
                                                     .'   |
                                                     /`-._'
                                                    /   /
                                                   /   /
                                                  /   /
                                                 (`-./
                                                  )
                BEM-VINDO AO HOLYDAYZER (JAVA)!!! '
                 """);

        while (true) {
            System.out.println("O que deseja fazer?");
            System.out.println("""
                        1 => Encontrar feriado
                        2 => Mostrar todos os feriados
                        3 => Sair
                    """);

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 3) {
                break;
            }

            if (option == 1) {
                System.out.println("Informe a data (DD/MM/YYYY): ");
                String day = scanner.nextLine();
                System.out.println();
                holydayzer.find(day);
                System.out.println();
                continue;
            }

            if (option == 2) {
                holydayzer.getAll();
            }

        }
    }
}