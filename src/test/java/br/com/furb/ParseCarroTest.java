package test.java.br.com.furb;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

/**
 *
 * @author marwippel
 */
public class ParseCarroTest {
    
    public String getConteudo(String nomeExemplo) throws IOException{
        Path path = Paths.get(String.format("src\\test\\resources\\%s.txt", nomeExemplo));
        return new String(Files.readAllBytes(path));
    }
    
    @Test
    public void exemplo01() throws IOException {
        String conteudo = getConteudo("exemplo1");
    }
    
    @Test
    public void exemplo02() throws IOException {
        String conteudo = getConteudo("exemplo2");
    }
    
    @Test
    public void exemplo03() throws IOException {
        String conteudo = getConteudo("exemplo3");
    }
    
    @Test
    public void exemplo04() throws IOException {
        String conteudo = getConteudo("exemplo4");
    }
    
    @Test
    public void exemplo05() throws IOException {
        String conteudo = getConteudo("exemplo5");
    }
    
    @Test
    public void exemplo06() throws IOException {
        String conteudo = getConteudo("exemplo6");
    }
    
    @Test
    public void exemplo07() throws IOException {
        String conteudo = getConteudo("exemplo7");
    }

    
    
}
