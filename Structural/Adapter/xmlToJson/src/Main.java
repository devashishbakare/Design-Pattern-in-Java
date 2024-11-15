public class Main {
    public static void main(String[] args) {

        XmlData xmlData = new XmlData();
        JsonDataClient client = new JsonAdaptor(xmlData);
        String jsonData = client.getJsonData();
        System.out.println(jsonData);

    }
}