package projetoescalonador;

/**
 *
 * @author Guilherme And Danilo
 */
public class ListaDinamica {

    public No inicio;
    public No fim;
    public int quantidade;

    public ListaDinamica() {
        this.inicio = this.fim = null;
        this.quantidade = 0;
    }

    public int size() {
        return quantidade;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean add(Processo novoProc, int posicao) {
        if (posicao > size() || posicao < 0) {
            return false;
        }
        No novoNo = new No(novoProc);
        if (posicao == 0 && isEmpty()) {
            this.inicio = fim = novoNo;
        } else {
            if (posicao == 0) {
                novoNo.proximo = this.inicio;
                this.inicio.proximo = novoNo;
            } else {
                if (posicao == size()) {
                    this.fim.proximo = novoNo;
                    this.fim = novoNo;
                } else {
                    int contador = 0;
                    No temporario = this.inicio;
                    while (contador < posicao - 1) {
                        temporario = temporario.proximo;
                        contador++;
                    }
                    novoNo.proximo = temporario.proximo;
                    temporario.proximo = novoNo;
                }
            }
        }
        quantidade++;
        return true;
    }
    
    public void add(Processo novoProc) {
        No novoNo = new No(novoProc);
        if (isEmpty()) {
            this.inicio = this.fim = novoNo;
        } else {
            this.fim.proximo = novoNo;
            this.fim = novoNo;
        }
        quantidade++;
    }
    
    public String imprimir() {
        StringBuilder valores = new StringBuilder();
        valores.append('(');
        No auxiliar = inicio;
        while (auxiliar != null) {
            valores.append(auxiliar.processo.id);
            if (auxiliar != fim) {
                valores.append(", ");
            }
            auxiliar = auxiliar.proximo;

        }
        valores.append(")");
        return valores.toString();
    }

}