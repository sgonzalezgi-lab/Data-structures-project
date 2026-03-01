public class CentralArray 
{
    DynamicArray<Estudiante> mainArray;
    
    public CentralArray() {
        rebuildDatabase();
    }
    
    public void rebuildDatabase() {
        mainArray = new DynamicArray();
    }
    
    public void InsertNewStudent(int id, String name) 
    {
        Estudiante newStudent = new Estudiante(id, name);
        
        mainArray.insert(newStudent);
    }
    
    public void RemoveStudent(Estudiante student) 
    {
        mainArray.delete(student);
    }
    
    public void RemoveStudentByIndex(int index) {
        mainArray.deleteAtIndex(index);
        
    }
    
    public void PrintList() 
    {
        System.out.println("Lista de nombres");
        for (int i = 0; i < mainArray.size; i++) 
        {
            Estudiante es = mainArray.getAt(i);
            System.out.println("N: " + es.name + " ID: " + es.ID);
        }
    }
}