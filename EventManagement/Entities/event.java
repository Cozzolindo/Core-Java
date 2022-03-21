package EventManagement.Entities;

public class event extends EM{
    
    public String description;
    public String start;
    public String end;
    public Boolean started;



    public event(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        
    }
	
}
