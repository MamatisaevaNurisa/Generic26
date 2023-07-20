public class Main {
    public static void main(String[] args) {

      GenericClass<String,Integer> string = new GenericClass<>("Timur",23);
        System.out.println(string);

//        GenericClass<Integer> integer = new GenericClass<>(123);
//        System.out.println(integer);

        method("Nurisa",22);
    }

    public static <A,T> void method(A value,T name{
        System.out.println(value);
        //return value;
    }
}