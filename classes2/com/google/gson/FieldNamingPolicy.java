// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson;

import java.util.Locale;
import java.lang.reflect.Field;

public enum FieldNamingPolicy implements FieldNamingStrategy
{
    IDENTITY(0) {
        @Override
        public String translateName(final Field field) {
            return field.getName();
        }
    }, 
    LOWER_CASE_WITH_DASHES(4) {
        @Override
        public String translateName(final Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    }, 
    LOWER_CASE_WITH_DOTS(5) {
        @Override
        public String translateName(final Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    }, 
    LOWER_CASE_WITH_UNDERSCORES(3) {
        @Override
        public String translateName(final Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    }, 
    UPPER_CAMEL_CASE(1) {
        @Override
        public String translateName(final Field field) {
            return FieldNamingPolicy.upperCaseFirstLetter(field.getName());
        }
    }, 
    UPPER_CAMEL_CASE_WITH_SPACES(2) {
        @Override
        public String translateName(final Field field) {
            return FieldNamingPolicy.upperCaseFirstLetter(FieldNamingPolicy.separateCamelCase(field.getName(), " "));
        }
    };
    
    static String separateCamelCase(final String s, final String str) {
        final StringBuilder sb = new StringBuilder();
        for (int length = s.length(), i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (Character.isUpperCase(char1) && sb.length() != 0) {
                sb.append(str);
            }
            sb.append(char1);
        }
        return sb.toString();
    }
    
    static String upperCaseFirstLetter(final String s) {
        int length;
        int endIndex;
        for (length = s.length(), endIndex = 0; !Character.isLetter(s.charAt(endIndex)) && endIndex < length - 1; ++endIndex) {}
        final char char1 = s.charAt(endIndex);
        if (Character.isUpperCase(char1)) {
            return s;
        }
        final char upperCase = Character.toUpperCase(char1);
        if (endIndex == 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append(upperCase);
            sb.append(s.substring(1));
            return sb.toString();
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s.substring(0, endIndex));
        sb2.append(upperCase);
        sb2.append(s.substring(endIndex + 1));
        return sb2.toString();
    }
}
