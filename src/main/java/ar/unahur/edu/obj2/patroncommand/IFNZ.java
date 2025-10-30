package ar.unahur.edu.obj2.patroncommand;


import java.util.List;

import ar.unahur.edu.obj2.patroncommand.Operable.Operable;
import ar.unahur.edu.obj2.patroncommand.Operable.Composite.Composite;

public class IFNZ extends Composite {

    public IFNZ(List<Operable> operaciones) {
        super(operaciones);
    }

    @Override
    protected void doExecute(Programable micro) {
        if(this.acumuladorADistintoA0(micro)){
            this.doExecute(micro);
        };
    }
    

}
