package ar.unahur.edu.obj2.patroncommand.Operable;

import ar.unahur.edu.obj2.patroncommand.Programable;

public class LOD extends Comando{
    private Integer addr;
    public LOD(Integer addr){
        this.addr = addr;
    }
    @Override
    public void doExecute(Programable micro) {
        micro.setAcumuladorA(micro.getAddr(addr));
        
    }

}
