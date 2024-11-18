public class Editor {

    public String fileName = new String();

    public void viewDocument(String fileName){
        System.out.println("Here is your document for view " + fileName);
    }

    public void editDocument(String updatedText){
        fileName = new String(updatedText);
        System.out.println("Here is your edited document " + fileName);
    }

    public void helpDocument(String fileName){
        System.out.println("Help requested for fileName " + fileName);
    }

}
