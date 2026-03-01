public class Estudiante implements Comparable<Estudiante>{
    int ID;
    String name;
    LinkedList<Referente> conexiones;
    public int arrayLocation;
    
    
    Estudiante(int ID,String name){
        this.ID = ID;
        this.name = name;
    }
    
    @Override
    
    public int compareTo(Estudiante other){
        
        if (other == null) throw new RuntimeException("Empty comparison");
        
        int otherID = other.ID;
        
        if (ID > otherID) return 1;
        else if (otherID > ID) return -1;
        else return 0;
        
        //return Integer.compare(this.ID, other.ID);
    }
}