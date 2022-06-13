package com.company.kolB;

import java.util.Calendar;
import java.util.Formattable;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Publikacja {
    String tytul;
    int rokWydania;

    public Publikacja(String tytul, int rokWydania) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
    }

    public boolean equals(Publikacja o) {
        if (this.rokWydania != o.rokWydania)
            return false;
        else
        if (this.tytul != o.tytul)
            return false;
        else
            return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        Calendar c = new GregorianCalendar();
        return (c.get(Calendar.MILLISECOND) * 1000000 + c.get(Calendar.SECOND) * 100000 + c.get(Calendar.MINUTE) * 5 +
                c.get(Calendar.HOUR) * 100 + c.get(Calendar.DAY_OF_YEAR) + c.get(Calendar.YEAR)) + Objects.hash(tytul, rokWydania * 10);
    }

}
