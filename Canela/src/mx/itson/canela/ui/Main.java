/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.canela.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.canela.entidades.Ingrediente;
import mx.itson.canela.entidades.Paso;
import mx.itson.canela.entidades.Receta;
import mx.itson.canela.entidades.Usuario;
import mx.itson.canela.enumeradores.Dificultad;

/**
 *
 * @author enri0
 */
public class Main {
    
    public static void main(String[] args) {
        
        Receta receta = new Receta();
        receta.setNombre("Pasta al queso");  
        receta.setDescripcion("Dale un toque cremoso a tus pastas con esta receta de PASTA al QUESO preparada con Leche Evaporada CARNATION® CLAVEL®.");
        receta.setNumeroPorciones(4);
        receta.setTiempo(35);
        
        List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        
        Ingrediente ingrediente1 = new Ingrediente();
        ingrediente1.setNombre("1- 1 Taza de Agua");
        ingredientes.add(ingrediente1);
        
        Ingrediente ingrediente2 = new Ingrediente();
        ingrediente2.setNombre("2- 1 Lata de Leche Evaporada");
        ingredientes.add(ingrediente2);
        
        Ingrediente ingrediente3 = new Ingrediente();
        ingrediente3.setNombre("3- 2 Paquetes de Queso crema (190 g c/u)");
        ingredientes.add(ingrediente3);
        
        Ingrediente ingrediente4 = new Ingrediente();
        ingrediente4.setNombre("4- 1 1/2 Cucharaditas de Sal con cebolla en polvo");
        ingredientes.add(ingrediente4);
        
        Ingrediente ingrediente5 = new Ingrediente();
        ingrediente5.setNombre("5- 400 Gramos de Pasta tipo fusilli cocida y escurrida");
        ingredientes.add(ingrediente5);
        
        Ingrediente ingrediente6 = new Ingrediente();
        ingrediente6.setNombre("6- 1/4 Taza de Perejil fresco picado");
        ingredientes.add(ingrediente6);
        
        receta.setIngredientes(ingredientes);
        
        //Agregar pasos
        //Espero que lo hayan hecho
        List<Paso> pasos = new ArrayList<Paso>();
      
        Paso paso1 = new Paso();
        paso1.setOrden(1);
        paso1.setDescripcion("Licúa la Leche Evaporada con el agua, el queso crema y la sal con cebolla en polvo; cocina lo que licuaste a fuego bajo por 15 minutos o hasta que espese ligeramente, mueve constantemente para evitar que se pegue; retira del fuego.");
        pasos.add(paso1);
        
        Paso paso2 = new Paso();
        paso2.setOrden(2);
        paso2.setDescripcion("Sirve la pasta caliente, baña con la salsa de queso y espolvorea con perejil picado.");
        pasos.add(paso2);
        
        Paso paso3 = new Paso();
        paso3.setOrden(3);
        paso3.setDescripcion("Ofrece");
        pasos.add(paso3);
        
        receta.setPasos(pasos);
        
        receta.setDificultad(Dificultad.FACIL);
        
        Usuario usuario = new Usuario();
        usuario.setNombre("Rodolfo");
        usuario.setCorreoElectronico("rodolfoelreno@gmail.com");
        usuario.setContraseña("hesoyam");
        
        receta.setUsuario(usuario);
        
        System.out.println("*** RECETAS NESTLE ");
        System.out.println("Subido por: " + receta.getUsuario().getNombre());
        System.out.println(receta.getNombre());
        System.out.println(receta.getDescripcion());
        System.out.println("Porciones: " + receta.getNumeroPorciones());
        System.out.println("Tiempo de preparacion: " + receta.getTiempo() + " Minutos");
        for (Ingrediente i : receta.getIngredientes()){
        System.out.println(".-" + i.getNombre());
        }
        for(Paso p : receta.getPasos()){
            System.out.println(".-" + p.getOrden() + ".-" + p.getDescripcion());
        }
        System.out.println("Nivel de dificultad: " + receta.getNumeroPorciones());
    }
    
}
