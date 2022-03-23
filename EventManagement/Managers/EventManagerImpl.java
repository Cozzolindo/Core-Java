package EventManagement.Managers;

import EventManagement.Entities.event;

public class EventManagerImpl implements EventManager{

    @Override
    public event create(Long id) {
       
        return new event(id, null, null);
    }

    
    
}
