package juancabria.area.rmi.net;

import juancabria.area.rmi.lib.DatosArea;
import juancabria.area.rmi.lib.IRemotaCalculoArea;

/**
 * Implementacion del calculo de area invocable remotamente
 * @author JuanCabria
 */
public class CalculoRmiAreaImplem implements IRemotaCalculoArea {

    public CalculoRmiAreaImplem() {
    }

    @Override
    public DatosArea calcularArea(DatosArea datos) {
        if (datos.getLargo() <= 0 || datos.getAncho() <= 0) {
            datos.setResultado(0);
            datos.setInterpretacion("ERROR: El largo y el ancho deben ser mayores que 0");
            return datos;
        } else {
            float area = datos.getLargo() * datos.getAncho();
            datos.setResultado(area);
            datos.setInterpretacion("El area total de la habitacion es de " + area + " m2");
            return datos;
        }
    }
}
