// Алгоритм разворота связного списка: 
// 1. Создаем связный список с n элементами 
// 2. Выполняем цикл n/2 раз, где 'n' - количество элементов в связном списке. 
// 3. В первом проходе меняем местами первый и n-й элементы 
// 4. Во втором проходе меняем местами второй и (n-1)-й элементы и так далее, пока не достигнем середины связного списка. 
// 5. Возвращаем связный список после завершения цикла.

import java.util.*;
 
public class LinkedListReverse {
    public static void main(String[] args)
    {
        // Объявление связанного списка без начального размера
        LinkedList<Integer> linkedli = new LinkedList<Integer>();
 
        // Добавление элементов в конец списка
        linkedli.add(new Integer(1));
        linkedli.add(new Integer(7));
        linkedli.add(new Integer(9));
        linkedli.add(new Integer(15));
        linkedli.add(new Integer(35));
        System.out.print("Элементы связанного списка перед реверсом: " + linkedli);
 
        // Вызов функции для реверса
        linkedli = reverseLinkedList(linkedli);
        System.out.print("\nЭлементы связанного списка после реверса: " + linkedli);
    }
 
    // Принимаем связный список в качестве параметра и возвращает обратный связный список
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist)
    {
        for (int i = 0; i < llist.size() / 2; i++) {
            Integer temp = llist.get(i);
            llist.set(i, llist.get(llist.size() - i - 1));
            llist.set(llist.size() - i - 1, temp);
        }
        return llist;
    }
}