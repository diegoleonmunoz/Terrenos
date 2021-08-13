import java.text.DecimalFormat;

public abstract class Terreno implements ContratoTerreno
{
    protected double largo;
    protected double ancho;
    protected String sector;
    protected double area;
    protected double valorXm2;
    protected double precio;

    /**
     * Constructor for objects of class Terreno
     */
    public Terreno()
    {
        this.largo = 0;
        this.ancho = 0;
        this.sector = "";
    }
    
    public Terreno(double largo, double ancho, String sector)
    {
        this.largo = largo;
        this.ancho = ancho;
        this.sector = sector;
    }
    //Start GetterSetterExtension Source Code
    /**GET Method Propertie largo*/
    public double getLargo()
    {
        return this.largo;
    }//end method getLargo

    /**SET Method Propertie largo*/
    public void setLargo(double largo)
    {
        this.largo = largo;
    }//end method setLargo

    /**GET Method Propertie ancho*/
    public double getAncho()
    {
        return this.ancho;
    }//end method getAncho

    /**SET Method Propertie ancho*/
    public void setAncho(double ancho)
    {
        this.ancho = ancho;
    }//end method setAncho

    /**GET Method Propertie sector*/
    public String getSector()
    {
        return this.sector;
    }//end method getSector

    /**SET Method Propertie sector*/
    public void setSector(String sector)
    {
        this.sector = sector;
    }//end method setSector

    public abstract double getArea();
    
    /**GET Method Propertie valorXm2*/
    public double getValorXm2()
    {
        if (sector.toLowerCase().equals("urbano"))
        {
            valorXm2 = 3000000;
        }
        else
        {
            valorXm2 = 1800000; 
        }
        return valorXm2;
    }//end method getValorXm2

    /**GET Method Propertie precio*/
    public double getPrecio()
    {
        precio = getValorXm2() * getArea();
        return precio;
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