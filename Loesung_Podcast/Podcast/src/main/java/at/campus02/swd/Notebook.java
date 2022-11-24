package at.campus02.swd;

public class Notebook
        implements Observer {

    public Subject pS;

    public Notebook(Subject pS)
    {
        this.pS = pS;
        pS.registerObserver(this);
    }

    @Override
    public void update(Podcast p) {
        System.out.println("Notebook plays " + p.getName());

    }

}

