import java.text.DecimalFormat;

public class TerrenoTrapezoidal extends Terreno
{
    protected double largo2;
    
    public TerrenoTrapezoidal(double largo, double largo2, double ancho, String sector)
    {
        super(largo, ancho, sector);
        this.largo2 = largo2;
    }

    public double getArea()
    {
        area = (largo + largo2)* ancho / 2;
        return area;
    }
    
    public String toString()
    {
        DecimalFormat formato = new DecimalFormat(" #,###,000");
        String mensaje = "Terreno Trapezoidal" + "\n" +
                        "Area: " + getArea() + " m2 " + "\n" +
                        "Valor: $" + formato.format(getPrecio()) + "\n";
        return mensaje;
    }

    public double getLargo2()
    {
        return this.largo2;
    }
    
    public void setLargo2(double largo2)
    {
        this.largo2 = largo2;
    }


}//End class