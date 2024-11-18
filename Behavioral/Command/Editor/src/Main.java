public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Command view = new View(editor, "Tax Report 2024");
        Command edit = new Edit(editor, "Tax Report 2025");
        Command help = new Help(editor, "Tex Report 2024");

        CommandExecuter commandExecuter = new CommandExecuter();
        commandExecuter.executeCommand(view);
        commandExecuter.executeCommand(edit);
        commandExecuter.executeCommand(help);

    }
}