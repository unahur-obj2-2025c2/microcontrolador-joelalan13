package ar.unahur.edu.obj2.patroncommand.Operable;

import ar.unahur.edu.obj2.patroncommand.Programable;

public interface Operable {

    void execute(Programable micro);

    void undo(Programable micro);
}
