public class Stack {

    //Define the data members
    Node head;
    int size;


    public Stack() {
        //Implement the Constructor
        head = null;
        size = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
        if(size==0){
            return 0;
        }
        else{
            int t=0;
            Node temp=head;
            while(temp!=null){
                t++;
                temp=temp.next;
            }
            size=t;
            return size;

        }

    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return getSize()==0;
    }

    public void push(int element) {
        //Implement the push(element) function
        if(head==null){
            head = new Node(element);
            size= size+1;
        }
        else{
            Node newNode = new Node(element);
            newNode.next=head;
            head= newNode;
            size=size+1;
        }

    }

    public int pop() {
        //Implement the pop() function
        if(size==0){
            return -1;
        }
        else{
            int t = head.data;
            Node temp = head;
            head=head.next;
            temp.next=null;
            return t;
        }
    }

    public int top() {
        //Implement the top() function
        if(size==0){
            return -1;
        }
        else{
            return head.data;
        }
    }
}