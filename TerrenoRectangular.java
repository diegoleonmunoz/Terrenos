import java.text.DecimalFormat;

public class TerrenoRectangular extends Terreno
{
     
    public TerrenoRectangular(double largo, double ancho, String sector)
    {
        super(largo, ancho, sector);
    }
    
    public double getArea()
    {
        area = largo * ancho;
        return area;
    }
    
    //este metodo viene en todos los objetos de JAVA. Sirve para imprimir el formato del objeto como nosotros queremos
    @Override
    public String toString()
    {
        DecimalFormat formato = new DecimalFormat(" #,###,000");
        String mensaje = "Terreno rectangular" + "\n" +
                        "Area: " + getArea() + " m2 " + "\n" +
                        "Valor: $" + formato.format(getPrecio()) + "\n";
        return mensaje;
    }

}//End class