/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author 20132934
 */
public class PontosTuristicos {
    private String cidade;
    private String estado;
    private String rua;
    private int numero;
    private String bairro;
    
    public PontosTuristicos(){
        cidade = "";
        estado = "";               
        rua = "";
        numero = 0;
        bairro = "";   
    }
    
    //Get's
    public String getCidade(){
        return cidade;
    }
    public String getEstado(){
        return estado;
    }
    public String getRua(){
        return rua;
    }
    public int getNumero(){
        return numero;
    }
    public String getBairro(){
        return bairro;
    }    
    
    //Set's
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setRua(String rua){
        this.rua = rua;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
                
    
}
