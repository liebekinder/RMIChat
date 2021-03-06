package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Client listener.
 * 
 * @author Ornicare
 *
 */
public interface IMessageListener extends Remote{

	/**
	 * Used to send a message to the client who handle themessage listener
	 * @param message
	 * @throws RemoteException
	 */
	public void sendMessage(String message) throws RemoteException;

    public void sendDeconnect() throws RemoteException;

    public Object getPseudo() throws RemoteException;

	public void actualise() throws RemoteException;

}
