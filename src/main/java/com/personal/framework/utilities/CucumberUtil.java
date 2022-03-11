package com.personal.framework.utilities;

import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;

public class CucumberUtil {


    private static final List<DataCollection> _dataCollection = new ArrayList<>();

    public static List<DataCollection> ConvertDataTableToDict(DataTable table) {
        _dataCollection.clear();
        List<List<String>> data = table.cells();
        int rowNumber = 0;
        for (List<String> col : data) {
            for (int colIndex = 0; colIndex < col.size(); colIndex++) {
                _dataCollection.add(rowNumber, new DataCollection(data.get(0).get(colIndex), col.get(colIndex), rowNumber));
            }
            rowNumber++;
        }
        return _dataCollection;
    }

    public static String GetCellValueWithRoeIndex(String columnname, int rowNumber) {
        final String[] columnValue = {null};
        _dataCollection.forEach(x -> {
            if (x.columnName.equals(columnname) && x.rowNumber == rowNumber) {
                columnValue[0] = x.columnValue;
            }
        });
        return columnValue[0];
    }

    private static class DataCollection {
        private final String columnName;
        private final String columnValue;
        private final int rowNumber;

        public DataCollection(String columnName, String columnValue, int rowNumber) {
            this.columnName = columnName;
            this.columnValue = columnValue;
            this.rowNumber = rowNumber;
        }

    }
}

