class node
{
    int data;
    node next;

    node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
 class doubly {

    node head;
    node prev;

    doubly()
    {
        head=null;
    }
    public void add_At_last(int data)
    {
       node p= new node(data);
       if(head==null)
       {
         this.prev=null;
       }

       

    }
    public static void main(String[] args) {
        
        doubly lt=new doubly();
        lt.add_At_last(8);
        lt.add_At_last(9);
        lt.add_At_last(10);
    }
}
