package at.campus02.swd;

public class AndroidFactory extends Factory {

    @Override
    Computer assembleComputer(ComputerType type) {
        // TODO Auto-generated method stub
        switch(type)
        {
            case SMARTPHONE:
                return new Smartphone();
            case TABLET:
                return new Tablet();
            default:
                return null;
        }

    }

}