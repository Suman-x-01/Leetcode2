package queue;

public class MyQueue {
    int[] arr=new int[5];
    int front=-1,rear=-1;
    int size=5;
    void add(int x){
        if (front==size-1){
            System.out.println("Queue is full");
            return;
        }
        if(rear==-1){
            front=0;
        }
        rear++;
        arr[rear]=x;
    }

    int top(){
        if (front==-1) {
            System.out.println("Empty queue ");
            return -1;
        }


        return arr[front];
    }

    int pop(){
        if (front==-1) return-1;
        int temp=arr[front];
        if (front==rear){
            rear=-1;
            front=-1;
            return arr[temp];
        }else{
            front++;
        }
        return temp;
    }

}
