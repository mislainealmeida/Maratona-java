package academy.devdojo.maratonajava.BorientacaoObjetos.Rexcecoes.exception.teste;

import java.io.File;
import java.io.IOException;

public class Aula30ExceptionTeste02 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    private static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado= file.createNewFile();
            System.out.println("Arquivo criado "+isCriado);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
