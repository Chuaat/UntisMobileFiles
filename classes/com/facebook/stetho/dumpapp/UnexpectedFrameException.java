// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.dumpapp;

class UnexpectedFrameException extends DumpappFramingException
{
    public UnexpectedFrameException(final byte i, final byte j) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected '");
        sb.append(i);
        sb.append("', got: '");
        sb.append(j);
        sb.append("'");
        super(sb.toString());
    }
}
