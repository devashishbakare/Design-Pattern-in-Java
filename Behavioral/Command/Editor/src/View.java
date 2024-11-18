public class View implements Command{

    public Editor editor;
    public String fileName;
    public View(Editor editor, String fileName){
        this.editor = editor;
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        editor.viewDocument(fileName);
    }
}

