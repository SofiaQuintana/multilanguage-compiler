/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_syntax_tree.environment;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author zofia
 */
public class Environment {
    public HashMap<String, Sym> table; //tabla de variables 
    public LinkedList<GlobalError> errors; //lista de errores
    final private Environment previous; //ambito previo (padre)

    public Environment(Environment previous, LinkedList<GlobalError> errors) {
        this.table = new HashMap<>();
        this.errors = errors;
        this.previous = previous;
    }
    
    /** *  Metodo encargado de evaluar si una variable ya se encuentra contenida en un ambito, 
     * 1. En caso de que el nombre de la nueva variable ya exista en la tabla retorna un valor falso, por ende dicha variable no se agrega a la tabla.
     * 2. De lo contrario agrega la nueva variable a la tabla y retorna un valor verdadero.
     * @param name
     * @param sym
     * @return 
     */
    public boolean insert(String name, Sym sym) {
        if(table.containsKey(name)) return false;
        table.put(name, sym);
        return true;
    }
    
    /** * Metodo encargado de realizar la busqueda de una variable en la tabla de variables, recorre cada uno de los 
     * ambitos padre (anteriores)) al ambito en el que nos encontramos,
     * 1.Si encuentra la variable, retorna el valor.
     * 2. De lo contrario retorna un valor nulo.
     * @param name
     * @return 
     */
    public Sym search(String name) {
        for(Environment env = this; env != null; env = env.previous) {
            if(env.table.containsKey(name)) return env.table.get(name);
        }
        return null;
    }
    
    /** * Metodo encargado de realizar la actualizacion del valor de una variable, realiza la busqueda en todos
     * los ambitos padre del ambito presente, si encuentra el valor realiza la actualizacion.
     * @param name
     * @param sym
     */
    public void updateValue(String name, Sym sym) {
        for(Environment env = this; env != null; env = env.previous) {
            if(env.table.containsKey(name)) {
                env.table.replace(name, sym);
                return;
            }
        }
    }
}
