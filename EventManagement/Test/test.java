package EventManagement.Test;

import EventManagement.Entities.event;
import EventManagement.Entities.organizer;

public class test {
    
    public static void main(String[] args) {
        organizer org = new organizer();
        org.id = (long) 115086800;
        org.name = "Carlos Cozzolino";
        System.out.println(org.id);
        System.out.println(org.name);
        System.out.println(org);

        event event = new event((long)25935030,"Casebre de Fragolandia", "Visitacao" );
        
        System.out.println(event.id);
        System.out.println(event);
        System.out.println(event.name);
        System.out.println(event.description);

    }
}
