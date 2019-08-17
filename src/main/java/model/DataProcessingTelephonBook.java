package model;

import java.util.ArrayList;
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
        list2 = new ArrayList<>();
        String[] vordsParts = s.split("\\s\\+");
        addListTelephon(vordsParts);
        for (int i = 1; i < vordsParts.length; i++) {
            list2.add("+" + vordsParts[i]);
        }
        putMapBook(vordsParts[0], (ArrayList<String>) list2);

    }

    private void putMapBook(String keyValueName, ArrayList<String> arrayList) {
        map.put(keyValueName, arrayList);
    }

    private ArrayList<String> addListTelephon(String[] tel) {
        list = new ArrayList<>();
        for (int i = 1; i < tel.length; i++) {
            list.add(tel[i]);
        }
        return (ArrayList<String>) list;
    }


}
