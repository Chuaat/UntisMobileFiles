// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.common;

import java.util.RandomAccess;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

public final class ListUtil
{
    private ListUtil() {
    }
    
    public static <T> List<T> copyToImmutableList(final List<T> list) {
        if (list instanceof ImmutableList) {
            return list;
        }
        final int size = list.size();
        if (size == 0) {
            return Collections.emptyList();
        }
        if (size == 1) {
            return new OneItemImmutableList<T>(list.get(0));
        }
        if (size == 2) {
            return new TwoItemImmutableList<T>(list.get(0), list.get(1));
        }
        if (size == 3) {
            return new ThreeItemImmutableList<T>(list.get(0), list.get(1), list.get(2));
        }
        if (size == 4) {
            return new FourItemImmutableList<T>(list.get(0), list.get(1), list.get(2), list.get(3));
        }
        if (size != 5) {
            return new ImmutableArrayList<T>(list.toArray());
        }
        return new FiveItemImmutableList<T>(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
    }
    
    public static <T> boolean identityEquals(final List<? extends T> list, final List<? extends T> list2) {
        if (list == list2) {
            return true;
        }
        final int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < size; ++i) {
            if (list.get(i) != list2.get(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static <T> List<T> newImmutableList(final T t) {
        return new OneItemImmutableList<T>(t);
    }
    
    public static <T> List<T> newImmutableList(final T t, final T t2) {
        return new TwoItemImmutableList<T>(t, t2);
    }
    
    private static final class FiveItemImmutableList<E> extends AbstractList<E> implements ImmutableList<E>
    {
        private final E mItem0;
        private final E mItem1;
        private final E mItem2;
        private final E mItem3;
        private final E mItem4;
        
        public FiveItemImmutableList(final E mItem0, final E mItem2, final E mItem3, final E mItem4, final E mItem5) {
            this.mItem0 = mItem0;
            this.mItem1 = mItem2;
            this.mItem2 = mItem3;
            this.mItem3 = mItem4;
            this.mItem4 = mItem5;
        }
        
        @Override
        public E get(final int n) {
            if (n == 0) {
                return this.mItem0;
            }
            if (n == 1) {
                return this.mItem1;
            }
            if (n == 2) {
                return this.mItem2;
            }
            if (n == 3) {
                return this.mItem3;
            }
            if (n == 4) {
                return this.mItem4;
            }
            throw new IndexOutOfBoundsException();
        }
        
        @Override
        public int size() {
            return 5;
        }
    }
    
    private static final class FourItemImmutableList<E> extends AbstractList<E> implements ImmutableList<E>
    {
        private final E mItem0;
        private final E mItem1;
        private final E mItem2;
        private final E mItem3;
        
        public FourItemImmutableList(final E mItem0, final E mItem2, final E mItem3, final E mItem4) {
            this.mItem0 = mItem0;
            this.mItem1 = mItem2;
            this.mItem2 = mItem3;
            this.mItem3 = mItem4;
        }
        
        @Override
        public E get(final int n) {
            if (n == 0) {
                return this.mItem0;
            }
            if (n == 1) {
                return this.mItem1;
            }
            if (n == 2) {
                return this.mItem2;
            }
            if (n == 3) {
                return this.mItem3;
            }
            throw new IndexOutOfBoundsException();
        }
        
        @Override
        public int size() {
            return 4;
        }
    }
    
    private static final class ImmutableArrayList<E> extends AbstractList<E> implements ImmutableList<E>
    {
        private final Object[] mArray;
        
        public ImmutableArrayList(final Object[] mArray) {
            this.mArray = mArray;
        }
        
        @Override
        public E get(final int n) {
            return (E)this.mArray[n];
        }
        
        @Override
        public int size() {
            return this.mArray.length;
        }
    }
    
    private interface ImmutableList<E> extends List<E>, RandomAccess
    {
    }
    
    private static final class OneItemImmutableList<E> extends AbstractList<E> implements ImmutableList<E>
    {
        private final E mItem;
        
        public OneItemImmutableList(final E mItem) {
            this.mItem = mItem;
        }
        
        @Override
        public E get(final int n) {
            if (n == 0) {
                return this.mItem;
            }
            throw new IndexOutOfBoundsException();
        }
        
        @Override
        public int size() {
            return 1;
        }
    }
    
    private static final class ThreeItemImmutableList<E> extends AbstractList<E> implements ImmutableList<E>
    {
        private final E mItem0;
        private final E mItem1;
        private final E mItem2;
        
        public ThreeItemImmutableList(final E mItem0, final E mItem2, final E mItem3) {
            this.mItem0 = mItem0;
            this.mItem1 = mItem2;
            this.mItem2 = mItem3;
        }
        
        @Override
        public E get(final int n) {
            if (n == 0) {
                return this.mItem0;
            }
            if (n == 1) {
                return this.mItem1;
            }
            if (n == 2) {
                return this.mItem2;
            }
            throw new IndexOutOfBoundsException();
        }
        
        @Override
        public int size() {
            return 3;
        }
    }
    
    private static final class TwoItemImmutableList<E> extends AbstractList<E> implements ImmutableList<E>
    {
        private final E mItem0;
        private final E mItem1;
        
        public TwoItemImmutableList(final E mItem0, final E mItem2) {
            this.mItem0 = mItem0;
            this.mItem1 = mItem2;
        }
        
        @Override
        public E get(final int n) {
            if (n == 0) {
                return this.mItem0;
            }
            if (n == 1) {
                return this.mItem1;
            }
            throw new IndexOutOfBoundsException();
        }
        
        @Override
        public int size() {
            return 2;
        }
    }
}
