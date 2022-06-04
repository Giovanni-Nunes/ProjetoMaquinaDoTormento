
package modelos;

public class Colaborador {
    private String funcao;

    public Colaborador(String funcao) {
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return super.toString() +";"+ funcao;
    }
    
    

    
}
