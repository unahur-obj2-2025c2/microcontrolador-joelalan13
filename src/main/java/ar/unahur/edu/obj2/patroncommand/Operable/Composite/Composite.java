package ar.unahur.edu.obj2.patroncommand.Operable.Composite;

import java.util.ArrayList;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.Programable;
import ar.unahur.edu.obj2.patroncommand.Operable.Comando;
import ar.unahur.edu.obj2.patroncommand.Operable.Operable;

/*Aunque los operables extiendan de comando, primero extienden de Operables asi el composite
 * puede utilizarlos en la lista
 */
public class Composite extends Comando{
    List<Operable>operaciones = new ArrayList<Operable>();

    public Composite(List<Operable>operaciones){
        this.operaciones = operaciones;
    }

    @Override
    protected void doExecute(Programable micro) {
        micro.run(operaciones);
    }

    protected Boolean acumuladorADistintoA0(Programable micro){
        return !micro.getAcumuladorA().equals(0);
    }

    
}
