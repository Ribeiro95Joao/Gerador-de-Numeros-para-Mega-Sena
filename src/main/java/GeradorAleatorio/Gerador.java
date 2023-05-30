package GeradorAleatorio;
import java.util.*;

public class Gerador {
    Integer[] numerosSorteados = new Integer[6];
    public Gerador(){
        ArrayList<Integer>numerosDisponiveis = new ArrayList<Integer>();
        for(int i = 1; i <= 60; i++){
            numerosDisponiveis.add(i);
                }
        Collections.shuffle(numerosDisponiveis);
        for(int i = 0; i < 6; i++){
            this.numerosSorteados[i] = numerosDisponiveis.get(i);
        }
    }

    public Integer[] getNumerosSorteados() {
        return numerosSorteados;
    }

    public void exibir(){
        Arrays.sort(this.numerosSorteados);
        for(Integer i = 0; i < this.numerosSorteados.length; i++){
            System.out.print(this.numerosSorteados[i] + ", ");
        }
    }
}