/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_syntax_tree.environment;

/**
 *
 * @author zofia
 */
public class GlobalError {
    private int row;
    private int column;
    private String type;
    private String value;
    private String description;

    public GlobalError(int row, int column, String type, String value, String description) {
        this.row = row;
        this.column = column;
        this.type = type;
        this.value = value;
        this.description = description;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Error en linea: " + row + " - columna: " + column + " - de tipo: " + type + "- dado en el valor: " + value + "- observacion: " + description;
    }
    
}
