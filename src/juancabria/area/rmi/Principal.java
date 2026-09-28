package juancabria.area.rmi;

import juancabria.area.rmi.net.Servidor;

public class Principal {
    public static void main(String[] args) {
        Servidor servicio = new Servidor();
        try {
            servicio.iniciar();
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
