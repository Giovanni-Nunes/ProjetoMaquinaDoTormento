
package modelos;

public class Pessoa {
    // Atributo
    private int id;
    private Endereco endereco = null;
    private String email = "";
    private String telefone= "";

    public Pessoa() {
    }

    public Pessoa(int id, Endereco endereco, String email, String telefone) {
        this.id = id;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



    @Override
    public String toString() {
        return id +";"
                +endereco + ";"
                + email + ";" 
                + telefone ;
    }
    
    
    
    
    
    
}
