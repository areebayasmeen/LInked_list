public class Linked_list {
    Node head;
    Node previous;
    Node current;
    int size=0;
    public Linked_list() {
        this.head = null;
    }
    void add(String data){
        if (head==null){
            head= new Node(data);
            size++;
        }
        else{
            Node newNode2=new Node(data);
            Node current=head;
            while(!(current.next ==null)){
                current=current.next;
            }
            current.next=newNode2;
            size++;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    void add(int location,String data){

        Node newNode =new Node(data);
       if(location>size) {
           System.out.println("this index does not exist");
       return;}

        if (head==null){
            head=newNode;
          size++;
        }else{
            if(location==1) {
               newNode.next=head;
               head=newNode;
                size++;
               return;
            }
            current=head;
            for(int i=0;i<location-1;i++){
                previous=current;
                current=current.next;}
            }
            previous.next=newNode;
            newNode.next=current;
        size++;
        }}




