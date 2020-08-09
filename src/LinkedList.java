public class LinkedList<T> {

    class Node<T>{
        T value;
        Node next;
        Node(T val){
            this.value=val;
        }
    }
    private Node<T> head;

    LinkedList(T value){
        head=new Node(value);
    }
    LinkedList() {
    }

    public void addValue(T value){
        if (head==null){
            head=new Node(value);
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(value);
    }

    public T getValue(int pos)throws IndexOutOfBoundsException{
        if(pos<0) throw new IndexOutOfBoundsException();
        else if(pos==0){
            return head.value;
        }
        Node<T> temp=head;
        while (temp.next!=null && pos>0){
            temp=temp.next;
            pos--;
        }
        if(pos>0) throw new IndexOutOfBoundsException();
        return temp.value;
    }

    public void removeAt(int pos)throws IndexOutOfBoundsException{
        if(pos<0) throw new IndexOutOfBoundsException();
        else if(pos==0){
            head=head.next;
            return;
        }
        Node temp=head;
        while (temp.next!=null && pos>1){
            temp=temp.next;
            pos--;
        }
        if(pos>1) throw new IndexOutOfBoundsException();
        temp.next=temp.next.next;
    }

    public void printList() throws NullPointerException {
        if(head==null) throw new NullPointerException();
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
