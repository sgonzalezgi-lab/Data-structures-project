public class Referente implements Comparable<Referente>
{
    int ID;
    String name;
    int arrPointer;
    
    Referente(int ID,String name, int point){
        this.ID = ID;
        this.name = name;
        this.arrPointer = point;
    }
    
    @Override
    
    public int compareTo(Referente other){
        return Integer.compare(this.ID,other.ID);
    }
    

}