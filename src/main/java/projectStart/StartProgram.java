package projectStart;

import view.ConsoleWork;
import view.ConsoleWorkImpl;

public class StartProgram {

    public static void main(String[] args) {
        ConsoleWorkImpl consoleWork = new ConsoleWork();
        consoleWork.enterConsoleSurname();
        System.out.println("You exit program.");
    }
}
