package ar.unahur.edu.obj2.patroncommand;

import java.util.Arrays;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.Excepciones.FueraDeRangoDeMemoriaException;
import ar.unahur.edu.obj2.patroncommand.Operable.Operable;

public class Microcontrolador implements Programable{
    private Integer acumuladorA = 0;
    private Integer acumuladorB = 0;

    private Integer programCounter = 0;
    private List<Integer>memoria = Arrays.asList(new Integer[1024]);
    
    public Microcontrolador(){
        this.reset();
    }

    @Override
    public void run(List<Operable> operaciones) {
        operaciones.stream().forEach(O -> O.execute(this));
    }
    @Override
    public void incProgramCounter() {
        programCounter += 1;
    }
    @Override
    public Integer getProgramCounter() {
       
        return programCounter;
    }
    @Override
    public void setAcumuladorA(Integer value) {
        acumuladorA = value;
    }
    @Override
    public Integer getAcumuladorA() {
        return acumuladorA;
    }
    @Override
    public void setAcumuladorB(Integer value) {
        acumuladorB = value;
    }
    @Override
    public Integer getAcumuladorB() {
        return acumuladorB;
    }
    @Override
    public void setAddr(Integer addr){
        /*como puede generar errores que pasemos un addr mayor a lo usado debemos usar if */
        estaDentroDelRango(addr);
        /*en el arrayList[addr] guardamos lo que salga en en un acumulador */
        
        memoria.set(addr, acumuladorA);
    }
    @Override
    public Integer getAddr(Integer addr) {
         /*como puede generar errores que pasemos un addr mayor a lo usado debemos usar if */
        estaDentroDelRango(addr);
        return memoria.get(addr);
    }
    public void estaDentroDelRango(Integer addr){
        if(addr < 0 || addr > memoria.size()){
            throw new FueraDeRangoDeMemoriaException();
        };
    }
    @Override
    public void reset() {
        acumuladorA = 0;
        acumuladorB = 0;
        programCounter = 0;
        memoria =  Arrays.asList(new Integer[1024]);
    }

    @Override
    public Programable copiar() {
        Microcontrolador nuevo = new Microcontrolador();
        nuevo.acumuladorA = this.acumuladorA;
        nuevo.acumuladorB = this.acumuladorB;
        nuevo.programCounter = this.programCounter;

        return nuevo;

    }

    @Override
    public void copiarDesde(Programable microDeRespaldo) {
        /*Con este le seteamos los valores que obtuvimos de la copia antes hecha */
        this.acumuladorA = microDeRespaldo.getAcumuladorA();
        this.acumuladorB = microDeRespaldo.getAcumuladorB();
        this.programCounter = microDeRespaldo.getProgramCounter();
    }   

    
}
