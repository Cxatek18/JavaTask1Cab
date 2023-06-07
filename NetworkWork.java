package Task8OOPPcAndCabels;

/*
    Теперь давайте перейдем к более интересным задачам! Мы создадим с вами модель сети!
    В нашей с вами модели будут следующие сетевые элементы: PC и Cable.
        Каждый PC может быть соединен с множеством других PC при помощи кабелей.

    Требования:
    1. Каждый элемент должен иметь свой идентификатор
    2. Каждый PC должен иметь два выделенных состояния: включен / отключен
    3. Каждый PC может быть соединен с множеством других элементов
    4. Должна быть возможность получать из PC множество других PC (соседей) к которым он подключен
 */

import java.util.Scanner;

public class NetworkWork {
    public static void main(String[] args) {
        // PC1
        Port port1 = new Port(1);
        Port port2 = new Port(2);
        Port port3 = new Port(3);
        Port port4 = new Port(4);

        Pc pc1 = new Pc(1, true);
        pc1.addPort(port1);
        pc1.addPort(port2);
        pc1.addPort(port3);
        pc1.addPort(port4);

        // PC2
        Port port5 = new Port(5);
        Port port6 = new Port(6);

        Pc pc2 = new Pc(2, true);
        pc2.addPort(port5);
        pc2.addPort(port6);

        // PC3
        Port port7 = new Port(7);
        Port port8 = new Port(8);

        Pc pc3 = new Pc(3, true);
        pc3.addPort(port7);
        pc3.addPort(port8);

        // Cabels
        Cabel cabel1 = new Cabel(1);
        Cabel cabel2 = new Cabel(2);
        Cabel cabel3 = new Cabel(3);
        Cabel cabel4 = new Cabel(4);


        pc1.getAllPortsThisPC();
        pc1.connect(cabel1);
        pc1.connect(cabel2);
        pc1.connect(cabel3);
        pc1.connect(cabel4);
        pc1.getAllPortsThisPC();

        pc2.connect(cabel1);
        pc2.connect(cabel2);
        pc3.connect(cabel3);

        pc1.conectedPersonalComputers();
    }
}
