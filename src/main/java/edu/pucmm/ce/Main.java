package edu.pucmm.ce;

import org.ajbrown.namemachine.Gender;
import org.ajbrown.namemachine.Name;
import org.ajbrown.namemachine.NameGenerator;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        NameGenerator generator = new NameGenerator();

        // Generando 10 nombres femeninas
        List<Name> nombresFemeninos = generator.generateNames( 10, Gender.FEMALE );
        System.out.println("Listado de nombres femeninos:");
        for(Name n : nombresFemeninos){
            System.out.println(""+n.toString());
        }
        System.out.println("-------------------");
        // Generando 10 nombres masculinos y femeninos
        List<Name> nombresVariados = generator.generateNames( 10 );
        System.out.println("Listado de nombres:");
        for(Name n : nombresVariados){
            System.out.println(""+n.toString());
        }
    }
}
