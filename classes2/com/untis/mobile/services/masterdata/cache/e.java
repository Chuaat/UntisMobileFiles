// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.masterdata.cache;

import java.util.ArrayList;
import org.jetbrains.annotations.f;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import java.util.List;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.Entity;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H$J\u0019\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0005H$¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H$J\u0016\u0010\u0010\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H$J\b\u0010\u0011\u001a\u00020\rH$J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007J\u0017\u0010\u0013\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u001c\u0010\u0017\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0016\u001a\u00020\u0015J\u0014\u0010\u0018\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u0006\u0010\u0019\u001a\u00020\rJ\b\u0010\u001a\u001a\u00020\rH\u0016R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d¨\u0006!" }, d2 = { "Lcom/untis/mobile/services/masterdata/cache/e;", "Lcom/untis/mobile/persistence/models/Entity;", "Target", "", "", "", "j", "", "f", "id", "i", "(J)Lcom/untis/mobile/persistence/models/Entity;", "targets", "Lkotlin/j2;", "m", "ids", "d", "c", "e", "g", "h", "", "deleteOld", "l", "b", "a", "k", "Ljava/util/Map;", "cache", "Z", "allLoaded", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public abstract class e<Target extends Entity>
{
    @org.jetbrains.annotations.e
    private Map<Long, Target> a;
    private boolean b;
    
    public e() {
        this.a = new HashMap<Long, Target>();
    }
    
    private final Map<Long, Target> j() {
        if (this.b) {
            return this.a;
        }
        this.a.clear();
        for (final Entity entity : this.f()) {
            this.a.put(entity.entityId(), (Target)entity);
        }
        this.b = true;
        return this.a;
    }
    
    public final void a() {
        this.c();
        this.k();
    }
    
    public final void b(@org.jetbrains.annotations.e final List<Long> list) {
        k0.p(list, "ids");
        this.d(list);
        this.k();
    }
    
    protected abstract void c();
    
    protected abstract void d(@org.jetbrains.annotations.e final List<Long> p0);
    
    @org.jetbrains.annotations.e
    public final List<Target> e() {
        return v.I5((Iterable<? extends Target>)this.j().values());
    }
    
    @org.jetbrains.annotations.e
    protected abstract List<Target> f();
    
    @f
    public final Target g(final long l) {
        return this.j().get(l);
    }
    
    @org.jetbrains.annotations.e
    public final List<Target> h(@org.jetbrains.annotations.e final List<Long> list) {
        k0.p(list, "ids");
        final Map<Long, Entity> j = (Map<Long, Entity>)this.j();
        final ArrayList<Entity> list2 = (ArrayList<Entity>)new ArrayList<Target>();
        final Iterator<Number> iterator = list.iterator();
        while (iterator.hasNext()) {
            final Entity entity = j.get(iterator.next().longValue());
            if (entity != null) {
                list2.add(entity);
            }
        }
        return (List<Target>)list2;
    }
    
    @f
    protected abstract Target i(final long p0);
    
    public void k() {
        this.a.clear();
        this.b = false;
    }
    
    public final void l(@org.jetbrains.annotations.e final List<? extends Target> list, final boolean b) {
        k0.p(list, "targets");
        if (b) {
            this.a.clear();
            this.b = false;
            this.a();
        }
        this.m(list);
        for (final Entity entity : list) {
            this.a.put(entity.entityId(), (Target)entity);
        }
    }
    
    protected abstract void m(@org.jetbrains.annotations.e final List<? extends Target> p0);
}
