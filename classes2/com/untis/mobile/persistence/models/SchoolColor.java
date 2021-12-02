// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models;

import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\b¨\u0006\u0015" }, d2 = { "Lcom/untis/mobile/persistence/models/SchoolColor;", "", "", "background", "I", "getBackground", "()I", "setBackground", "(I)V", "Lcom/untis/mobile/persistence/models/SchoolColorType;", "type", "Lcom/untis/mobile/persistence/models/SchoolColorType;", "getType", "()Lcom/untis/mobile/persistence/models/SchoolColorType;", "setType", "(Lcom/untis/mobile/persistence/models/SchoolColorType;)V", "text", "getText", "setText", "<init>", "(Lcom/untis/mobile/persistence/models/SchoolColorType;II)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SchoolColor
{
    private int background;
    private int text;
    @e
    private SchoolColorType type;
    
    public SchoolColor() {
        this(null, 0, 0, 7, null);
    }
    
    public SchoolColor(@e final SchoolColorType type, final int text, final int background) {
        k0.p(type, "type");
        this.type = type;
        this.text = text;
        this.background = background;
    }
    
    public final int getBackground() {
        return this.background;
    }
    
    public final int getText() {
        return this.text;
    }
    
    @e
    public final SchoolColorType getType() {
        return this.type;
    }
    
    public final void setBackground(final int background) {
        this.background = background;
    }
    
    public final void setText(final int text) {
        this.text = text;
    }
    
    public final void setType(@e final SchoolColorType type) {
        k0.p(type, "<set-?>");
        this.type = type;
    }
}
