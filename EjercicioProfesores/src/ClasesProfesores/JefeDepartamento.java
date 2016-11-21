
package ClasesProfesores;

import java.util.*;

public class JefeDepartamento {
    ArrayList <ProfesoresDepartamento> listaProfesores = new ArrayList <ProfesoresDepartamento> ();
    
    public void addProfesoresDepartamento(ProfesoresDepartamento profesoresDep){
        listaProfesores.add (profesoresDep);
    }
    
    public void imprimirLista(){
        for(int i=0; i<listaProfesores.size();i++){
            ProfesoresDepartamento profesorDepartamento = listaProfesores.get(i);
            profesorDepartamento.mostrarDatos();
    
    }
  }
}
