public class ColasUtils<T> {

    private int numeros;
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

    

}
