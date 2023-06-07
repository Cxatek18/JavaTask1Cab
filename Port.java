package Task8OOPPcAndCabels;

public class Port {
    private int id;
    private boolean employed = false;
    private Cabel injectedCabel;

    public Port(int id){
        this.id = id;
    }

    public void portOccupation(Cabel cabel){
        this.employed = true;
        this.injectedCabel = cabel;
    }

    public boolean getEmployed(){
        return this.employed;
    }

    public int getId() {
        return this.id;
    }

    public Cabel getInjectedCabel(){
        return this.injectedCabel;
    }

    @Override
    public String toString(){
        return "Port(id=" + this.id +
                ", employed=" + this.employed + ")";
    }
}
