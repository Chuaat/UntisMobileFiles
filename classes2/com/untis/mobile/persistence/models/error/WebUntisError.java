// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.error;

import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/persistence/models/error/WebUntisError;", "", "", "description", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class WebUntisError
{
    @f
    private String description;
    @e
    private String title;
    
    public WebUntisError(@e final String title, @f final String description) {
        k0.p(title, "title");
        this.title = title;
        this.description = description;
    }
    
    @f
    public final String getDescription() {
        return this.description;
    }
    
    @e
    public final String getTitle() {
        return this.title;
    }
    
    public final void setDescription(@f final String description) {
        this.description = description;
    }
    
    public final void setTitle(@e final String title) {
        k0.p(title, "<set-?>");
        this.title = title;
    }
}
