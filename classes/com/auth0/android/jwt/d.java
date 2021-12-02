// 
// Decompiled by Procyon v0.5.36
// 

package com.auth0.android.jwt;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonArray;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Array;
import com.google.gson.Gson;
import androidx.annotation.k0;
import androidx.annotation.j0;
import com.google.gson.JsonElement;

class d extends a
{
    private final JsonElement a;
    
    d(@j0 final JsonElement a) {
        this.a = a;
    }
    
    @k0
    @Override
    public Long a() {
        if (!this.a.isJsonPrimitive()) {
            return null;
        }
        return this.a.getAsLong();
    }
    
    @k0
    @Override
    public Double b() {
        if (!this.a.isJsonPrimitive()) {
            return null;
        }
        return this.a.getAsDouble();
    }
    
    @k0
    @Override
    public String c() {
        if (!this.a.isJsonPrimitive()) {
            return null;
        }
        return this.a.getAsString();
    }
    
    @k0
    @Override
    public Boolean d() {
        if (!this.a.isJsonPrimitive()) {
            return null;
        }
        return this.a.getAsBoolean();
    }
    
    @Override
    public <T> T[] e(final Class<T> clazz) throws e {
        try {
            final boolean jsonArray = this.a.isJsonArray();
            int i = 0;
            if (jsonArray && !this.a.isJsonNull()) {
                final Gson gson = new Gson();
                final JsonArray asJsonArray = this.a.getAsJsonArray();
                final Object[] array = (Object[])Array.newInstance(clazz, asJsonArray.size());
                while (i < asJsonArray.size()) {
                    array[i] = gson.fromJson(asJsonArray.get(i), (Class)clazz);
                    ++i;
                }
                return (T[])array;
            }
            return (T[])Array.newInstance(clazz, 0);
        }
        catch (JsonSyntaxException ex) {
            throw new e("Failed to decode claim as array", (Throwable)ex);
        }
    }
    
    @Override
    public <T> List<T> f(final Class<T> clazz) throws e {
        try {
            if (this.a.isJsonArray() && !this.a.isJsonNull()) {
                final Gson gson = new Gson();
                final JsonArray asJsonArray = this.a.getAsJsonArray();
                final ArrayList<Object> list = new ArrayList<Object>();
                for (int i = 0; i < asJsonArray.size(); ++i) {
                    list.add(gson.fromJson(asJsonArray.get(i), (Class)clazz));
                }
                return (List<T>)list;
            }
            return new ArrayList<T>();
        }
        catch (JsonSyntaxException ex) {
            throw new e("Failed to decode claim as list", (Throwable)ex);
        }
    }
    
    @k0
    @Override
    public Integer g() {
        if (!this.a.isJsonPrimitive()) {
            return null;
        }
        return this.a.getAsInt();
    }
    
    @Override
    public <T> T h(final Class<T> clazz) throws e {
        try {
            if (this.a.isJsonNull()) {
                return null;
            }
            return (T)new Gson().fromJson(this.a, (Class)clazz);
        }
        catch (JsonSyntaxException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to decode claim as ");
            sb.append(clazz.getSimpleName());
            throw new e(sb.toString(), (Throwable)ex);
        }
    }
    
    @k0
    @Override
    public Date i() {
        if (!this.a.isJsonPrimitive()) {
            return null;
        }
        return new Date(Long.parseLong(this.a.getAsString()) * 1000L);
    }
}
