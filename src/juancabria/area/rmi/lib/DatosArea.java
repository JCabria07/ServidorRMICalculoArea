package juancabria.area.rmi.lib;

import java.io.Serializable;

/**
 * Clase para transportar las dimensiones y resultado del calculo del Area
 * @author JuanCabria
 */
public class DatosArea implements Serializable {
    private float largo;
    private float ancho;
    private float resultado;
    private String interpretacion;

    public DatosArea() {
    }

    public DatosArea(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
