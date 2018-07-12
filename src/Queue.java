public class Queue {
   // your code is here
    int storage[]=new int [3];
  	int counter=0;
    public void push(int pushedElement){
       //your code is her
        // e
        if (counter>2){
            System.out.println("Overflow condition");
        }
     storage[counter]=pushedElement;
     counter++;

    }
    public void pop(){
        //your code is here
        if (counter==0){
            System.out.println("Underflow condition");
        }
        counter--;
        storage[counter]=0;
    }
    public void display(){
        for (int i = 0 ; i<storage.length; i++){
            System.out.println(storage[i]);
        }
        //your code is here
    }

}