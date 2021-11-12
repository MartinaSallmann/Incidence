package org.campus02;

public class CovidManager {

    public static void main(String[] args) {

        Incidence stmk20211111 = new Incidence("Steiermark", "2021-11-11", 1300);
        Incidence stmk20211110 = new Incidence("Steiermark", "2021-11-10", 1200);
        Incidence wien20211111 = new Incidence("Wien", "2021-11-11", 1100);
        Incidence wien20211110 = new Incidence("Wien", "2021-11-10", 900);
        Incidence tirol20211111= new Incidence("Tirol", "2021-11-11", 1350);
        Incidence tirol20211110 = new Incidence("Tirol", "2021-11-10", 1500);

    }
}
