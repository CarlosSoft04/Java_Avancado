package Estrutura_De_Dados;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {

        /**
         * Imprime o valor de acordo com a chave do mapa e nao segue ordem de inserção.
         * Utliza o chamado hashing para calcular indice onde os dados sao armazenados permitindo acesso rapido aos elementos
         *
         * Vantagens -> Rapido desempenho em operaces basicas, flexibilidade
         * Desvantagens -> Nao é Thread-Safe, ou seja,nao eh seguro em ambientes multithread sem sincronizacao externa. Para uso em concorrentes use
         * ConcurrentHashMap
         */

        //Criando um hashmap para armazenar as matriculas e nome dos alunos
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(300, "Pedro");
        mapa.put(100, "Carlos");
        mapa.put(200, "Joao");
        //Ao imrpimrir repare que ele exibe conforme a chave do mapa.e nao conforme a ordem de insercao
        System.out.println(mapa);

        //Para percorrer o mapa e imprimir a lista
        for(Map.Entry<Integer, String> entrada : mapa.entrySet()){
            int matricula = entrada.getKey();
            String nome = entrada.getValue();
            System.out.println("Aluno: " + nome + " matricula: " + matricula);

        }

        //Agora para saber se algum aluno esta presenta no mapa
        int matricula = 101;
        if(mapa.containsKey(matricula)){
            String nome = mapa.get(matricula);
            System.out.println("Matricula: " + matricula + " encontrada!" + "pertence ao aluno: " + nome);

        }else{
            System.out.println("Matricula nao encontrada");
        }

        //removendo aluno do mapa
        mapa.remove(103);
        System.out.println("Mapa apos remocao: " + mapa);


        //esvaziar o mapa
        mapa.clear();
        System.out.println("mapa vazio=  " + mapa);
    }


}
