package at.campus02.swd;


import java.util.ArrayList;
import java.util.List;

public class PodcastServer implements Subject {

    private List<Observer> observers;
    private List<Podcast> podcasts;



    public PodcastServer() {
        observers = new ArrayList<Observer>();
        podcasts = new ArrayList<Podcast>();
    }
    public void addPodcast(Podcast p) {
        podcasts.add(p);
        notifyObservers(); // notify subscribers about new podcast content
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);

    }
    @Override
    public void notifyObservers() {
        // wir möchten alle observer über änderungen informieren
        for(Observer o : observers)
        {
            o.update(podcasts.get(podcasts.size() - 1));
        }

    }


}
