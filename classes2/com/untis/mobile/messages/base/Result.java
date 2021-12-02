// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.base;

import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u001e\u001fB#\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0004\u001a\u00020\u0003H\u00c6\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J8\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003R\u0019\u0010\t\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\n\u001a\u0004\u0018\u00018\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 " }, d2 = { "Lcom/untis/mobile/messages/base/Result;", "DATA", "", "Lcom/untis/mobile/messages/base/Result$Status;", "component1", "component2", "()Ljava/lang/Object;", "", "component3", "status", "data", "message", "copy", "(Lcom/untis/mobile/messages/base/Result$Status;Ljava/lang/Object;Ljava/lang/String;)Lcom/untis/mobile/messages/base/Result;", "toString", "", "hashCode", "other", "", "equals", "Lcom/untis/mobile/messages/base/Result$Status;", "getStatus", "()Lcom/untis/mobile/messages/base/Result$Status;", "Ljava/lang/Object;", "getData", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(Lcom/untis/mobile/messages/base/Result$Status;Ljava/lang/Object;Ljava/lang/String;)V", "Companion", "Status", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Result<DATA>
{
    @e
    public static final Companion Companion;
    @f
    private final DATA data;
    @f
    private final String message;
    @e
    private final Status status;
    
    static {
        Companion = new Companion(null);
    }
    
    public Result(@e final Status status, @f final DATA data, @f final String message) {
        k0.p(status, "status");
        this.status = status;
        this.data = data;
        this.message = message;
    }
    
    @e
    public final Status component1() {
        return this.status;
    }
    
    @f
    public final DATA component2() {
        return this.data;
    }
    
    @f
    public final String component3() {
        return this.message;
    }
    
    @e
    public final Result<DATA> copy(@e final Status status, @f final DATA data, @f final String s) {
        k0.p(status, "status");
        return new Result<DATA>(status, data, s);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Result)) {
            return false;
        }
        final Result result = (Result)o;
        return this.status == result.status && k0.g(this.data, result.data) && k0.g(this.message, result.message);
    }
    
    @f
    public final DATA getData() {
        return this.data;
    }
    
    @f
    public final String getMessage() {
        return this.message;
    }
    
    @e
    public final Status getStatus() {
        return this.status;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.status.hashCode();
        final DATA data = this.data;
        int hashCode2 = 0;
        int hashCode3;
        if (data == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = data.hashCode();
        }
        final String message = this.message;
        if (message != null) {
            hashCode2 = message.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Result(status=");
        sb.append(this.status);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", message=");
        sb.append((Object)this.message);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/messages/base/Result$Companion;", "", "DATA", "data", "Lcom/untis/mobile/messages/base/Result;", "success", "(Ljava/lang/Object;)Lcom/untis/mobile/messages/base/Result;", "", "message", "error", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/untis/mobile/messages/base/Result;", "loading", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final <DATA> Result<DATA> error(@e final String s, @f final DATA data) {
            k0.p(s, "message");
            return new Result<DATA>(Status.ERROR, data, s);
        }
        
        @e
        public final <DATA> Result<DATA> loading(@f final DATA data) {
            return new Result<DATA>(Status.LOADING, data, null);
        }
        
        @e
        public final <DATA> Result<DATA> success(final DATA data) {
            return new Result<DATA>(Status.SUCCESS, data, null);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007" }, d2 = { "Lcom/untis/mobile/messages/base/Result$Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "LOADING", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public enum Status
    {
        ERROR, 
        LOADING, 
        SUCCESS;
        
        private static final /* synthetic */ Status[] $values() {
            return new Status[] { Status.SUCCESS, Status.ERROR, Status.LOADING };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
