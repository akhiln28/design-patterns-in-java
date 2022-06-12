package com.designpatterns.builder;

import java.util.HashMap;
import java.util.Map;

class CodeBuilder
{
    String className;
    Map<String, String> fields;
    public CodeBuilder(String className)
    {
        // todo
        this.className = className;
        fields = new HashMap<>();
    }

    public CodeBuilder addField(String name, String type)
    {
        fields.put(name, type);
        return this;
    }

    @Override
    public String toString()
    {
        // todo
        StringBuilder str = new StringBuilder();
        str.append("public class ");
        str.append(className);
        str.append("\n");
        str.append("{");
        str.append("\n");
        String indent = "  ";
        for (String key : fields.keySet()) {
            str.append(indent + "public ");
            str.append(fields.get(key));
            str.append(" ");
            str.append(key);
            str.append(";");
            str.append("\n");
        }
        str.append("}");
        return str.toString();
    }
}

/**
 * CdBuilder
 */
public class CdBuilder {

    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("myclass");
        cb.addField("name", "String");
        cb.addField("height", "Integer");
        System.out.println(cb.toString());
    }
}