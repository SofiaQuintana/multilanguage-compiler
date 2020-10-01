/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_syntax_tree;

import abstract_syntax_tree.environment.EnumType;
import abstract_syntax_tree.environment.Environment;
import abstract_syntax_tree.environment.GlobalError;
import abstract_syntax_tree.environment.Sym;
import java.util.LinkedList;

/**
 *
 * @author zofia
 */
public class Declaration implements Instruction {
    private EnumType type;
    private LinkedList<LinkedList> declarations;
    private int line, column;
    
    public Declaration(EnumType type, LinkedList<LinkedList> declarations, int line, int column) {
        this.type = type;
        this.declarations = declarations;
        this.line = line+1;
        this.column = column;
    }

    @Override
    public Object execute(Environment environment) {
        for(LinkedList<Object> declaration : declarations) {
            if(declaration == null) continue;
            Sym value = this.defaultValue();
            if(declaration.getLast() != null) {
                Expression expression = (Expression) declaration.getLast();
                value = (Sym) expression.execute(environment);
                if(value.getType() != this.type) {
                     // Agregar error semantico (Tipo incorrecto en declaracion)
                    environment.errors.add(new GlobalError(line, column, "semantico", "", "tipo incorrecto en declaracion de variable."));
                    continue;
                }
            }
            if(!environment.insert((String) declaration.getFirst(), value)) {
                // Agregar error semantico (La variable con el id ya existe en el ambito actual)
                environment.errors.add(new GlobalError(line, column, "semantico", "", "la variable con el ID ya existe en el ambito actual."));
            }
        }
        return null;
    }

    private Sym defaultValue() {
        switch (type) {
            case integer:   return new Sym(EnumType.integer, 0);
            case decimal:   return new Sym(EnumType.decimal, 0);
            default:            return new Sym(EnumType.character, ' ');
        }
    }
    @Override
    public int getLine() {
        return this.line;
    }

    @Override
    public int getColumn() {
        return this.column;
    }    
    
}
