/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import enumerations.TipoEstado;
import java.util.ArrayList;
import modelos.Endereco;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import enumerations.TipoLogradouro;

/**
 *
 * @author Java
 */
public class EnderecoDao implements IEnderecoDao {
    
    
    private String nomeDoArquivoNoDisco = "Cliente.txt";
    
    @Override
    public void incluir(Endereco objeto) throws Exception {
        try{
            int id = GeradorIdentificador.getId();
            objeto.setId(id);
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco,true);
            //Cria o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            //Escrever no arquivo
            bw.write(objeto.toString() + "\n");
            //Fechao arquivo
            bw.close();
        }catch(Exception erro){
            throw erro;
        }        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alterar(Endereco objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consultar(Endereco objeto) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Endereco consultar(int id) throws Exception {
                try {
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha ="";
            
            while((linha = br.readLine())!= null){
                Endereco objetoEndereco = new Endereco();
                
                String vetorString[] = linha.split(";");
                
                if(vetorString.length != 5) throw  new Exception("Faltam dados na String");
                
                objetoEndereco.setId(Integer.parseInt(vetorString[0]));
                
                objetoEndereco.setRua(vetorString[1]);
                
                objetoEndereco.setNumero(Integer.parseInt(vetorString[2]));
                
                objetoEndereco.setComplemento(vetorString[3]);
                
                objetoEndereco.setBairro(vetorString[4]);
                
                objetoEndereco.setCidade(vetorString[5]);
                objetoEndereco.setTipoE(TipoEstado.valueOf(TipoEstado.class,vetorString[6]));
                objetoEndereco.setCEP(vetorString[7]);
                objetoEndereco.setApartemento(Integer.parseInt(vetorString[8]));
                objetoEndereco.setTipo(TipoLogradouro.valueOf(vetorString[9]));
                objetoEndereco.setProprietario(Integer.parseInt(vetorString[10]));
                
                
                if(objetoEndereco.getId()== id){
                    br.close();
                    return objetoEndereco;
                }
            
            }
            br.close();
            throw new Exception("ID NÃO EXISTE");
        } catch (Exception erro) {
            throw erro;
        }
        

        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluir(int id) throws Exception {
        try {
            ArrayList<Endereco> listaDeEndereco = null;
            listaDeEndereco = obterClientes();
                        
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            //Cria o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int pos = 0; pos < listaDeEndereco.size(); pos++){
                if(listaDeEndereco.get(pos).getId() != id){
                    bw.write(listaDeEndereco.get(pos).toString() +"\n");
                }
            }
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }

        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Endereco> obterClientes() throws Exception {
        try {
            ArrayList<Endereco> listaDeClientes = new ArrayList<Endereco>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha=br.readLine())!=null){
                Endereco objetoEndereco = new Endereco();
                String vetorString[] = linha.split(";");
                if(vetorString.length != 5) throw new Exception("Faltam dados na String");
                
                objetoEndereco.setId(Integer.parseInt(vetorString[0]));
                
                objetoEndereco.setRua(vetorString[1]);
                
                objetoEndereco.setNumero(Integer.parseInt(vetorString[2]));
                
                objetoEndereco.setComplemento(vetorString[3]);
                
                objetoEndereco.setBairro(vetorString[4]);
                
                objetoEndereco.setCidade(vetorString[5]);
                objetoEndereco.setTipoE(TipoEstado.valueOf(TipoEstado.class,vetorString[6]));
                objetoEndereco.setCEP(vetorString[7]);
                objetoEndereco.setApartemento(Integer.parseInt(vetorString[8]));
                objetoEndereco.setTipo(TipoLogradouro.valueOf(vetorString[9]));
                objetoEndereco.setProprietario(Integer.parseInt(vetorString[10]));              
                
            }
            br.close();
            return listaDeClientes;           
        } catch (Exception erro) {
            throw erro;
        }
        
        
        
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    
}
