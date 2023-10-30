public class PilhaEstatica {
    private Object[] v;
    private int tamanho;

    public PilhaEstatica() {
        v = new Object[10];
        tamanho = 0;
    }
    public void push(Object objeto) {
        if (tamanho<v.length) {
            v[tamanho] = objeto;
            tamanho++;
        } else {
            Object[] aux = new Object[v.length*2];
            for (int i=0;i<v.length;i++) {
                aux[i] = v[i];
            }
            v = aux;
            v[tamanho] = objeto;
            tamanho++;
        }
    }

    public Object pop() {
        if (tamanho == 0 || v[tamanho-1] == null) {
            return null;
        }
        Object item = v[tamanho-1];
        v[tamanho-1] = null;
        tamanho--;
        return item;
    }

    public Object peek() {
        if (tamanho == 0 || v[tamanho-1] == null) {
            return null;
        }
        return v[tamanho-1];
    }

    public boolean vazia() {
        if (tamanho == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String str = "[ ";
        for (int i=0;i<tamanho;i++) {
            str += v[i] + " ";
        }
        return str + "]";
    }
}
