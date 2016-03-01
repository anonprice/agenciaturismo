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
public class Fundador {
    private String nome;
    private String datanasci;
    private String datamorte;
    private String nacionalidade;
    
    public Fundador(){
        nome = "";
        datanasci = "";
        datamorte = "";
        nacionalidade = "";
    }
    //Get
    public String getNome(){
        return nome;
        
    }
    public String getDatanasci(){
        return datanasci;
    }
    public String getDatamorte(){
        return datamorte;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    //Set
    public void setNome(String nome){
        this.nome = nome;
    
    public void setDatanasci(String datanasci){
        this.datanasci = datanasci;
    }
}
