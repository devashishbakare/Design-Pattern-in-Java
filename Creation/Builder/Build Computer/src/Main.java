public class Main {
    public static void main(String[] args) {
        //base computer
        Computer baseComputer = new Computer.ComputerBuilder(16, "intel i7").build();
        System.out.println(baseComputer.toString());

        //customization of computer
        Computer customizedComputer = new Computer.ComputerBuilder(16, "Macbook M2").setStorageSize(1024).setGraphicsCard(true).build();
        System.out.println(customizedComputer.toString());
    }
}