public class DynamicArray<T extends Comparable<T>>{
    int capacity;
    T[] values;
    public int size;
    int position;
    
    public static int updatePosition; //Esto se puede usar para actualizar un item si no corresponde al ID registrado
    public static int positionOffset; //Y además, para rápidamente ajustar un item de lugar
    
    DynamicArray(){
        capacity=2;
        values = (T[])new Comparable[capacity];
        size=0;
        position=0;
    }
    
    public T getAt(int index) {
        return values[index];
    }
    
    private void resize(){
        capacity*=2;
        T[] newArray = (T[]) new Comparable[capacity];
        for(int i=0;i<size;i++){
            newArray[i]=values[i];
        }
        values=newArray;
    }
    public boolean isEmpty(){
        return size<=0;
    }
    public boolean isFull(){
        return size>=capacity;
    }
    
    public int insert(T item){
        if(isEmpty()){
            values[0]=item;
            size++;
            return 0;
        }
        if(isFull()){
            resize();
        }
        search(item);
        
        for(int j=size;j>position;j--){
            values[j]=values[j-1];
        }
        values[position]=item;
        size++;
        
        return position;
        
    }
    
    public void delete(T item){
        if(isEmpty()){
            throw new RuntimeException("is empty");
        }
        if(!search(item)){
            throw new RuntimeException("is not in the list");
        }
        
        deleteAtIndex(position);
    }
    
    public void deleteAtIndex(int pos) {
        //how search alredy was checked
        for(int i=pos;i<size-1;i++){
            values[i]=values[i+1];
            
        }
        size--;
    }
    
    public boolean search(T item){
        position=0;
        
        while(position<size && (item.compareTo(values[position]))>0){
            position++;
        }
        if(position<size && item.compareTo(values[position])==0){
            return true;
        }
        return false;
    }
    
    /*
    public boolean search(T item){
        position=size;
        for(int i=size;i>0;i--){
            if (values[i] == null) continue;
            
            if((item.compareTo(values[i]))<=0){
                position=i;
                if((item.compareTo(values[i]))==0){
                    position = i;
                    return true;
                }
                //return false;
            }
        }
        return false;
    }
    */
}