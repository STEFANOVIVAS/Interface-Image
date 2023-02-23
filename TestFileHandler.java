import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class TestFileHandler {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in).useDelimiter("\\n");

        HandlerFile hf= new HandlerFile();
        menuInicial(sc);





    }
    public static void menuInicial(Scanner sc){
        System.out.println("MENU");
        System.out.println("Digite: (1) - Salvar arquivo TXT, (2) - Salvar Imagem, (3) - Deletar arquivo Txt, (4) - Deletar Imagem, (5) Criar diretórios");
        System.out.println("Obs: para as operações (1), (2), (3) e (4) é necessário criar os diretórios iniciais (5)");


        String menu=sc.next();

        switch (menu){
            case ("1") -> menuSalvarArquivoTxt(sc);
            case ("2") -> menuSalvarArquivoImagem(sc);
            case ("3") -> menuCriarDiretorios(sc);
            default -> menuInicial(sc);

        }
    }

    private static void menuCriarDiretorios(Scanner sc) {
        System.out.println("Criar diretórios.");
        System.out.println();
        System.out.println("Você pode criar 4 tipos de diretório");
        System.out.println("(1) - REMINDER");
        System.out.println("(2) - IMPORTANT");
        System.out.println("(3) - SIMPLE");
        System.out.println("(4) - IMAGE");

        String diretorio=sc.next();

        switch (diretorio){
            case ("1") -> criarDiretorio("REMINDER");
            case ("2") -> menuSalvarArquivoImagem(sc);
            case ("3") -> menuCriarDiretorios(sc);
            default -> menuInicial(sc);

        }




    }

    private static void criarDiretorio(String reminder) {

    }

    private static void menuSalvarArquivoTxt(Scanner sc) {
        System.out.println("-------Bem-vindo ao gerenciador de arquivos-------");
        System.out.println("--------------------------------------------------");
        System.out.println("---Escolha o tipo de arquivo que deseja salvar!---");
        System.out.println(" 1) Reminder                  --------------------");
        System.out.println(" 2) Important                 --------------------");
        System.out.println(" 3) Simple                    --------------------");
        System.out.println(" 4) Image                     --------------------");
        System.out.println(" Qualquer outro número retorna ao menu inicial ---");

        String menu=sc.next();

        switch (menu){
            case ("1"),("2"),("3") -> salvarArquivoTxt(sc);
           /* case ("2") -> removerArquivo(sc);
            case ("3") -> listarArquivos(sc);*/
            default -> menuInicial(sc);

        }
    }

    private static void menuSalvarArquivoImagem(Scanner sc) {
        System.out.println("Informe o nome do ");

    }

}
