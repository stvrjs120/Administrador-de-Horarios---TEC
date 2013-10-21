/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;
/**
 *
 * @author StvRjs.K12
 */
public class testCase1 {

    @Test
    public void AsingarCuentaCliente() throws Exception {

        Sucursal sucursal1 = new Sucursal("Florencia", "Florencia");
        Cliente cliente1 = new Cliente("marlen", "trevino", "25-01-1988", "2401-3117", "Aguas Zarcas", "yensy@gmail.com");
        sucursal1.setClientes(cliente1);
        Cuenta cuenta1 = Mockito.mock(Cuenta.class);
        sucursal1.getClientes().get(0).setCuentas(cuenta1);
        sucursal1.getClientes().get(0).getCuentas().get(0).setCantidadDinero(100000.0);

        when(sucursal1.getClientes().get(0).getCuentas().get(0).getCantidadDinero()).thenReturn(100000.0);

        Assert.assertEquals(100000.0, sucursal1.getClientes().get(0).getCuentas().get(0).getCantidadDinero(), 0);
   }
}