public class Edit implements Command{

    public Editor editor;
    public String fileName;
    public Edit(Editor editor, String fileName){
        this.editor = editor;
        this.fileName = fileName;
    }
    @Override
    public void execute() {
        editor.editDocument(fileName);
    }
}
