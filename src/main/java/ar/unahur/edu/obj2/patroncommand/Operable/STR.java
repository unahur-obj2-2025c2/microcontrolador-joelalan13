package ar.unahur.edu.obj2.patroncommand.Operable;

import ar.unahur.edu.obj2.patroncommand.Programable;

public class STR extends Comando{
    private Integer addr;
    public STR(Integer addr){
        this.addr = addr;
    }
    @Override
    public void doExecute(Programable micro) {
        micro.setAddr(addr);
    }

}
