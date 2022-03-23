package EventManagement.Managers;

import EventManagement.Entities.event;

public class EventManagerImpl2 implements EventManager{

    @Override
    public event create(Long id) {

        return new event(id, "Le Novo", "ThinkPad");
    }
    
}
