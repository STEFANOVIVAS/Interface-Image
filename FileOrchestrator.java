import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class FileOrchestrator extends FolderOrchestrator implements ImageFileDatabase,FileDatabase{



    public void saveAllListOfFiles(List<MFile> mFileList){

    }

    public void saveAllListOfImageFiles(List<MFile> mImageFileList){

    }

    @Override
    public void saveImageFile(String directory, String content, String nameFile) {
        BufferedImage image;
        try{
            URL url = new URL(directory);
            image = ImageIO.read(url);

            ImageIO.write(image,"jpeg",
                    new File(directory));
            MFile file=new MFile(content,nameFile,directory,MFileAnnotationTypeEnum.IMAGE);

        }catch(IOException e){
            e.printStackTrace();
        }


    }

    @Override
    public void recoveryImageFile(String directory) {

    }

    @Override
    public void removeImageFile(String directory, String nameFile) {

    }

    @Override
    public void listAllImageFiles(String directory) {

    }

    @Override
    public void saveFile(String directory, String content, MFileAnnotationTypeEnum type, String nameFile) {


    }

    @Override
    public void recoveryFile(String directory, String nameFile) {

    }

    @Override
    public void removeFile(String directory, String nameFile, MFileAnnotationTypeEnum type) {

    }

    @Override
    public void listAllFiles(String directory) {

    }
}
