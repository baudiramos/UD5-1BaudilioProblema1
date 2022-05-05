import java.util.Arrays;

public class ColasUtils<T> {

    private float numeros;
    private Object data[];
    private int cantidadValores = 0;

    public ColasUtils(int initialCapacity) {
        data = new Object[initialCapacity];
    }

    public Object getElement(int i) {
        return data[i];
    }

    public int length() {
        return cantidadValores;
    }

    public void insert(Object element, int i) {

        if (cantidadValores == data.length) {
            Object []aux = data;
            data = new Object[data.length * 2];

            for(int j = 0; j < cantidadValores; j++) {
                data[j] = aux[j];
            }

            aux = null;
        }

        for (int j = cantidadValores - 1; j >= i; j--) {
            data[j + 1] = data[j];
        }

        data[i] = element;
        cantidadValores++;
    }

    public void add(T element) {
        insert(element, cantidadValores);
    }

    public void enqueue (T element) {
        add(element);
    }

    public T delete (int i) {
        Object aux = data[i];
        for (int j = 0; j < cantidadValores; j++) {
            data[j] = data[j + 1];
        }
        cantidadValores--;
        return (T) aux;
    }

    public T  dequeue () {
        return (T)  delete(0);
    }

    public float sumarValores() {
        float suma = 0;
        for (int i = 0; i < cantidadValores; i++) {
            suma += (float) data[i];
        }
        return suma;
    }

    @Override
    public String toString() {
        String output = "";
        output += "\nSuma de valores del Array: " + sumarValores();

        return output;
    }
}
