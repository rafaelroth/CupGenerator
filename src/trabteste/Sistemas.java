/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabteste;

import java.util.ArrayList;

/**
 *
 * @author solange
 */




/*Temos de ver se queremos usar uma classe com os 3 métodos que representam os
tipos de tabela a ser criada(mataMta, suiço, grupos) ou se queremos implementar
os metodos diretamente no ActionPerformed do botão*/
public class Sistemas {

    /**
     *
     * @param Participantes
     */
    public ArrayList<String> Participantes;
    public Sistemas(ArrayList<String> Participantes){
        this.Participantes = Participantes;
    }
    public void mataMata() {
        int nAleatorio = Participantes.size() / 2;
        System.out.println("" + Participantes.get(nAleatorio));
        Participantes.remove(nAleatorio);
        for (int i = Participantes.size(); i > 0; i--) {
            System.out.println("" + Participantes.get(i));
        }

    }


}
