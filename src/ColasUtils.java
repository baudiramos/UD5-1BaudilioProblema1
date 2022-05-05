public class ColasUtils<T> {

    private float numeros;
    private Object data[];
    private int numeroValores;

    public void insert(T element, int i) {

        if (numeroValores == data.length) {
            Object []aux = data;
            data = new Object[data.length * 2];

            for(int j = 0; j < numeroValores; j++) {
                data[j] = aux[j];
            }

            aux = null;
        }

        for (int j = numeroValores - 1; j >= i; j--) {
            data[j + 1] = data[j];
        }

        data[i] = element;
        numeroValores++;
    }

    public void add(T element) {
        insert(element, numeroValores);
    }

    public void enqueue (T element) {
        add(element);
    }

    public T delete (int i) {
        Object aux = data[i];
        for (int j = 0; j < numeroValores; j++) {
            data[j] = data[j + 1];
        }
        numeroValores--;
        return (T) aux;
    }

    public T  dequeue () {
        return (T)  delete(0);
    }

}
