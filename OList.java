package queuetest;

public class OList<T> {

    @SuppressWarnings("hiding")
    class ListItem<T> {

        T _item;
        ListItem<T> _next;

        ListItem(T item) {
            _item = item;
            _next = null;
        }

        T get() {
            return _item;
        }

        void setNext(ListItem<T> item) {
            _next = item;
        }

        ListItem<T> getNext() {
            return _next;
        }

    }

    ListItem<T> _head;
    ListItem<T> _tail;

    OList() {
        _head = null;
        _tail = null;
    }

    ListItem<T> head() {
        return _head;
    }

    void add(T item) {
        ListItem<T> li = new ListItem<T>(item);
        if (_head == null) {
            _head = li;
            _tail = li;
        } else {
            _tail.setNext(li);
            _tail = li;
        }
        numList++;
    }

/////////////////////////////////////////////////////////////////
    private int numList = 0; // число записей в списке

    int size() {  // вывод размера списка
        return numList;
    }

    T get(int r) {   // вывод элемента списка
        T res;
        if (r <= 0 || r > numList) {
            res = null;
        } else {
            ListItem<T> current = _head;
            int currentIndex = 1;
            while (currentIndex != r) {
                current = current.getNext();
                currentIndex++;
            }
            res = current.get();
        }
//            System.out.println(res);
        return res;

    }

    void deleteLast() {   //  удаление последнего элемента списка
        String res;
        if (numList <= 0) {
            res = "List size is null";
        } else {
            ListItem<T> current = _head;
            int currentIndex = 1;
            while (currentIndex != numList) {
                current = current.getNext();
                currentIndex++;
            }
            res = String.valueOf(current.get());
            _tail = current;
            current._next = null;
            numList--;
        }
//            System.out.println("delete last element: " + res);    
    }

    void addFirst(T item) {  //  добавление элемента в начало списка
        ListItem<T> first = new ListItem<T>(item);
        if (_head == null) {
            _head = first;
            _tail = first;
        } else {
            first.setNext(_head);
            _head = first;
        }
        numList++;
    }

}
