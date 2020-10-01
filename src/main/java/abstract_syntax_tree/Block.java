/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_syntax_tree;

import abstract_syntax_tree.environment.Environment;
import java.util.LinkedList;

/**
 *
 * @author zofia
 */
public class Block implements Instruction {
    private LinkedList<Function> functions;
    private int line, column;
    
    @Override
    public Object execute(Environment environment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
