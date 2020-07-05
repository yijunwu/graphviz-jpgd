package com.alexmerz.graphviz;

public class Helper {

    public static boolean needsQuote(String attr) {
        return attr.equals("") || attr.contains(" ") || attr.contains(",") || attr.contains(".")
                || attr.contains("$") || attr.contains("_") || attr.contains("\\");
    }

}
