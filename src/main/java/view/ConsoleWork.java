package view;


import model.DataProcessingTelephonBook;
import model.DataProcessingTelephonBookImpl;

import java.util.Scanner;

public class ConsoleWork {
    private String messageExitKeyEN = "exit";
    private String messageExitKeyRU = "выход";
    private String messageConsole = null;
  

    public boolean enterConsoleSurname() {
        messageConsole = null;
        try (Scanner scanner = new Scanner(System.in)) {
            while (!(messageExitKeyEN.equalsIgnoreCase(messageConsole))&&!(messageExitKeyRU.equalsIgnoreCase(messageConsole))) {
                System.out.println("If you want to exit, enter: 'exit' or 'выход' ");
                System.out.println("Введите ФИО (формат: Фамилия И.О.): ");
                messageConsole = scanner.nextLine();

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

}
