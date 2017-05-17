/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex;

/**
 *
 * @author franklinz
 */
public class Modelo {

    Controlador controlador;

    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        modelo.check();
    }

    public Modelo() {
        controlador = new Controlador(this);
    }

    public boolean letra(O o) throws LabEx {
        if (Character.isLetter(o.getC())) {
            return true;
        } else {
            throw new LabEx("No pueden digitarse numeros");
        }
    }

    public boolean numero(O o) throws LabEx {
        if (Character.isDigit(o.getC())) {
            return false;
        } else {
            throw new LabEx("No pueden digitarse letras");
        }
    }

    private void check() {
        controlador.check();
    }

}
