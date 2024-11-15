public class Computer {

    //base model computer
    private int ram;
    private String processor;

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", processor='" + processor + '\'' +
                ", graphicsCard=" + graphicsCard +
                ", storageSize=" + storageSize +
                '}';
    }

    //optional customization
    private boolean graphicsCard;
    private int storageSize;

    private Computer(ComputerBuilder customizationDetails){
        this.ram = customizationDetails.ram;
        this.processor = customizationDetails.processor;
        this.graphicsCard = customizationDetails.graphicsCard;
        this.storageSize = customizationDetails.storageSize;
    }

    static class ComputerBuilder{

        //base computer
        public int ram;
        public String processor;

        //optional customization
        public boolean graphicsCard = false;
        public int storageSize = 256;

        public ComputerBuilder(int ram, String processor){
            this.ram = ram;
            this.processor = processor;
        }

        public ComputerBuilder setStorageSize(int storageSize) {
            this.storageSize = storageSize;
            return this;
        }

        public ComputerBuilder setGraphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }

}
