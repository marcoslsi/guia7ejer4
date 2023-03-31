/*
 Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
3
 */
package guia7_ejer4;

import Entidad.Rectangulo;

/**
 *
 * @author virginia_mateo
 */
public class GUIA7_EJER4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo();
        rec1.crearRectangulo();
        rec1.calcularSuperficie();
        rec1.calcularPerimetro();
        rec1.dibujarRectangulo();

    }
}
