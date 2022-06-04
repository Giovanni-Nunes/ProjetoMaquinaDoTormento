/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import enumerations.TipoLogradouro;
import enumerations.TipoEstado;
/**
 *
 * @author Java
 */
public class Endereco {
    private int id = 0;
    private String rua = "";
    private int numero = 0;
    private String complemento = "";
    private String bairro = "";
    private String cidade= "";
    private TipoEstado tipoE;
    private String CEP = "";
    private int apartemento = 0;
    private TipoLogradouro tipo;
    private int proprietario = 0;
    
    public Endereco(){
        
    }
    
    public Endereco(int id,
            String rua,
            int numero,
            String complemento,
            String bairro,
            String cidade,
            TipoEstado tipoE,
            String CEP,
            int apartamento,
            TipoLogradouro tipo,
            int proprietário){
        this.id = id;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.tipoE = tipoE;
        this.CEP = CEP;
        this.apartemento = apartamento;
        this.tipo = tipo;
        this.proprietario = proprietario;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public TipoEstado getTipoE() {
        return tipoE;
    }

    public void setTipoE(TipoEstado tipoE) {
        this.tipoE = tipoE;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public int getApartemento() {
        return apartemento;
    }

    public void setApartemento(int apartemento) {
        this.apartemento = apartemento;
    }

    public TipoLogradouro getTipo() {
        return tipo;
    }

    public void setTipo(TipoLogradouro tipo) {
        this.tipo = tipo;
    }

    public int getProprietario() {
        return proprietario;
    }

    public void setProprietario(int proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return id + ";" 
               + rua + ";" 
               + numero + ";"
               + complemento + ";"
               + bairro + ";"
               + cidade + ";"
               + tipoE + ";"
               + CEP + ";"
               + apartemento + ";"
               + tipo + ";"
               + proprietario;
    }
    
    
    
}

    
    
    
    
    
    
    
    
    
    