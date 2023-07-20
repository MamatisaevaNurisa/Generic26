public class GenericClass<T,S> {
    private T value;
    private S name;

    public GenericClass(T value,S name) {
        this.value = value;
        this.name = name;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "value=" + value +
                '}';
    }
}
