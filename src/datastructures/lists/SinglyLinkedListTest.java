package datastructures.lists;

public class SinglyLinkedListTest {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        // Teste 1: lista vazia
        System.out.println("Size (esperado 0): " + list.size());

        // Teste 2: add
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Size (esperado 3): " + list.size());

        // Teste 3: removeFirst
        list.removeFirst();
        System.out.println("Size após removeFirst (esperado 2): " + list.size());

        // Teste 4: removeLast
        list.removeLast();
        System.out.println("Size após removeLast (esperado 1): " + list.size());

        // Teste 5: removeLast novamente (lista com 1 elemento)
        list.removeLast();
        System.out.println("Size após removeLast (esperado 0): " + list.size());

        // Teste 6: remover em lista vazia (não deve quebrar)
        list.removeLast();
        list.removeFirst();
        System.out.println("Size final (esperado 0): " + list.size());
    }
}