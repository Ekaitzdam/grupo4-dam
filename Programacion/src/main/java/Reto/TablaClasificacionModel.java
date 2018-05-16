package Reto;

import javax.swing.table.AbstractTableModel;

public class TablaClasificacionModel extends AbstractTableModel {

    private String[] columnas = {"Puesto", "Equipo", "Puntos"};


    @Override
    public int getRowCount() {
        return 8;
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }


    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}
