package queuetest;

public class PQueue<T> {

    private DArray<OList<T>> _pqueue;
    private int numPriority = 0;

    PQueue() {
        _pqueue = new DArray<OList<T>>();
        OList<T> listEmpty = new OList<T>();
        _pqueue.add(0, listEmpty);
    }

    PQueue(int size) {
        numPriority = size;
        _pqueue = new DArray<OList<T>>();
        for (int i = 0; i <= numPriority; i++) {
            OList<T> listEmpty = new OList<T>();
            _pqueue.add(i, listEmpty);
        }
    }

    int size() {
        return _pqueue.size();
    }

    void enqueue(int priority, T item) {
        if (priority <= 0) {
            System.out.println("Priority '< =' 0");
        } else {

            if (priority >= _pqueue.size()) {
                numPriority = _pqueue.size();
                for (int i = numPriority; i <= priority; i++) {
                    OList<T> listEmpty = new OList<T>();
                    _pqueue.add(i, listEmpty);
                }
            }
            OList<T> x = _pqueue.get(priority);
            x.addFirst(item);
//                System.out.println("enqueue: " + item);
        }
        numPriority = _pqueue.size() - 1;
//        System.out.println("--- size: " + (_pqueue.size()-1));
    }

    T dequeue() {
        T res;
        int lastPriority = 0;
        for (int i = numPriority; i >= 1; i--) {
            OList<T> x = _pqueue.get(i);
            if (x.size() > 0) {
                lastPriority = i;
                break;
            }
        }
        if (lastPriority != 0) {
            OList<T> x = _pqueue.get(lastPriority);
            int last = x.size();
            res = x.get(last);
            x.deleteLast();
        } else {
//            System.out.println("Queue is Empty");
            res = null;
        }
//        System.out.println("dequeue :" + res + "(priority " + lastPriority + ")");
        return res;
    }
}
