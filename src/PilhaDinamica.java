public class PilhaDinamica {
    private No topo;
    private int tamanho;

    public PilhaDinamica() {
        topo = null;
        tamanho = 0;
    }

    public void push(Object item) {
        No novo = new No(item);
        novo.proximo = topo;
        topo = novo;
        tamanho++;
    }

    public Object pop() {
        if (topo != null) {
            No item = topo;
            topo = topo.proximo;
            tamanho--;
            return item.valor;
        }

        return null;
    }

    public Object peek() {
        if (topo != null) {
            return topo.valor;
        }
        return null;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean vazio() {
        if (tamanho == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        No atual = topo;
        String str = "";
        while (atual != null) {
            str =  " " + atual.valor + str;
            atual = atual.proximo;
        }

        return "[" + str + " ]";
    }
}
