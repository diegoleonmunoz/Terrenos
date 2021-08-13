import javax.swing.JOptionPane;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class PantallaGrafica
{
    private ArrayList<Terreno> terrenos;
    private double precio;
    private int cantTerrenos;
    
    public void preguntarDatos()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de terrenos: ");
        cantTerrenos = Integer.parseInt(teclado.nextLine());
        
        for (int i=0; i< cantTerrenos; i++)
        {
            String forma = JOptionPane.showInputDialog(null, "Ingrese la forma del terreno "+ (i + 1) + " (rectangular, triangular, trapezoidal:)");
            double largo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese largo del terreno "+(i+1)));
            double ancho = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese ancho del terreno "+(i+1)));
            String sector = JOptionPane.showInputDialog(null, "Ingrese sector del terreno "+(i+1) + " (urbano o rural)");
            
            if (forma.toLowerCase().equals("rectangular"))
            {
                terrenos.add(new TerrenoRectangular(largo, ancho, sector));
            }
            else if (forma.toLowerCase().equals("triangular"))
            {
                terrenos.add(new TerrenoTriangular(largo, ancho, sector));    
            }
            else if (forma.toLowerCase().equals("trapezoidal"))
            {
                double largo2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo largo del terreno "+(i+1)+":"));
                terrenos.add(new TerrenoTrapezoidal(largo, largo2, ancho, sector));    
            }
        }
    }

    public void calcularPrecio()
    {
        precio = 0;
        for (int i=0; i< cantTerrenos; i++)
        {
            precio = precio + terrenos.get(i).getPrecio();
        }
    }
            
    public void mostrarPrecio()
    {
        DecimalFormat formato = new DecimalFormat("#,###,000");
        for (int i = 0; i < cantTerrenos; i++)
        {
            System.out.println(terrenos.get(i));
        }
        System.out.println( "El valor total de los terrenos es: $" + formato.format(precio));
    }
}   

