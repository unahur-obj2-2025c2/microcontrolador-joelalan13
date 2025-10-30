package ar.unahur.edu.obj2.patroncommand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unahur.edu.obj2.Invocador.Programa;
import ar.unahur.edu.obj2.patroncommand.Operable.ADD;
import ar.unahur.edu.obj2.patroncommand.Operable.LOD;
import ar.unahur.edu.obj2.patroncommand.Operable.LODV;
import ar.unahur.edu.obj2.patroncommand.Operable.NOP;
import ar.unahur.edu.obj2.patroncommand.Operable.STR;
import ar.unahur.edu.obj2.patroncommand.Operable.SWAP;

public class ComandoTest {
    private Programa p = new Programa();
    private Programable micro = new Microcontrolador();
    @BeforeEach
    void setUp(){
        p.vaciarLista();
        p.resetearMicro(micro);
    }
    @Test
    void testAvanzar3Posiciones(){
         p.agregarOperacion(new NOP());
         p.agregarOperacion(new NOP());
         p.agregarOperacion(new NOP());

         p.ejecutar(micro);

         assertEquals(3, micro.getProgramCounter());
         
    }   
    @Test
    void sumarVeinteMasDieciciete(){
        p.agregarOperacion(new LODV(20));
        p.agregarOperacion(new SWAP());
        p.agregarOperacion(new LODV(17));
        p.agregarOperacion(new ADD());

        p.ejecutar(micro);

        assertEquals(37, micro.getAcumuladorA());
        assertEquals(0, micro.getAcumuladorB());
        assertEquals(4, micro.getProgramCounter());

    }
    @Test 
    void  sumar2MAS8MAS5(){
        p.agregarOperacion(new LODV(2));
        p.agregarOperacion(new STR(0));
        p.agregarOperacion(new LODV(8));
        p.agregarOperacion(new SWAP());
        p.agregarOperacion(new LODV(5));
        p.agregarOperacion(new ADD());
        p.agregarOperacion(new SWAP());
        p.agregarOperacion(new LOD(0));
        p.agregarOperacion(new ADD());
    
        p.ejecutar(micro);

        assertEquals(15, micro.getAcumuladorA());
    }
    
}
