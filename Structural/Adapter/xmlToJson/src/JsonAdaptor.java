
public class JsonAdaptor implements JsonDataClient {

    XmlData xmlData;

    public JsonAdaptor(XmlData xmlData){
        this.xmlData = xmlData;
    }

    @Override
    public String getJsonData(){
        String xml = xmlData.getXMLData();
        String xmlToJson = "This is json data after conversion";
        return xmlToJson;
    }

}
