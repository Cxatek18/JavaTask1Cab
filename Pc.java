package Task8OOPPcAndCabels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pc {
    private int id;
    private boolean included;
    private List<Port> portsPc;
    private Map<Port, Cabel> busyPorts;

    public Pc(int id, boolean included){
        this.id = id;
        this.included = included;
        this.portsPc = new ArrayList<>();
        this.busyPorts = new HashMap<>();
    }

    public void addPort(Port newPort){
        this.portsPc.add(newPort);
    }

    public void getAllPortsThisPC(){
        System.out.println(portsPc);
    }

    public Port getFreePort(){
        for(Port port: this.portsPc){
            if(!port.getEmployed()){
                return port;
            }
        }
        throw new IllegalArgumentException("Нету свободных портов");
    }

    public void connect(Cabel cabel){
        Port port = getFreePort();
        port.portOccupation(cabel);
        cabel.setPort(port);
        cabel.addConectedPc(this);
        this.busyPorts.put(port, cabel);
    }

    public void conectedPersonalComputers(){
        for(Map.Entry<Port, Cabel> entry: this.busyPorts.entrySet()){
            if(entry.getValue().getConectedPc() != null){
                System.out.println("Подключёные пк: " + entry.getValue().getConectedPc());
            }
        }
    }

    @Override
    public String toString(){
        return "Pc(id=" + this.id +
                ", include=" + this.included +
                ", count port=" + this.portsPc.size() + ")";
    }
}
