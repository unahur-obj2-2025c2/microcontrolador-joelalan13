package ar.unahur.edu.obj2.patroncommand.Operable;

import ar.unahur.edu.obj2.patroncommand.Programable;

public class LODV extends Comando{
    private Integer valor;
    public LODV(Integer valor){
        this.valor = valor;
    }
    @Override
    public void doExecute(Programable micro) {
        micro.setAcumuladorA(valor);;
    }

}
