package EventManagement.Entities;

public class event extends EM{
    
    private String description;
    private String start;
    private String end;

    public event(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStart() {
        return this.start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return this.end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Boolean isStarted() {
        return this.started;
    }

    public Boolean getStarted() {
        return this.started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }
    private Boolean started;



    
	
}
