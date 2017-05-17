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
public class Controlador {

    Interfaz vista;
    Modelo modelo;

    public Controlador(Modelo modelo) {
        this.modelo = modelo;
        this.vista = new Interfaz();
        vista.setControlador(this);
    }

    public boolean letra(char c) throws LabEx {
        O elO = new O(c);
        return modelo.letra(elO);
    }

    public boolean numero(char c) throws LabEx {
        O elO = new O(c);
        return modelo.numero(elO);
    }

    void check() {
        vista.check();
    }
}
