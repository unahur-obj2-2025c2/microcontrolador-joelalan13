package ar.unahur.edu.obj2.Invocador;

import java.util.ArrayList;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.Microcontrolador;
import ar.unahur.edu.obj2.patroncommand.Programable;
import ar.unahur.edu.obj2.patroncommand.Operable.Operable;

public class Programa {
    List<Operable>operaciones;

    public Programa(){
        this.operaciones = new ArrayList<>();
    }
    public void agregarOperacion(Operable operable){
        operaciones.add(operable);
    }
    public void agregarOperaciones(List<Operable> operables){
        operaciones.addAll(operables);
    }
    public void vaciarLista(){
        operaciones.clear();
    }
    public void ejecutar(Programable micro){
        micro.run(operaciones);
    }
    public void resetearMicro(Programable micro){
        micro.reset();
    }
}
