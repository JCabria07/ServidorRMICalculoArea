package juancabria.area.rmi.net;

import java.io.IOException;
import juancabria.area.rmi.lib.IRemotaCalculoArea;
import net.sf.lipermi.exception.LipeRMIException;
import net.sf.lipermi.handler.CallHandler;
import net.sf.lipermi.net.Server;

/**
 * Servidor LipeRMI para calculo remoto de Area de habitacion
 * @author JuanCabria
 */
public class Servidor {
    private int puerto = 9008;
    private CallHandler invocador;
    private Server servidor;
    private CalculoRmiAreaImplem calculoArea;

    public Servidor() {
        invocador = new CallHandler();
        servidor = new Server();
        calculoArea = new CalculoRmiAreaImplem();
    }

    public void iniciar() throws Exception {
        try {
            invocador.registerGlobal(IRemotaCalculoArea.class, calculoArea);
            servidor.bind(puerto, invocador);
            System.out.println("Servidor RMI (Area) iniciado exitosamente en puerto: " + puerto);
        } catch (LipeRMIException ex) {
            throw new Exception("Error: No es posible invocar metodos remotos - " + ex.getMessage());
        } catch (IOException ex) {
            throw new Exception("Error: I/O - " + ex.getMessage());
        }
    }

    public void detener() {
        if (servidor != null) {
            servidor.close();
            System.out.println("Servidor detenido.");
        }
    }
}
