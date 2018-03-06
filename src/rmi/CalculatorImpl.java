package rmi;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by pietyszukm on 06.03.2018.
 */
public class CalculatorImpl implements Calculator {

    @Override
    public BigDecimal add(BigDecimal x, BigDecimal y) throws RemoteException {
        return x.add(y);
    }

    @Override
    public BigDecimal subtract(BigDecimal x, BigDecimal y) throws RemoteException {
        return x.subtract(y);
    }

    @Override
    public BigDecimal multiply(BigDecimal x, BigDecimal y) throws RemoteException {
        return x.multiply(y);
    }

    @Override
    public BigDecimal divide(BigDecimal x, BigDecimal y) throws RemoteException {
        return x.divide(y, 4);
    }
}
