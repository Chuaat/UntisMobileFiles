// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.enumeration;

public enum ElementType
{
    APPRENTICE_REPRESENTATIVE(21), 
    CLASS(1), 
    LEGAL_GUARDIAN(12), 
    @Deprecated
    PARENT(15), 
    ROOM(4), 
    STUDENT(5), 
    SUBJECT(3), 
    TEACHER(2);
    
    private final int wuType;
    
    private ElementType(final int wuType) {
        this.wuType = wuType;
    }
    
    public static ElementType fromWebUntisType(final byte b) {
        for (final ElementType elementType : values()) {
            if (elementType.getWuType() == b) {
                return elementType;
            }
        }
        return null;
    }
    
    public int getWuType() {
        return this.wuType;
    }
}
