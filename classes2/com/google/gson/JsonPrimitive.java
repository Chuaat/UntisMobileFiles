// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.google.gson.internal.$Gson$Preconditions;

public final class JsonPrimitive extends JsonElement
{
    private final Object value;
    
    public JsonPrimitive(final Boolean b) {
        this.value = $Gson$Preconditions.checkNotNull(b);
    }
    
    public JsonPrimitive(final Character c) {
        this.value = $Gson$Preconditions.checkNotNull(c).toString();
    }
    
    public JsonPrimitive(final Number n) {
        this.value = $Gson$Preconditions.checkNotNull(n);
    }
    
    public JsonPrimitive(final String s) {
        this.value = $Gson$Preconditions.checkNotNull(s);
    }
    
    private static boolean isIntegral(final JsonPrimitive jsonPrimitive) {
        final Object value = jsonPrimitive.value;
        final boolean b = value instanceof Number;
        boolean b2 = false;
        if (b) {
            final Number n = (Number)value;
            if (!(n instanceof BigInteger) && !(n instanceof Long) && !(n instanceof Integer) && !(n instanceof Short)) {
                b2 = b2;
                if (!(n instanceof Byte)) {
                    return b2;
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    @Override
    public JsonPrimitive deepCopy() {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        final boolean b2 = true;
        boolean b3 = true;
        if (this == o) {
            return true;
        }
        if (o == null || JsonPrimitive.class != o.getClass()) {
            return false;
        }
        final JsonPrimitive jsonPrimitive = (JsonPrimitive)o;
        if (this.value == null) {
            if (jsonPrimitive.value != null) {
                b3 = false;
            }
            return b3;
        }
        if (isIntegral(this) && isIntegral(jsonPrimitive)) {
            return this.getAsNumber().longValue() == jsonPrimitive.getAsNumber().longValue() && b;
        }
        final Object value = this.value;
        if (value instanceof Number && jsonPrimitive.value instanceof Number) {
            final double doubleValue = this.getAsNumber().doubleValue();
            final double doubleValue2 = jsonPrimitive.getAsNumber().doubleValue();
            boolean b4 = b2;
            if (doubleValue != doubleValue2) {
                b4 = (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2) && b2);
            }
            return b4;
        }
        return value.equals(jsonPrimitive.value);
    }
    
    @Override
    public BigDecimal getAsBigDecimal() {
        final Object value = this.value;
        BigDecimal bigDecimal;
        if (value instanceof BigDecimal) {
            bigDecimal = (BigDecimal)value;
        }
        else {
            bigDecimal = new BigDecimal(this.value.toString());
        }
        return bigDecimal;
    }
    
    @Override
    public BigInteger getAsBigInteger() {
        final Object value = this.value;
        BigInteger bigInteger;
        if (value instanceof BigInteger) {
            bigInteger = (BigInteger)value;
        }
        else {
            bigInteger = new BigInteger(this.value.toString());
        }
        return bigInteger;
    }
    
    @Override
    public boolean getAsBoolean() {
        if (this.isBoolean()) {
            return (boolean)this.value;
        }
        return Boolean.parseBoolean(this.getAsString());
    }
    
    @Override
    public byte getAsByte() {
        byte b;
        if (this.isNumber()) {
            b = this.getAsNumber().byteValue();
        }
        else {
            b = Byte.parseByte(this.getAsString());
        }
        return b;
    }
    
    @Override
    public char getAsCharacter() {
        return this.getAsString().charAt(0);
    }
    
    @Override
    public double getAsDouble() {
        double n;
        if (this.isNumber()) {
            n = this.getAsNumber().doubleValue();
        }
        else {
            n = Double.parseDouble(this.getAsString());
        }
        return n;
    }
    
    @Override
    public float getAsFloat() {
        float n;
        if (this.isNumber()) {
            n = this.getAsNumber().floatValue();
        }
        else {
            n = Float.parseFloat(this.getAsString());
        }
        return n;
    }
    
    @Override
    public int getAsInt() {
        int n;
        if (this.isNumber()) {
            n = this.getAsNumber().intValue();
        }
        else {
            n = Integer.parseInt(this.getAsString());
        }
        return n;
    }
    
    @Override
    public long getAsLong() {
        long n;
        if (this.isNumber()) {
            n = this.getAsNumber().longValue();
        }
        else {
            n = Long.parseLong(this.getAsString());
        }
        return n;
    }
    
    @Override
    public Number getAsNumber() {
        final Object value = this.value;
        Number n;
        if (value instanceof String) {
            n = new LazilyParsedNumber((String)value);
        }
        else {
            n = (Number)value;
        }
        return n;
    }
    
    @Override
    public short getAsShort() {
        short n;
        if (this.isNumber()) {
            n = this.getAsNumber().shortValue();
        }
        else {
            n = Short.parseShort(this.getAsString());
        }
        return n;
    }
    
    @Override
    public String getAsString() {
        if (this.isNumber()) {
            return this.getAsNumber().toString();
        }
        if (this.isBoolean()) {
            return ((Boolean)this.value).toString();
        }
        return (String)this.value;
    }
    
    @Override
    public int hashCode() {
        if (this.value == null) {
            return 31;
        }
        long n;
        if (isIntegral(this)) {
            n = this.getAsNumber().longValue();
        }
        else {
            final Object value = this.value;
            if (!(value instanceof Number)) {
                return value.hashCode();
            }
            n = Double.doubleToLongBits(this.getAsNumber().doubleValue());
        }
        return (int)(n >>> 32 ^ n);
    }
    
    public boolean isBoolean() {
        return this.value instanceof Boolean;
    }
    
    public boolean isNumber() {
        return this.value instanceof Number;
    }
    
    public boolean isString() {
        return this.value instanceof String;
    }
}
