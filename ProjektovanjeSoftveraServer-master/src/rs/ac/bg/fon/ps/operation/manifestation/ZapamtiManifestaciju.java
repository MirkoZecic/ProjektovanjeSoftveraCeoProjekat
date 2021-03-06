/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.operation.manifestation;

import rs.ac.bg.fon.ps.domain.Manifestacija;
import rs.ac.bg.fon.ps.exceptions.CRUDException;
import rs.ac.bg.fon.ps.exceptions.user.impl.ManifestacijaException;
import rs.ac.bg.fon.ps.operation.AbstractGenericOperation;

/**
 *
 * @author Mirko
 */
public class ZapamtiManifestaciju extends AbstractGenericOperation {

    @Override
    protected void preconditions(Object param) throws ManifestacijaException {
        if (param == null || !(param instanceof Manifestacija)) {
            throw new ManifestacijaException("Podaci za manifestaciju nisu validni!");
        }
    }

    @Override
    protected void executeOperation(Object param) throws CRUDException {
        repository.Izmeni((Manifestacija) param);
    }

}
