/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabteste;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author guilu
 */
public class Sorteio {

    public void Sortear() {
        ArrayList<String> ParticipantesASeremSorteados = new ArrayList();
        for (int i = 0; i < Tela2.Participantes.size(); i++) {
            ParticipantesASeremSorteados.add(Tela2.Participantes.get(i));
        }
        Tela2.Participantes.clear();

        for (int a = ParticipantesASeremSorteados.size(); a > 0; a--) {
            Random gerador = new Random();
            int numeroAleatorio = gerador.nextInt(ParticipantesASeremSorteados.size());
            Tela2.Participantes.add(ParticipantesASeremSorteados.get(numeroAleatorio));
            ParticipantesASeremSorteados.remove(numeroAleatorio);
        }

    }

}
