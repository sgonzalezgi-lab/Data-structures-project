public class Deporte implements Comparable<Deporte>{
    String name;
    LinkedList<Referente> students;
    
    Deporte(String name){
        this.name=name;
        students=new LinkedList<Referente>();
    }
    
    @Override
    public int compareTo(Deporte other){
        return this.name.compareToIgnoreCase(other.name);
    }
}