/*
 * 
 * 
 */
package persistencia;
import modelos.PessoaFisica;
import java.util.ArrayList;
/**
 *
 * @author Giovanni Nunes
 */
public interface IPessoaFisicaDao {
    //
    void incluir(PessoaFisica objeto) throws Exception;
    void alterar(PessoaFisica objeto) throws Exception;
    void consultar(PessoaFisica objeto) throws Exception;
    PessoaFisica consultar (int id) throws Exception;
    void excluir (int id) throws Exception;
    ArrayList<PessoaFisica> obterClientes() throws Exception;
    
    
}
