// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.Arrays;
import c6.h;
import java.util.Iterator;
import java.io.Serializable;
import io.realm.internal.Table;
import java.util.Locale;
import org.bson.types.ObjectId;
import org.bson.types.Decimal128;
import java.util.Date;
import io.realm.internal.OsList;
import io.realm.internal.UncheckedRow;
import io.realm.internal.r;
import io.realm.internal.p;

public class k extends p0 implements p
{
    static final String K = "Queries across relationships are not supported";
    private final c0<k> J;
    
    k(final io.realm.a a, final r r) {
        final c0<k> j = new c0<k>(this);
        (this.J = j).r(a);
        j.s(r);
        j.p();
    }
    
    public k(final n0 obj) {
        final c0<k> j = new c0<k>(this);
        this.J = j;
        if (obj == null) {
            throw new IllegalArgumentException("A non-null object must be provided.");
        }
        if (obj instanceof k) {
            final StringBuilder sb = new StringBuilder();
            sb.append("The object is already a DynamicRealmObject: ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString());
        }
        if (!p0.j8(obj)) {
            throw new IllegalArgumentException("An object managed by Realm must be provided. This is an unmanaged object.");
        }
        if (p0.k8(obj)) {
            final p p = (p)obj;
            final r g = p.S6().g();
            j.r(p.S6().f());
            j.s(((UncheckedRow)g).a());
            j.p();
            return;
        }
        throw new IllegalArgumentException("A valid object managed by Realm must be provided. This object was deleted.");
    }
    
    private <E> s<E> M8(final io.realm.a a, final OsList list, final RealmFieldType realmFieldType, final Class<E> clazz) {
        if (realmFieldType == RealmFieldType.STRING_LIST) {
            return (s<E>)new w0(a, list, (Class<String>)clazz);
        }
        if (realmFieldType == RealmFieldType.INTEGER_LIST) {
            return new io.realm.r<E>(a, list, clazz);
        }
        if (realmFieldType == RealmFieldType.BOOLEAN_LIST) {
            return (s<E>)new c(a, list, (Class<Boolean>)clazz);
        }
        if (realmFieldType == RealmFieldType.BINARY_LIST) {
            return (s<E>)new b(a, list, (Class<byte[]>)clazz);
        }
        if (realmFieldType == RealmFieldType.DOUBLE_LIST) {
            return (s<E>)new io.realm.i(a, list, (Class<Double>)clazz);
        }
        if (realmFieldType == RealmFieldType.FLOAT_LIST) {
            return (s<E>)new m(a, list, (Class<Float>)clazz);
        }
        if (realmFieldType == RealmFieldType.DATE_LIST) {
            return (s<E>)new f(a, list, (Class<Date>)clazz);
        }
        if (realmFieldType == RealmFieldType.DECIMAL128_LIST) {
            return (s<E>)new g(a, list, (Class<Decimal128>)clazz);
        }
        if (realmFieldType == RealmFieldType.OBJECT_ID_LIST) {
            return (s<E>)new x(a, list, (Class<ObjectId>)clazz);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected list type: ");
        sb.append(realmFieldType.name());
        throw new IllegalArgumentException(sb.toString());
    }
    
    private void e9(String anObject, final l0<k> l0) {
        final OsList p2 = this.J.g().p(this.J.g().B(anObject));
        final Table u = p2.u();
        final String z = u.z();
        anObject = l0.H;
        final int n = 0;
        boolean b;
        if (anObject == null && l0.G == null) {
            b = false;
        }
        else {
            if (anObject == null) {
                anObject = this.J.f().H().o(l0.G).z();
            }
            if (!z.equals(anObject)) {
                throw new IllegalArgumentException(String.format(Locale.US, "The elements in the list are not the proper type. Was %s expected %s.", anObject, z));
            }
            b = true;
        }
        final int size = l0.size();
        final long[] array = new long[size];
        for (int i = 0; i < size; ++i) {
            final k k = l0.get(i);
            if (k.S6().f() != this.J.f()) {
                throw new IllegalArgumentException("Each element in 'list' must belong to the same Realm instance.");
            }
            if (!b && !u.T(k.S6().g().g())) {
                throw new IllegalArgumentException(String.format(Locale.US, "Element at index %d is not the proper type. Was '%s' expected '%s'.", i, k.S6().g().g().z(), z));
            }
            array[i] = k.S6().g().l0();
        }
        p2.M();
        for (int j = n; j < size; ++j) {
            p2.l(array[j]);
        }
    }
    
    private void k9(final String s, final Object o) {
        final Class<?> class1 = o.getClass();
        if (class1 == Boolean.class) {
            this.V8(s, (boolean)o);
        }
        else if (class1 == Short.class) {
            this.i9(s, (short)o);
        }
        else if (class1 == Integer.class) {
            this.b9(s, (int)o);
        }
        else if (class1 == Long.class) {
            this.d9(s, (long)o);
        }
        else if (class1 == Byte.class) {
            this.W8(s, (byte)o);
        }
        else if (class1 == Float.class) {
            this.a9(s, (float)o);
        }
        else if (class1 == Double.class) {
            this.Z8(s, (double)o);
        }
        else if (class1 == String.class) {
            this.j9(s, (String)o);
        }
        else if (o instanceof Date) {
            this.X8(s, (Date)o);
        }
        else if (o instanceof byte[]) {
            this.U8(s, (byte[])o);
        }
        else if (class1 == k.class) {
            this.g9(s, (k)o);
        }
        else if (class1 == l0.class) {
            this.c9(s, (l0<Object>)o);
        }
        else if (class1 == Decimal128.class) {
            this.Y8(s, (Decimal128)o);
        }
        else {
            if (class1 != ObjectId.class) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Value is of an type not supported: ");
                sb.append(o.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
            this.h9(s, (ObjectId)o);
        }
    }
    
    private <E> void l9(final String s, final l0<E> l0, final RealmFieldType obj) {
        final OsList v = this.J.g().V(this.J.g().B(s), obj);
        Serializable s2 = null;
        switch (k$a.a[obj.ordinal()]) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unsupported type: ");
                sb.append(obj);
                throw new IllegalArgumentException(sb.toString());
            }
            case 21: {
                s2 = ObjectId.class;
                break;
            }
            case 20: {
                s2 = Decimal128.class;
                break;
            }
            case 19: {
                s2 = Double.class;
                break;
            }
            case 18: {
                s2 = Float.class;
                break;
            }
            case 17: {
                s2 = Date.class;
                break;
            }
            case 16: {
                s2 = byte[].class;
                break;
            }
            case 15: {
                s2 = String.class;
                break;
            }
            case 14: {
                s2 = Boolean.class;
                break;
            }
            case 13: {
                s2 = Long.class;
                break;
            }
        }
        final s<Object> m8 = this.M8(this.J.f(), v, obj, (Class<Object>)s2);
        if (l0.G0() && v.b0() == l0.size()) {
            final int size = l0.size();
            final Iterator<E> iterator = l0.iterator();
            for (int i = 0; i < size; ++i) {
                m8.s(i, iterator.next());
            }
        }
        else {
            v.M();
            final Iterator<E> iterator2 = l0.iterator();
            while (iterator2.hasNext()) {
                m8.a(iterator2.next());
            }
        }
    }
    
    private void s8(final String s, final long n, final RealmFieldType realmFieldType) {
        final RealmFieldType b0 = this.J.g().b0(n);
        if (b0 != realmFieldType) {
            final RealmFieldType integer = RealmFieldType.INTEGER;
            final String s2 = "n";
            String s3;
            if (realmFieldType != integer && realmFieldType != RealmFieldType.OBJECT) {
                s3 = "";
            }
            else {
                s3 = "n";
            }
            String s4 = s2;
            if (b0 != integer) {
                if (b0 == RealmFieldType.OBJECT) {
                    s4 = s2;
                }
                else {
                    s4 = "";
                }
            }
            throw new IllegalArgumentException(String.format(Locale.US, "'%s' is not a%s '%s', but a%s '%s'.", s, s3, realmFieldType, s4, b0));
        }
    }
    
    private void t8(final String anObject) {
        final r0 n = this.J.f().H().n(this.P8());
        if (n.y() && n.r().equals(anObject)) {
            throw new IllegalArgumentException(String.format(Locale.US, "Primary key field '%s' cannot be changed after object was created.", anObject));
        }
    }
    
    private <E> RealmFieldType u8(final Class<E> obj) {
        if (obj.equals(Integer.class) || obj.equals(Long.class) || obj.equals(Short.class) || obj.equals(Byte.class)) {
            return RealmFieldType.INTEGER_LIST;
        }
        if (obj.equals(Boolean.class)) {
            return RealmFieldType.BOOLEAN_LIST;
        }
        if (obj.equals(String.class)) {
            return RealmFieldType.STRING_LIST;
        }
        if (obj.equals(byte[].class)) {
            return RealmFieldType.BINARY_LIST;
        }
        if (obj.equals(Date.class)) {
            return RealmFieldType.DATE_LIST;
        }
        if (obj.equals(Float.class)) {
            return RealmFieldType.FLOAT_LIST;
        }
        if (obj.equals(Double.class)) {
            return RealmFieldType.DOUBLE_LIST;
        }
        if (obj.equals(Decimal128.class)) {
            return RealmFieldType.DECIMAL128_LIST;
        }
        if (obj.equals(ObjectId.class)) {
            return RealmFieldType.OBJECT_ID_LIST;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unsupported element type. Only primitive types supported. Yours was: ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public Decimal128 A8(final String s) {
        this.J.f().h();
        final long b = this.J.g().B(s);
        this.s8(s, b, RealmFieldType.DECIMAL128);
        if (this.J.g().y(b)) {
            return null;
        }
        return this.J.g().b(b);
    }
    
    public double B8(final String s) {
        this.J.f().h();
        final long b = this.J.g().B(s);
        try {
            return this.J.g().O(b);
        }
        catch (IllegalArgumentException ex) {
            this.s8(s, b, RealmFieldType.DOUBLE);
            throw ex;
        }
    }
    
    public j C8() {
        final io.realm.a f = this.S6().f();
        f.h();
        if (this.T()) {
            return (j)f;
        }
        throw new IllegalStateException("the object is already deleted.");
    }
    
    public String[] D8() {
        this.J.f().h();
        return this.J.g().getColumnNames();
    }
    
    public RealmFieldType E8(final String s) {
        this.J.f().h();
        return this.J.g().b0(this.J.g().B(s));
    }
    
    public float F8(final String s) {
        this.J.f().h();
        final long b = this.J.g().B(s);
        try {
            return this.J.g().Q(b);
        }
        catch (IllegalArgumentException ex) {
            this.s8(s, b, RealmFieldType.FLOAT);
            throw ex;
        }
    }
    
    public int G8(final String s) {
        return (int)this.J8(s);
    }
    
    public l0<k> H8(final String s) {
        this.J.f().h();
        final long b = this.J.g().B(s);
        try {
            final OsList p = this.J.g().p(b);
            return new l0<k>(p.u().z(), p, this.J.f());
        }
        catch (IllegalArgumentException ex) {
            this.s8(s, b, RealmFieldType.LIST);
            throw ex;
        }
    }
    
    public <E> l0<E> I8(final String s, final Class<E> clazz) {
        this.J.f().h();
        if (clazz != null) {
            final long b = this.J.g().B(s);
            final RealmFieldType u8 = this.u8(clazz);
            try {
                return new l0<E>((Class<Object>)clazz, this.J.g().V(b, u8), this.J.f());
            }
            catch (IllegalArgumentException ex) {
                this.s8(s, b, u8);
                throw ex;
            }
        }
        throw new IllegalArgumentException("Non-null 'primitiveType' required.");
    }
    
    public long J8(final String s) {
        this.J.f().h();
        final long b = this.J.g().B(s);
        try {
            return this.J.g().m(b);
        }
        catch (IllegalArgumentException ex) {
            this.s8(s, b, RealmFieldType.INTEGER);
            throw ex;
        }
    }
    
    @h
    public k K8(final String s) {
        this.J.f().h();
        final long b = this.J.g().B(s);
        this.s8(s, b, RealmFieldType.OBJECT);
        if (this.J.g().G(b)) {
            return null;
        }
        return new k(this.J.f(), this.J.g().g().K(b).y(this.J.g().P(b)));
    }
    
    public ObjectId L8(final String s) {
        this.J.f().h();
        final long b = this.J.g().B(s);
        this.s8(s, b, RealmFieldType.OBJECT_ID);
        if (this.J.g().y(b)) {
            return null;
        }
        return this.J.g().k(b);
    }
    
    public short N8(final String s) {
        return (short)this.J8(s);
    }
    
    public String O8(final String s) {
        this.J.f().h();
        final long b = this.J.g().B(s);
        try {
            return this.J.g().U(b);
        }
        catch (IllegalArgumentException ex) {
            this.s8(s, b, RealmFieldType.STRING);
            throw ex;
        }
    }
    
    public String P8() {
        this.J.f().h();
        return this.J.g().g().z();
    }
    
    public boolean Q8(final String s) {
        this.J.f().h();
        return s != null && !s.isEmpty() && this.J.g().j(s);
    }
    
    public boolean R8(final String s) {
        this.J.f().h();
        final long b = this.J.g().B(s);
        switch (k$a.a[this.J.g().b0(b).ordinal()]) {
            default: {
                return false;
            }
            case 10: {
                return this.J.g().G(b);
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: {
                return this.J.g().y(b);
            }
        }
    }
    
    @Override
    public c0 S6() {
        return this.J;
    }
    
    public s0<k> S8(final String str, final String s) {
        final j j = (j)this.J.f();
        j.h();
        this.J.g().M();
        final r0 h = j.H().h(str);
        if (h == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Class not found: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        if (s == null) {
            throw new IllegalArgumentException("Non-null 'srcFieldName' required.");
        }
        if (!s.contains(".")) {
            final RealmFieldType q = h.q(s);
            final RealmFieldType object = RealmFieldType.OBJECT;
            if (q != object) {
                final RealmFieldType list = RealmFieldType.LIST;
                if (q != list) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected field type: %1$s. Field type should be either %2$s.%3$s or %2$s.%4$s.", q.name(), RealmFieldType.class.getSimpleName(), object.name(), list.name()));
                }
            }
            return s0.E(j, (UncheckedRow)this.J.g(), h.v(), s);
        }
        throw new IllegalArgumentException("Queries across relationships are not supported");
    }
    
    public void T8(final String s, final Object o) {
        this.J.f().h();
        final boolean b = o instanceof String;
        String s2;
        if (b) {
            s2 = (String)o;
        }
        else {
            s2 = null;
        }
        final RealmFieldType b2 = this.J.g().b0(this.J.g().B(s));
        Object o2 = o;
        if (b) {
            o2 = o;
            if (b2 != RealmFieldType.STRING) {
                final int n = k$a.a[b2.ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                if (n != 7) {
                                    if (n != 8) {
                                        if (n != 9) {
                                            throw new IllegalArgumentException(String.format(Locale.US, "Field %s is not a String field, and the provide value could not be automatically converted: %s. Use a typedsetter instead", s, o));
                                        }
                                        o2 = new ObjectId(s2);
                                    }
                                    else {
                                        o2 = Decimal128.y(s2);
                                    }
                                }
                                else {
                                    o2 = io.realm.internal.android.c.b(s2);
                                }
                            }
                            else {
                                o2 = Double.parseDouble(s2);
                            }
                        }
                        else {
                            o2 = Float.parseFloat(s2);
                        }
                    }
                    else {
                        o2 = Long.parseLong(s2);
                    }
                }
                else {
                    o2 = Boolean.parseBoolean(s2);
                }
            }
        }
        if (o2 == null) {
            this.f9(s);
        }
        else {
            this.k9(s, o2);
        }
    }
    
    public void U8(final String s, @h final byte[] array) {
        this.J.f().h();
        this.J.g().k0(this.J.g().B(s), array);
    }
    
    public void V8(final String s, final boolean b) {
        this.J.f().h();
        this.J.g().i(this.J.g().B(s), b);
    }
    
    public void W8(final String s, final byte b) {
        this.J.f().h();
        this.t8(s);
        this.J.g().s(this.J.g().B(s), b);
    }
    
    public void X8(final String s, @h final Date date) {
        this.J.f().h();
        final long b = this.J.g().B(s);
        final r g = this.J.g();
        if (date == null) {
            g.I(b);
        }
        else {
            g.a0(b, date);
        }
    }
    
    public void Y8(final String s, @h final Decimal128 decimal128) {
        this.J.f().h();
        final long b = this.J.g().B(s);
        final r g = this.J.g();
        if (decimal128 == null) {
            g.I(b);
        }
        else {
            g.v(b, decimal128);
        }
    }
    
    public void Z8(final String s, final double n) {
        this.J.f().h();
        this.J.g().c0(this.J.g().B(s), n);
    }
    
    public void a9(final String s, final float n) {
        this.J.f().h();
        this.J.g().f(this.J.g().B(s), n);
    }
    
    public void b9(final String s, final int n) {
        this.J.f().h();
        this.t8(s);
        this.J.g().s(this.J.g().B(s), n);
    }
    
    public <E> void c9(final String s, final l0<E> l0) {
        this.J.f().h();
        if (l0 != null) {
            final RealmFieldType b0 = this.J.g().b0(this.J.g().B(s));
            switch (k$a.a[b0.ordinal()]) {
                default: {
                    throw new IllegalArgumentException(String.format("Field '%s' is not a list but a %s", s, b0));
                }
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21: {
                    this.l9(s, l0, b0);
                    break;
                }
                case 11: {
                    if (!l0.isEmpty()) {
                        final E o2 = l0.o2();
                        if (!(o2 instanceof k)) {
                            if (n0.class.isAssignableFrom(o2.getClass())) {
                                throw new IllegalArgumentException("RealmList must contain `DynamicRealmObject's, not Java model classes.");
                            }
                        }
                    }
                    this.e9(s, (l0<k>)l0);
                    break;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Non-null 'list' required");
    }
    
    public void d9(final String s, final long n) {
        this.J.f().h();
        this.t8(s);
        this.J.g().s(this.J.g().B(s), n);
    }
    
    @Override
    public boolean equals(final Object o) {
        this.J.f().h();
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final k k = (k)o;
            final String path = this.J.f().getPath();
            final String path2 = k.J.f().getPath();
            Label_0088: {
                if (path != null) {
                    if (path.equals(path2)) {
                        break Label_0088;
                    }
                }
                else if (path2 == null) {
                    break Label_0088;
                }
                return false;
            }
            final String m = this.J.g().g().M();
            final String i = k.J.g().g().M();
            Label_0144: {
                if (m != null) {
                    if (m.equals(i)) {
                        break Label_0144;
                    }
                }
                else if (i == null) {
                    break Label_0144;
                }
                return false;
            }
            if (this.J.g().l0() != k.J.g().l0()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public void f9(final String s) {
        this.J.f().h();
        final long b = this.J.g().B(s);
        if (this.J.g().b0(b) == RealmFieldType.OBJECT) {
            this.J.g().z(b);
        }
        else {
            this.t8(s);
            this.J.g().I(b);
        }
    }
    
    public void g9(final String s, @h final k k) {
        this.J.f().h();
        final long b = this.J.g().B(s);
        if (k == null) {
            this.J.g().z(b);
        }
        else {
            if (k.J.f() == null || k.J.g() == null) {
                throw new IllegalArgumentException("Cannot link to objects that are not part of the Realm.");
            }
            if (this.J.f() != k.J.f()) {
                throw new IllegalArgumentException("Cannot add an object from another Realm instance.");
            }
            final Table i = this.J.g().g().K(b);
            final Table g = k.J.g().g();
            if (!i.T(g)) {
                throw new IllegalArgumentException(String.format(Locale.US, "Type of object is wrong. Was %s, expected %s", g.M(), i.M()));
            }
            this.J.g().o(b, k.J.g().l0());
        }
    }
    
    public void h9(final String s, @h final ObjectId objectId) {
        this.J.f().h();
        final long b = this.J.g().B(s);
        final r g = this.J.g();
        if (objectId == null) {
            g.I(b);
        }
        else {
            g.E(b, objectId);
        }
    }
    
    @Override
    public int hashCode() {
        this.J.f().h();
        final String path = this.J.f().getPath();
        final String m = this.J.g().g().M();
        final long l0 = this.J.g().l0();
        int hashCode = 0;
        int hashCode2;
        if (path != null) {
            hashCode2 = path.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        if (m != null) {
            hashCode = m.hashCode();
        }
        return ((527 + hashCode2) * 31 + hashCode) * 31 + (int)(l0 >>> 32 ^ l0);
    }
    
    public void i9(final String s, final short n) {
        this.J.f().h();
        this.t8(s);
        this.J.g().s(this.J.g().B(s), n);
    }
    
    public void j9(final String s, @h final String s2) {
        this.J.f().h();
        this.t8(s);
        this.J.g().d(this.J.g().B(s), s2);
    }
    
    @Override
    public String toString() {
        this.J.f().h();
        if (!this.J.g().T()) {
            return "Invalid object";
        }
        final String z = this.J.g().g().z();
        final StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(" = dynamic[");
        final StringBuilder sb2 = new StringBuilder(sb.toString());
        for (final String str : this.D8()) {
            final long b = this.J.g().B(str);
            final RealmFieldType b2 = this.J.g().b0(b);
            sb2.append("{");
            sb2.append(str);
            sb2.append(":");
            final int n = k$a.a[b2.ordinal()];
            Object o = "null";
            Label_1098: {
                Label_1092: {
                    String str2 = null;
                    switch (n) {
                        default: {
                            str2 = "?";
                            break;
                        }
                        case 21: {
                            str2 = String.format(Locale.US, "RealmList<ObjectId>[%s]", this.J.g().V(b, b2).b0());
                            break;
                        }
                        case 20: {
                            str2 = String.format(Locale.US, "RealmList<Decimal128>[%s]", this.J.g().V(b, b2).b0());
                            break;
                        }
                        case 19: {
                            str2 = String.format(Locale.US, "RealmList<Double>[%s]", this.J.g().V(b, b2).b0());
                            break;
                        }
                        case 18: {
                            str2 = String.format(Locale.US, "RealmList<Float>[%s]", this.J.g().V(b, b2).b0());
                            break;
                        }
                        case 17: {
                            str2 = String.format(Locale.US, "RealmList<Date>[%s]", this.J.g().V(b, b2).b0());
                            break;
                        }
                        case 16: {
                            str2 = String.format(Locale.US, "RealmList<byte[]>[%s]", this.J.g().V(b, b2).b0());
                            break;
                        }
                        case 15: {
                            str2 = String.format(Locale.US, "RealmList<String>[%s]", this.J.g().V(b, b2).b0());
                            break;
                        }
                        case 14: {
                            str2 = String.format(Locale.US, "RealmList<Boolean>[%s]", this.J.g().V(b, b2).b0());
                            break;
                        }
                        case 13: {
                            str2 = String.format(Locale.US, "RealmList<Long>[%s]", this.J.g().V(b, b2).b0());
                            break;
                        }
                        case 11: {
                            str2 = String.format(Locale.US, "RealmList<%s>[%s]", this.J.g().g().K(b).z(), this.J.g().p(b).b0());
                            break;
                        }
                        case 10: {
                            if (!this.J.g().G(b)) {
                                o = this.J.g().g().K(b).z();
                            }
                            sb2.append((String)o);
                            break Label_1098;
                        }
                        case 9: {
                            if (this.J.g().y(b)) {
                                break Label_1092;
                            }
                            o = this.J.g().k(b);
                            break Label_1092;
                        }
                        case 8: {
                            if (this.J.g().y(b)) {
                                break Label_1092;
                            }
                            o = this.J.g().b(b);
                            break Label_1092;
                        }
                        case 7: {
                            if (this.J.g().y(b)) {
                                break Label_1092;
                            }
                            o = this.J.g().u(b);
                            break Label_1092;
                        }
                        case 6: {
                            str2 = Arrays.toString(this.J.g().K(b));
                            break;
                        }
                        case 5: {
                            str2 = this.J.g().U(b);
                            break;
                        }
                        case 4: {
                            if (this.J.g().y(b)) {
                                break Label_1092;
                            }
                            o = this.J.g().O(b);
                            break Label_1092;
                        }
                        case 3: {
                            if (this.J.g().y(b)) {
                                break Label_1092;
                            }
                            o = this.J.g().Q(b);
                            break Label_1092;
                        }
                        case 2: {
                            if (this.J.g().y(b)) {
                                break Label_1092;
                            }
                            o = this.J.g().m(b);
                            break Label_1092;
                        }
                        case 1: {
                            if (this.J.g().y(b)) {
                                break Label_1092;
                            }
                            o = this.J.g().l(b);
                            break Label_1092;
                        }
                    }
                    sb2.append(str2);
                    break Label_1098;
                }
                sb2.append(o);
            }
            sb2.append("},");
        }
        sb2.replace(sb2.length() - 1, sb2.length(), "");
        sb2.append("]");
        return sb2.toString();
    }
    
    public <E> E v8(final String s) {
        this.J.f().h();
        final long b = this.J.g().B(s);
        if (this.J.g().y(b)) {
            return null;
        }
        final RealmFieldType b2 = this.J.g().b0(b);
        switch (k$a.a[b2.ordinal()]) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Field type not supported: ");
                sb.append(b2);
                throw new IllegalStateException(sb.toString());
            }
            case 11: {
                return (E)this.H8(s);
            }
            case 10: {
                return (E)this.K8(s);
            }
            case 9: {
                return (E)this.J.g().k(b);
            }
            case 8: {
                return (E)this.J.g().b(b);
            }
            case 7: {
                return (E)this.J.g().u(b);
            }
            case 6: {
                return (E)(Object)this.J.g().K(b);
            }
            case 5: {
                return (E)this.J.g().U(b);
            }
            case 4: {
                return (E)Double.valueOf(this.J.g().O(b));
            }
            case 3: {
                return (E)Float.valueOf(this.J.g().Q(b));
            }
            case 2: {
                return (E)Long.valueOf(this.J.g().m(b));
            }
            case 1: {
                return (E)Boolean.valueOf(this.J.g().l(b));
            }
        }
    }
    
    public byte[] w8(final String s) {
        this.J.f().h();
        final long b = this.J.g().B(s);
        try {
            return this.J.g().K(b);
        }
        catch (IllegalArgumentException ex) {
            this.s8(s, b, RealmFieldType.BINARY);
            throw ex;
        }
    }
    
    public boolean x8(final String s) {
        this.J.f().h();
        final long b = this.J.g().B(s);
        try {
            return this.J.g().l(b);
        }
        catch (IllegalArgumentException ex) {
            this.s8(s, b, RealmFieldType.BOOLEAN);
            throw ex;
        }
    }
    
    @Override
    public void y4() {
    }
    
    public byte y8(final String s) {
        return (byte)this.J8(s);
    }
    
    public Date z8(final String s) {
        this.J.f().h();
        final long b = this.J.g().B(s);
        this.s8(s, b, RealmFieldType.DATE);
        if (this.J.g().y(b)) {
            return null;
        }
        return this.J.g().u(b);
    }
}
