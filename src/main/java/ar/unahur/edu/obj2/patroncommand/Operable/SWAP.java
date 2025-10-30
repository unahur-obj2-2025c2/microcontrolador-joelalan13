package ar.unahur.edu.obj2.patroncommand.Operable;

import ar.unahur.edu.obj2.patroncommand.Programable;

public class SWAP extends Comando{

    @Override
    public void doExecute(Programable micro) {
        Integer valorB = micro.getAcumuladorB();
        Integer valorA = micro.getAcumuladorA();
        micro.setAcumuladorB(valorA);

    }

}
