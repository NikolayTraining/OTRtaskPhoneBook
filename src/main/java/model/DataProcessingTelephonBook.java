package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataProcessingTelephonBook {
    private Map<String, List<String>> map = new HashMap<>();
    private List<String> list;
    private List<String> list2;

    public DataProcessingTelephonBook() {
        initBook();
    }

    private void initBook() {
        readClientData("Иванов И.И. +8 800 2000 500 +8 800 200 600");
        readClientData("Петров П.П. +8 800 2000 700");
        readClientData("Сидоров С.С. +8 800 2000 800 +8 800 2000 900 +8 800 2000 000");
    }

    private void readClientData(String s) {
        
    }



}
