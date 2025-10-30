package ar.unahur.edu.obj2.patroncommand.Operable;

import ar.unahur.edu.obj2.patroncommand.Programable;

public abstract class Comando implements Operable {

    Programable microDeBackUp;

    @Override
    public void execute(Programable micro) {
        microDeBackUp = micro.copiar();
        doExecute(micro);
        micro.incProgramCounter(); 
    }

    protected abstract void doExecute(Programable micro);

    @Override
    public void undo(Programable micro){
        /*Con este comando desecha los cambios hechos */
        micro.copiarDesde(microDeBackUp);
    }


}
