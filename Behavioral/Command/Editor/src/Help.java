public class Help implements Command{

    public Editor editor;
    public String fileName;
    public Help(Editor editor, String fileName){
        this.editor = editor;
        this.fileName = fileName;
    }
    @Override
    public void execute() {
        editor.helpDocument(fileName);
    }
}