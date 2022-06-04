/*
 * Gera o código identificador do Cliente pessoa física
 * 
 */
package persistencia;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @Giovanni Nunes
 */
public class GeradorIdentificador {
    public static int getId()throws FileNotFoundException, IOException{
        String nomeDoArquivo = "idGerado.txt";
        FileReader fr = new FileReader(nomeDoArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha = br.readLine();
        int id = Integer.parseInt(linha);
        br.close();
        id++;
        //cria o arquivo
        FileWriter fw = new FileWriter(nomeDoArquivo,false);
        //cria o buffer do arquivo
        BufferedWriter bw = new BufferedWriter(fw);
        //escreve no arquivo
        String saida = id+"";
        bw.write(saida);
        //fecha o arquivo
        bw.close();
        return id;
        
    } 
    
    
}
