package Task8OOPPcAndCabels;

import java.util.ArrayList;
import java.util.List;

public class Cabel {
    private int id;
    private Port port;
    private List<Pc> conectedPc = new ArrayList<>();

    public Cabel(int id){
        this.id = id;
    }

    public void setPort(Port port){
        this.port = port;
    }

    public void addConectedPc(Pc pc){
        conectedPc.add(pc);
    }

    private boolean checkAllConnectedCabel(){
        if(conectedPc.size() == 2){
            return true;
        }
        return false;
    }

    public Pc getConectedPc(){
        if(checkAllConnectedCabel()){
            return conectedPc.get(1);
        }
        return null;
    }
}
