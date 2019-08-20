/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto09classecliente;

/**
 *
 * @author Willian
 */
public class Cliente {
    //ATRIBUTOS que podem ser Private ou Public (Modificador)
    // Por definiçao no java os atributos serao PRIVATE
    private String RG;
    private String nome;
    private String CPF;
    private String cidade;
    private String estado;
    
    //METODOS podem ser Public ou Private (modificador)
    //Por definiçao do Java os metodos serao Public
    
    //CONSTRUTORES
    
    //CHEIO
    public Cliente(String RG, String nome, String CPF, String cidade, String estado){
        this.RG = RG;
        this.nome = nome;
        this.CPF = CPF;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    //VAZIO
    public Cliente(){
        
    }
    
    //GETTERS E SETTERS
    public String getRG(){
        return this.RG;
    }
    
    public void setRG(String RG){
        this.RG = RG;
    }
    
        public String getnome(){
        return this.nome;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public String getCPF(){
        return this.CPF;
    }
    
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    
    public String getcidade(){
        return this.cidade;
    }
    
    public void setcidade(String cidade){
        this.cidade = cidade;
    }
    
            public String getestado(){
        return this.estado;
    }
    
    public void setestado(String estado){
        this.estado = estado;
    }
}
