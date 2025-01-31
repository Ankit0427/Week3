
 class node{
    int data;
    node next;

    node(int data){
        this.data=data;
        this.next=null;
    }
 }
 class practice {

    node head;
    node temp;

    practice() {

        this.head=null;
    }

    public void add_At_end(int data)
    {

        node p=new node(data);

        if(head==null)
        {
            head=p;
            temp=p;
        }
        else
        {
            temp.next=p;
            temp=temp.next;
        }

    } 

    public void add_At_start(int data)
    {

        node p=new node(data);

        if(head==null)
        {
            head=p;
            temp=p;
        }
        else
        {
           p.next=head;
           head=p;
        }

    }

    public void add_At_position(int data,int position)
    {
       
        node p=new node(data);
        node man=head;

        for (int i = 0; i < position - 1; i++) {
            man = man.next;
        }
        p.next = man.next;
        man.next = p;

    }

    public void display(){

        node ans=head;

        while(ans!=null)
        {
            System.out.print(ans.data + " -> ");
            ans=ans.next;
        }

    }
    

    public static void main(String[] args) {
        
        practice pt=new practice();
        
        pt.add_At_end(8);
        pt.add_At_end(9);
        pt.add_At_end(10);
        pt.add_At_end(11);
       //pt.temp=pt.head;
        pt.add_At_start(1);
        pt.add_At_start(2);
        pt.add_At_start(3);
        pt.add_At_position(100,3);
        pt.display();

    }
}
