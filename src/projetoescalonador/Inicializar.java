package projetoescalonador;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 *
 * @author Danilo, Guilherme e Gustavo
 */
public class Inicializar {

    Scanner input = new Scanner(System.in);
    ArrayList<Processo> processos = new ArrayList<>(); //Lista que recebe e ordena os processos
    Lista auxiliar = new Lista();
    Lista listaProcessos = new Lista(auxiliar);     //Lista dos processos e ordenados por chegada
    String chegada, duracao, prioridade, str;
    int cont = 1, io[];
    char opc = 'n', opcIo = 'n';

    public void entradaDeProcessos() {
        System.out.println("--------------------------------------------------");
        System.out.println("|           ESCALONADOR DE PROCESSOS             |");
        System.out.println("--------------------------------------------------");
        construcaoProcesso();
        Collections.sort(processos);

        processos.forEach((processo) -> {
            listaProcessos.add(processo);
            listaProcessos.addAuxiliar(processo);
        });
        //processos.forEach((processo) -> {
        //  processo.imprimir();
        //});
        //  prioridadePreemptivo(listaProcessos);

        listaProcessos.roundRobin(4);
    }

    public void construcaoProcesso() {
        do {
//            System.out.println("\n<       Adicionar processo      >");
//            System.out.println("Informe os DADOS do " + this.cont + "° processo.");
//            System.out.println("Informe chegada, duração e prioridade: ");
//            chegada = input.nextLine();
//            duracao = input.nextLine();
//            prioridade = input.nextLine();
//            System.out.print("Chegada: ");
//            chegada = input.nextLine();
//            System.out.print("Duração: ");
//            duracao = input.nextLine();
//            System.out.print("Prioridade: ");
//            prioridade = input.nextLine();

//            do {
//                do { //Verifica se possui I/O
//                    System.out.print("Processo possui I/O? [s/n]: ");
//                    opcIo = input.nextLine().charAt(0);
//                    opcIo = Character.toLowerCase(opcIo);
//                    if (opcIo != 's' && opcIo != 'n') {
//                        System.err.println("Formato inválido!");
//                    }
            //} while (opcIo != 's' && opcIo != 'n');
            //if (opcIo == 's') { //Entrada do I/O caso exista
            //do {
            //System.out.print("I/O - (Ex: 2, 4, 3): ");
            //str = input.nextLine();
            //String vetString[] = str.split(",");
            //io = new int[vetString.length];
            //for (int i = 0; i < io.length; i++) {
            //  io[i] = Integer.parseInt(vetString[i]);
            //}
            // if (compareHealingAndIo(Integer.parseInt(duracao), io)) {
            //      System.err.println("O tempo que o processo fara I/O deve ser menor que o tempo de duração do processo!");
            //    }
            //  } while (compareHealingAndIo(Integer.parseInt(duracao), io));
            //    opcIo = 'n';
            //  }
            //} while (opcIo == 's');
            //processos.add(new Processo(cont, Integer.parseInt(chegada), Integer.parseInt(duracao), Integer.parseInt(prioridade), io));
            processos.add(new Processo(cont, 0, 5, 3, null));
            processos.add(new Processo(cont, 3, 3, 2, null));
            processos.add(new Processo(cont, 13, 9, 5, null));
            processos.add(new Processo(cont, 5, 6, 6, null));
            cont++;

//            do {
//                System.out.print("Deseja adicionar outro processo? [s/n]: ");
//                opc = input.nextLine().charAt(0);
//                opc = Character.toLowerCase(opc);
//                if (opc != 's' && opc != 'n') {
//                    System.err.println("Formato inválido!");
//                }
//            } while (opc != 's' && opc != 'n');
//
        } while (cont == 6);
    }

}
