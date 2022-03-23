package EventManagement.Test;

import EventManagement.Entities.event;
import EventManagement.Entities.organizer;

public class test {
    
    public static void main(String[] args) {
        organizer org = new organizer();
        org.setId((long) 115086800);
        org.setName("Carlos Cozzolino");
        System.out.println(org.getId());
        System.out.println(org.getName());
        System.out.println(org);

        event event = new event((long)25935030,"Casebre de Fragolandia", "Visitacao" );
        
        System.out.println(event.getDescription());
        System.out.println(event);
        System.out.println(event.getName());
        System.out.println(event.getId());

    }
}
