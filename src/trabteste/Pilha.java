/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabteste;

/**
 *
 * @author guilu
 * @param <T>
 */
public class Pilha<T> {

    public No<T> topo;

    public void empilhar(T valor) {
        No<T> novoTopo = new No<>();
        novoTopo.setConteudo(valor);
        novoTopo.setAnterior(topo);
        this.topo = novoTopo;
    }

    public boolean vazia() {
        return this.topo == null;
    }

    public T desempilhar() throws PilhaVaziaException {
        if (this.vazia()) {
            throw new PilhaVaziaException();
        }
        T valor = this.topo.getConteudo();
        this.topo = this.topo.getAnterior();
        return valor;
    }
}
