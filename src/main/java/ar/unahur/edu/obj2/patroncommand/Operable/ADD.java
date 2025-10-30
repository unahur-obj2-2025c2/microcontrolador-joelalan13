package ar.unahur.edu.obj2.patroncommand.Operable;

import ar.unahur.edu.obj2.patroncommand.Programable;

public class ADD extends Comando{

    @Override
    public void doExecute(Programable micro) {
        Integer resultado = micro.getAcumuladorA() + micro.getAcumuladorB();
        
        micro.setAcumuladorA(resultado);
        micro.setAcumuladorB(0);
    }

}
