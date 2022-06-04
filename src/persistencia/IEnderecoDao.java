/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;
import modelos.Endereco;
import java.util.ArrayList;

/**
 *
 * @author Java
 */
public interface IEnderecoDao {
    void incluir(Endereco objeto) throws Exception;
    void alterar(Endereco  objeto) throws Exception;
    void consultar(Endereco objeto) throws Exception;
    Endereco  consultar (int id) throws Exception;
    void excluir (int id) throws Exception;
    ArrayList<Endereco > obterClientes() throws Exception;
    
}
