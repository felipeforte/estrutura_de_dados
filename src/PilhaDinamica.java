public class PilhaDinamica {
    private No topo;

    public PilhaDinamica() {
        topo = null;
    }

    public void push(Object item) {
        No novo = new No(item);
        novo.proximo = topo;
        topo = novo;
    }

    public Object pop() {
        if (topo != null) {
            No item = topo;
            topo = topo.proximo;
            return item.valor;
        }

        return null;
    }

    public Object peek() {
        return topo.valor;
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
