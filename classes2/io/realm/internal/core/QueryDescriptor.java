// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.core;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Locale;
import io.realm.internal.fields.c;
import c6.h;
import io.realm.v0;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import io.realm.internal.Table;
import io.realm.RealmFieldType;
import java.util.Set;
import io.realm.internal.Keep;

@Keep
public class QueryDescriptor
{
    public static final Set<RealmFieldType> DISTINCT_VALID_FIELD_TYPES;
    public static final Set<RealmFieldType> DISTINCT_VALID_LINK_FIELD_TYPES;
    public static final Set<RealmFieldType> SORT_VALID_FIELD_TYPES;
    private final boolean[] ascendings;
    private final long[][] columnKeys;
    private final Table table;
    
    static {
        final RealmFieldType boolean1 = RealmFieldType.BOOLEAN;
        final RealmFieldType integer = RealmFieldType.INTEGER;
        final RealmFieldType float1 = RealmFieldType.FLOAT;
        final RealmFieldType double1 = RealmFieldType.DOUBLE;
        final RealmFieldType string = RealmFieldType.STRING;
        final RealmFieldType date = RealmFieldType.DATE;
        final RealmFieldType decimal128 = RealmFieldType.DECIMAL128;
        final RealmFieldType object_ID = RealmFieldType.OBJECT_ID;
        SORT_VALID_FIELD_TYPES = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(boolean1, integer, float1, double1, string, date, decimal128, object_ID)));
        final RealmFieldType binary = RealmFieldType.BINARY;
        final RealmFieldType object = RealmFieldType.OBJECT;
        final RealmFieldType linking_OBJECTS = RealmFieldType.LINKING_OBJECTS;
        DISTINCT_VALID_FIELD_TYPES = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(boolean1, integer, string, binary, date, float1, double1, decimal128, object_ID, object, linking_OBJECTS)));
        DISTINCT_VALID_LINK_FIELD_TYPES = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(object, linking_OBJECTS)));
    }
    
    private QueryDescriptor(final Table table, final long[][] columnKeys, @h final v0[] array) {
        this.table = table;
        this.columnKeys = columnKeys;
        if (array != null) {
            this.ascendings = new boolean[array.length];
            for (int i = 0; i < array.length; ++i) {
                this.ascendings[i] = array[i].b();
            }
        }
        else {
            this.ascendings = null;
        }
    }
    
    private static void checkFieldType(final c c, final Set<RealmFieldType> set, final String s, final String s2) {
        if (set.contains(c.g())) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s on '%s' field '%s' in '%s'.", s, c.g(), c.f(), s2));
    }
    
    private static QueryDescriptor getInstance(final c.a a, final Table table, final String[] array, @h final v0[] array2, final Set<RealmFieldType> set, final Set<RealmFieldType> set2, final String s) {
        if (array != null && array.length != 0) {
            final long[][] array3 = new long[array.length][];
            for (int i = 0; i < array.length; ++i) {
                final c c = io.realm.internal.fields.c.c(a, table, array[i], set, null);
                checkFieldType(c, set2, s, array[i]);
                array3[i] = c.e();
            }
            return new QueryDescriptor(table, array3, array2);
        }
        throw new IllegalArgumentException("You must provide at least one field name.");
    }
    
    public static QueryDescriptor getInstanceForDistinct(final c.a a, final Table table, final String s) {
        return getInstanceForDistinct(a, table, new String[] { s });
    }
    
    public static QueryDescriptor getInstanceForDistinct(final c.a a, final Table table, final String[] array) {
        return getInstance(a, table, array, null, QueryDescriptor.DISTINCT_VALID_LINK_FIELD_TYPES, QueryDescriptor.DISTINCT_VALID_FIELD_TYPES, "Distinct is not supported");
    }
    
    public static QueryDescriptor getInstanceForSort(final c.a a, final Table table, final String s, final v0 v0) {
        return getInstanceForSort(a, table, new String[] { s }, new v0[] { v0 });
    }
    
    public static QueryDescriptor getInstanceForSort(final c.a a, final Table table, final String[] array, final v0[] array2) {
        if (array2 == null || array2.length == 0) {
            throw new IllegalArgumentException("You must provide at least one sort order.");
        }
        if (array.length == array2.length) {
            return getInstance(a, table, array, array2, c.l, QueryDescriptor.SORT_VALID_FIELD_TYPES, "Sort is not supported");
        }
        throw new IllegalArgumentException("Number of fields and sort orders do not match.");
    }
    
    private long getTablePtr() {
        return this.table.getNativePtr();
    }
    
    public static QueryDescriptor getTestInstance(final Table table, final long[] array) {
        return new QueryDescriptor(table, new long[][] { array }, null);
    }
    
    @SuppressFBWarnings({ "EI_EXPOSE_REP" })
    public boolean[] getAscendings() {
        return this.ascendings;
    }
    
    @SuppressFBWarnings({ "EI_EXPOSE_REP" })
    public long[][] getColumnKeys() {
        return this.columnKeys;
    }
}
