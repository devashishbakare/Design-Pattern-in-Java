package Pattern;

class Main {
    public static void main(String args[]){
        Singleton singleton = Singleton.createInstance();
        System.out.println("this is instance" + singleton);
    }
}