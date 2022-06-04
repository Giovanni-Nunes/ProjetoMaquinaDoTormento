/*
 * MAQUINA DO TORMENTO
 * 
 */
package modelos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PessoaFisica extends Pessoa {
    
    //Atributos
    private Date dataCadastroPessoa;
    private Date dataNascimento;
    private String CPF;
    private String nomePessoa;

    public PessoaFisica() {
    }
    
    public PessoaFisica(int id, Date dataCadastroPessoa, Date dataNascimento, String CPF, String nomePessoa, Endereco endereco, String email, String telefone) {
        super(id, endereco, email, telefone);
        this.dataCadastroPessoa = dataCadastroPessoa;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
        this.nomePessoa = nomePessoa;
    }

    

    public Date getDataCadastroPessoa() {
        return dataCadastroPessoa;
    }

    public void setDataCadastroPessoa(Date dataCadastroPessoa) {
        this.dataCadastroPessoa = dataCadastroPessoa;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    @Override
    public String toString() {
        return  new SimpleDateFormat("dd/MM/yyyy").format(dataCadastroPessoa) + ";" 
                + new SimpleDateFormat("dd/MM/yyyy").format(dataNascimento) + ";" 
                + CPF + ";" 
                + nomePessoa + super.toString()+ ";";
    }
    
    
    
    
}

  