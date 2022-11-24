package at.campus02.fernbedienungmanfred;

public class TV {
    private boolean istEin = false;
    private int kanal = 1;


    public void an(){
        if(istEin == true)
        {
            System.out.println("--TV ist bereits an");
        } else // TV ist aus
        {
            istEin = true;
            System.out.println("--TV ist an");
        }
    }
    public void aus(){
        if (istEin == false) //  // TV ist AUSgeschaltet
        {
            System.out.println("--TV ist bereits aus");
        }
        else // TV ist EINgeschaltet
        {
            istEin = false;
            System.out.println("--TV ist aus");
        }
    }


    public int getKanal() {
        return kanal;
    }

    public void setKanal(int kanal) {
        this.kanal = kanal;
        System.out.println("--TV: Neuer Kanal: " + kanal);
    }

    public void rauf() {
        //wenn ausgeschaltet -> return immediately
        if (!istEin)
        { return; }

        if(kanal == 40)
        {   kanal = 1;}
        else
        {
            kanal++;
        }
        System.out.println("--TV: Neuer Kanal: " + kanal);
    }

    public void runter () {
        //wenn ausgeschaltet -> return immediately
        if (!istEin)
        { return; }

        if(kanal == 1)
        {  kanal = 40;}
        else
        {
            kanal--;
        }
        System.out.println("--TV: Neuer Kanal: " + kanal);
    }
    public boolean istEin() { return istEin; }

}
