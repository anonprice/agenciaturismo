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
public class Igreja {
    private String nome;
    private String data;
    private String estilo;
    
    public Igreja(){
        nome = "";
        data = "";
        estilo = "";
    }
    
    
    //Get's
    public String getNome(){
        return nome;
    }
    public String getData(){
        return data;
    }
    public String getEstilo(){
        return estilo;
    }
    //Set's
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setData(String data){
        this.data = data;
    }
    public void setEstilo(String estilo){
        this.estilo = estilo;
    }
}
