public class Main {
    public static void main(String[] args) {

        CustomerCare level1 = new Level_1_Support();
        CustomerCare level2 = new Level_2_Support();
        CustomerCare manager = new Manager();

        level1.setNextHandler(level2);
        level2.setNextHandler(manager);

        level1.handleRequest("Basic");
        level1.handleRequest("Advance");
        level1.handleRequest("Unknown");

    }
}