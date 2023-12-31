
public class CustomStack {
    private int size;
    Node head;
    CustomStack(int size,int el){
        this.size=size;
        this.head=new Node(el);
    }
    public void addElement(int val)
    {
        Node el=new Node(val);
        el.next=head;
        el.data=val;
    }
    public boolean IsFull(){
        int counter =0;
        Node aux=this.head;
        while(aux!=null){
            aux=aux.next;
            counter++;
        }
        return counter==size;
    }
    public boolean  IsEmpty(){
        return head==null;
    }
    public void removeElemnet(){
        if(this.IsEmpty()){
            throw new RuntimeException("This is an unchecked exception.");
        }
        else {
            head=head.next;
        }
    }
    public int LastInStack(){
        if(this.IsEmpty()){
            throw new RuntimeException("This is an unchecked exception.");
        }
        else {
            return (head.data);
        }
    }
}
