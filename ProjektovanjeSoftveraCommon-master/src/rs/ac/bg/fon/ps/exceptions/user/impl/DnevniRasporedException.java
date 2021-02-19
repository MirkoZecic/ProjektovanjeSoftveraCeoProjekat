/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.exceptions.user.impl;

import rs.ac.bg.fon.ps.exceptions.UserException;

/**
 *
 * @author Mirko
 */
public class DnevniRasporedException extends UserException {

    public DnevniRasporedException() {
    }

    public DnevniRasporedException(String message) {
        super(message);
    }

    public DnevniRasporedException(Throwable cause) {
        super(cause);
    }

    public DnevniRasporedException(String message, Throwable cause) {
        super(message, cause);
    }
}
