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
public class Casashow {
    private String nomeShow;
    private String horainicio;
    private String diafechamento;
    private String descricao;
    
    public Casashow(){
        horainicio = "";
        diafechamento = "";
        descricao = "";
    }
    //Get's
    public String getNomeShow(){
        return nomeShow;
    }
    public String getHorainicio(){
        return horainicio;
    }
    public String getDiafechamento(){
        return diafechamento;
    }
    public String getDescricao(){
        return descricao;
    }
    //Set's
    public void getNomeShow(String nomeShow){
        this.nomeShow = nomeShow;
    }
    public void setHorainicio(String horainicio){
        this.horainicio = horainicio;
    }
    public void setDiafechamento(String diafechamento){
        this.diafechamento = diafechamento;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
