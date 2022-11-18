package adapter;

import model.Persona;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class PersonaTableModel extends AbstractTableModel {

    private final String[] COLUMNAS = {"NOMBRES", "APELLIDOS", "EMAIL", "GENERO"};
    private List<Persona> personas;

    public PersonaTableModel(List<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public int getRowCount() {
        return personas.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNAS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch(columnIndex){
            case 0 -> personas.get(rowIndex).getNombres();
            case 1 -> personas.get(rowIndex).getApellidos();
            case 2 -> personas.get(rowIndex).getEmail();
            case 3 -> personas.get(rowIndex).getGenero();
            default -> "-";
        };
    }

    @Override
    public String getColumnName(int column) {
        return COLUMNAS[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(getValueAt(0,columnIndex) != null){
            return getValueAt(0, columnIndex).getClass();
        }else{
            return Object.class;
        }
    }
}
