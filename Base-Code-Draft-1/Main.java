
public class Main
{
	public static void main(String[] args) 
	{
		Test();
	}
	
	public static void Test() 
	{
	    CentralArray arr = new CentralArray();
	    
	    arr.InsertNewStudent(1, "A");
	    arr.InsertNewStudent(2, "B");
	    arr.InsertNewStudent(10, "D");
	    arr.InsertNewStudent(4, "C");
	    arr.InsertNewStudent(81, "E");
	    arr.InsertNewStudent(9000000, "F");
	    
	    arr.PrintList();
	    
	    arr.RemoveStudentByIndex(4);
	    
	    arr.PrintList();

	    Estudiante es = new Estudiante(1, "A");
	    
	    arr.RemoveStudent(es);
	    
	    arr.PrintList();
	    
	    arr.InsertNewStudent(7, "A");
	    
	    arr.PrintList();
	    
	    
	}
}
