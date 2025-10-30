package ar.unahur.edu.obj2.patroncommand.Operable;

import java.util.List;

import ar.unahur.edu.obj2.patroncommand.Programable;
import ar.unahur.edu.obj2.patroncommand.Operable.Composite.Composite;

public class WHNZ extends Composite{

    public WHNZ(List<Operable> operaciones) {
        super(operaciones);
    }

    @Override
    protected void doExecute(Programable micro) {
        while(this.acumuladorADistintoA0(micro)){
            super.doExecute(micro);
        }
    }

    
 
}

