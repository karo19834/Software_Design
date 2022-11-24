package at.campus02.fernbedienungmanfred;

public class EinfacheFernbedienung {

        private Kommando slot1;

        public void setKommando(Kommando k){
                slot1 = k;
        }

        public void KnopfGedrueckt(){
                slot1.ausfuehren();
        }

}
