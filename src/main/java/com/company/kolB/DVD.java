package com.company.kolB;

import java.util.Objects;

public class DVD extends CD{
    double dlugoscNagrania;

    public DVD(String tytul, int rokWydania, double pojemnoscPlyty, double dlugoscNagrania) {
        super(tytul, rokWydania, pojemnoscPlyty);
        this.dlugoscNagrania = dlugoscNagrania;
    }

    public boolean equals(DVD o) {
        if (this.rokWydania != o.rokWydania)
            return false;
        else
        if (this.tytul != o.tytul)
            return false;
        else
        if(this.dlugoscNagrania != o.dlugoscNagrania)
            return false;
        else
            if(this.pojemnoscPlyty != o.pojemnoscPlyty)
                return false;
            else
                return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dlugoscNagrania);
    }
}
