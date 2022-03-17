package EventManagement.Entities;

public class event {
    

	
    public Long id;
    public String name;
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
