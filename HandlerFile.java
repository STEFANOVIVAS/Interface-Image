import java.io.File;

public class HandlerFile {

    private FileOrchestrator fileOrchestrator;

    public HandlerFile(FileOrchestrator fileOrchestrator) {
        this.fileOrchestrator = fileOrchestrator;
    }


    public void saveImageWithDirectory(MFile mFile){
        fileOrchestrator.saveImageFile(mFile.getDirectory(),mFile.getContent(), mFile.getNameFile());
    }

    public void createADirectory(MFile mfile){
        fileOrchestrator.createAFolder(mfile.getDirectory());
    }


}
