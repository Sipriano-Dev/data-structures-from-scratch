package datastructures.arrays;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray lista = new DynamicArray();
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        System.out.println("size: " + lista.size());
        System.out.println("Index 1 o Valor é: " + lista.get(1));
        lista.add(10);
        lista.add(11);
        System.out.println("size: " + lista.size());
        System.out.println("Index 5 o Valor é: " + lista.get(5));

        //Apesar de ter esse espaço internamente no array, nosso código
        //usa o size ao invéz do length pra limitar a busca a o size, ou seja, só busca espaço ocupado
        try {
            System.out.println(lista.get(7));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro esperado: índice inválido");
        }


    }

}
