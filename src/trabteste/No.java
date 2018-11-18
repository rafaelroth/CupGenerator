/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabteste;

/**
 *
 * @author guilu
 */
public class No<Tipo> {

    private Tipo conteudo;
    private No anterior;

    public Tipo getConteudo() {
        return conteudo;
    }

    public void setConteudo(Tipo conteudo) {
        this.conteudo = conteudo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

}
