/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import visao.TelaLogin;

/**
 *
 * @author Java
 */
public class LoginControler {

    private final TelaLogin view;

    public LoginControler(TelaLogin view) {
        this.view = view;
    }
    
    public void pesquisaSenha(){
        System.out.println("Pesquisa senha e id no bloco txt");
        this.view.exibeMensagem("Executei PesquisaSenha");
    }
    
    
}
