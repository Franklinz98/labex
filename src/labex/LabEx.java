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
public class LabEx extends Exception {

    public LabEx() {
        super();
    }

    public LabEx(String message) {
        super(message);
    }

    public LabEx(String message, Throwable cause) {
        super(message, cause);
    }

    public LabEx(Throwable cause) {
        super(cause);
    }
}
