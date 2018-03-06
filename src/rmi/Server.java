package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static void main(String[] args){
        System.setProperty("java.rmi.server.hostname", "192.168.75.128");
//        System.setProperty("java.rmi.server.hostname", "192.168.165.114");
        try {
            Calculator calculator = new CalculatorImpl();
            Calculator stub = (Calculator) UnicastRemoteObject.exportObject(calculator, Registry.REGISTRY_PORT);
            Registry registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            registry.rebind("Calculator", stub);
            System.out.println("Calculator is bound.");
        } catch (RemoteException e) {
            System.out.println("Calculator is not bound. RemoteException appeared: " + e.toString());
        }
    }
}
