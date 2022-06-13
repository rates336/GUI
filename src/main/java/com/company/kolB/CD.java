package com.company.kolB;

import java.util.Objects;

public class CD extends Publikacja {
    double pojemnoscPlyty;

    public CD(String tytul, int rokWydania, double pojemnoscPlyty) {
        super(tytul, rokWydania);
        this.pojemnoscPlyty = pojemnoscPlyty;
    }

    public boolean equals(CD o) {
        if (this.rokWydania != o.rokWydania)
            return false;
        else
            if (this.tytul != o.tytul)
                return false;
            else
                if(this.pojemnoscPlyty != o.pojemnoscPlyty)
                    return false;
                else
                    return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pojemnoscPlyty);
    }
}
