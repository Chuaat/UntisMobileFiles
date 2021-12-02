// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.AbstractSet;
import java.util.Objects;
import java.util.Set;
import java.io.ObjectStreamException;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Comparator;
import java.io.Serializable;
import java.util.AbstractMap;

public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable
{
    private static final Comparator<Comparable> NATURAL_ORDER;
    Comparator<? super K> comparator;
    private EntrySet entrySet;
    final Node<K, V> header;
    private KeySet keySet;
    int modCount;
    Node<K, V> root;
    int size;
    
    static {
        NATURAL_ORDER = new Comparator<Comparable>() {
            @Override
            public int compare(final Comparable comparable, final Comparable comparable2) {
                return comparable.compareTo(comparable2);
            }
        };
    }
    
    public LinkedTreeMap() {
        this((Comparator)LinkedTreeMap.NATURAL_ORDER);
    }
    
    public LinkedTreeMap(Comparator<? super K> natural_ORDER) {
        this.size = 0;
        this.modCount = 0;
        this.header = new Node<K, V>();
        if (natural_ORDER == null) {
            natural_ORDER = LinkedTreeMap.NATURAL_ORDER;
        }
        this.comparator = (Comparator<? super K>)natural_ORDER;
    }
    
    private boolean equal(final Object o, final Object obj) {
        return o == obj || (o != null && o.equals(obj));
    }
    
    private void rebalance(Node<K, V> parent, final boolean b) {
        while (parent != null) {
            final Node<K, V> left = parent.left;
            final Node<K, V> right = parent.right;
            final int n = 0;
            final int n2 = 0;
            int height;
            if (left != null) {
                height = left.height;
            }
            else {
                height = 0;
            }
            int height2;
            if (right != null) {
                height2 = right.height;
            }
            else {
                height2 = 0;
            }
            final int n3 = height - height2;
            if (n3 == -2) {
                final Node<K, V> left2 = right.left;
                final Node<K, V> right2 = right.right;
                int height3;
                if (right2 != null) {
                    height3 = right2.height;
                }
                else {
                    height3 = 0;
                }
                int height4 = n2;
                if (left2 != null) {
                    height4 = left2.height;
                }
                final int n4 = height4 - height3;
                if (n4 != -1) {
                    if (n4 != 0 || b) {
                        this.rotateRight(right);
                    }
                }
                this.rotateLeft(parent);
                if (b) {
                    break;
                }
            }
            else if (n3 == 2) {
                final Node<K, V> left3 = left.left;
                final Node<K, V> right3 = left.right;
                int height5;
                if (right3 != null) {
                    height5 = right3.height;
                }
                else {
                    height5 = 0;
                }
                int height6 = n;
                if (left3 != null) {
                    height6 = left3.height;
                }
                final int n5 = height6 - height5;
                if (n5 != 1) {
                    if (n5 != 0 || b) {
                        this.rotateLeft(left);
                    }
                }
                this.rotateRight(parent);
                if (b) {
                    break;
                }
            }
            else if (n3 == 0) {
                parent.height = height + 1;
                if (b) {
                    break;
                }
            }
            else {
                parent.height = Math.max(height, height2) + 1;
                if (!b) {
                    break;
                }
            }
            parent = parent.parent;
        }
    }
    
    private void replaceInParent(final Node<K, V> node, final Node<K, V> root) {
        final Node<K, V> parent = node.parent;
        node.parent = null;
        if (root != null) {
            root.parent = parent;
        }
        if (parent != null) {
            if (parent.left == node) {
                parent.left = root;
            }
            else {
                parent.right = root;
            }
        }
        else {
            this.root = root;
        }
    }
    
    private void rotateLeft(final Node<K, V> node) {
        final Node<K, V> left = node.left;
        final Node<K, V> right = node.right;
        final Node<K, V> left2 = right.left;
        final Node<K, V> right2 = right.right;
        node.right = left2;
        if (left2 != null) {
            left2.parent = node;
        }
        this.replaceInParent(node, right);
        right.left = node;
        node.parent = right;
        final int n = 0;
        int height;
        if (left != null) {
            height = left.height;
        }
        else {
            height = 0;
        }
        int height2;
        if (left2 != null) {
            height2 = left2.height;
        }
        else {
            height2 = 0;
        }
        final int n2 = Math.max(height, height2) + 1;
        node.height = n2;
        int height3 = n;
        if (right2 != null) {
            height3 = right2.height;
        }
        right.height = Math.max(n2, height3) + 1;
    }
    
    private void rotateRight(final Node<K, V> node) {
        final Node<K, V> left = node.left;
        final Node<K, V> right = node.right;
        final Node<K, V> left2 = left.left;
        final Node<K, V> right2 = left.right;
        node.left = right2;
        if (right2 != null) {
            right2.parent = node;
        }
        this.replaceInParent(node, left);
        left.right = node;
        node.parent = left;
        final int n = 0;
        int height;
        if (right != null) {
            height = right.height;
        }
        else {
            height = 0;
        }
        int height2;
        if (right2 != null) {
            height2 = right2.height;
        }
        else {
            height2 = 0;
        }
        final int n2 = Math.max(height, height2) + 1;
        node.height = n2;
        int height3 = n;
        if (left2 != null) {
            height3 = left2.height;
        }
        left.height = Math.max(n2, height3) + 1;
    }
    
    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }
    
    @Override
    public void clear() {
        this.root = null;
        this.size = 0;
        ++this.modCount;
        final Node<K, V> header = this.header;
        header.prev = header;
        header.next = header;
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return this.findByObject(o) != null;
    }
    
    @Override
    public Set<Entry<K, V>> entrySet() {
        EntrySet entrySet = this.entrySet;
        if (entrySet == null) {
            entrySet = new EntrySet();
            this.entrySet = entrySet;
        }
        return entrySet;
    }
    
    Node<K, V> find(final K k, final boolean b) {
        final Comparator<? super K> comparator = this.comparator;
        Entry<K, V> root = (Entry<K, V>)this.root;
        int n;
        if (root != null) {
            Comparable<Comparable> comparable;
            if (comparator == LinkedTreeMap.NATURAL_ORDER) {
                comparable = (Comparable<Comparable>)k;
            }
            else {
                comparable = null;
            }
            while (true) {
                final K key = ((Node)root).key;
                if (comparable != null) {
                    n = comparable.compareTo((Comparable)key);
                }
                else {
                    n = comparator.compare(k, key);
                }
                if (n == 0) {
                    return (Node<K, V>)root;
                }
                Entry<K, V> entry;
                if (n < 0) {
                    entry = ((Node)root).left;
                }
                else {
                    entry = ((Node)root).right;
                }
                if (entry == null) {
                    break;
                }
                root = entry;
            }
        }
        else {
            n = 0;
        }
        if (!b) {
            return null;
        }
        final Node<K, V> header = this.header;
        Node right;
        if (root == null) {
            if (comparator == LinkedTreeMap.NATURAL_ORDER && !(k instanceof Comparable)) {
                final StringBuilder sb = new StringBuilder();
                sb.append(k.getClass().getName());
                sb.append(" is not Comparable");
                throw new ClassCastException(sb.toString());
            }
            right = new Node<K, V>((Node<Object, Object>)root, k, (Node<Object, Object>)header, (Node<Object, Object>)header.prev);
            this.root = (Node<K, V>)right;
        }
        else {
            right = new Node<K, V>((Node<K, V>)root, k, header, header.prev);
            if (n < 0) {
                ((Node)root).left = right;
            }
            else {
                ((Node)root).right = right;
            }
            this.rebalance((Node<K, V>)root, true);
        }
        ++this.size;
        ++this.modCount;
        return (Node<K, V>)right;
    }
    
    Node<K, V> findByEntry(final Entry<?, ?> entry) {
        final Node<K, V> byObject = this.findByObject(entry.getKey());
        Node<K, V> node;
        if (byObject != null && this.equal(byObject.value, entry.getValue())) {
            node = byObject;
        }
        else {
            node = null;
        }
        return node;
    }
    
    Node<K, V> findByObject(final Object o) {
        Object find;
        final Object o2 = find = null;
        if (o == null) {
            return (Node<K, V>)find;
        }
        try {
            find = this.find(o, false);
            return (Node<K, V>)find;
        }
        catch (ClassCastException ex) {
            find = o2;
            return (Node<K, V>)find;
        }
    }
    
    @Override
    public V get(Object value) {
        final Node<K, V> byObject = this.findByObject(value);
        if (byObject != null) {
            value = byObject.value;
        }
        else {
            value = null;
        }
        return (V)value;
    }
    
    @Override
    public Set<K> keySet() {
        KeySet keySet = this.keySet;
        if (keySet == null) {
            keySet = new KeySet();
            this.keySet = keySet;
        }
        return keySet;
    }
    
    @Override
    public V put(final K obj, final V value) {
        Objects.requireNonNull(obj, "key == null");
        final Node<K, V> find = this.find(obj, true);
        final V value2 = find.value;
        find.value = value;
        return value2;
    }
    
    @Override
    public V remove(Object value) {
        final Node<K, V> removeInternalByKey = this.removeInternalByKey(value);
        if (removeInternalByKey != null) {
            value = removeInternalByKey.value;
        }
        else {
            value = null;
        }
        return (V)value;
    }
    
    void removeInternal(final Node<K, V> node, final boolean b) {
        if (b) {
            final Node<K, V> prev = node.prev;
            prev.next = node.next;
            node.next.prev = prev;
        }
        final Node<K, V> left = node.left;
        final Node<K, V> right = node.right;
        final Node<K, V> parent = node.parent;
        int height = 0;
        if (left != null && right != null) {
            Node<K, V> node2;
            if (left.height > right.height) {
                node2 = left.last();
            }
            else {
                node2 = right.first();
            }
            this.removeInternal(node2, false);
            final Node<K, V> left2 = node.left;
            int height2;
            if (left2 != null) {
                height2 = left2.height;
                node2.left = left2;
                left2.parent = node2;
                node.left = null;
            }
            else {
                height2 = 0;
            }
            final Node<K, V> right2 = node.right;
            if (right2 != null) {
                height = right2.height;
                node2.right = right2;
                right2.parent = node2;
                node.right = null;
            }
            node2.height = Math.max(height2, height) + 1;
            this.replaceInParent(node, node2);
            return;
        }
        if (left != null) {
            this.replaceInParent(node, left);
            node.left = null;
        }
        else if (right != null) {
            this.replaceInParent(node, right);
            node.right = null;
        }
        else {
            this.replaceInParent(node, null);
        }
        this.rebalance(parent, false);
        --this.size;
        ++this.modCount;
    }
    
    Node<K, V> removeInternalByKey(final Object o) {
        final Node<K, V> byObject = this.findByObject(o);
        if (byObject != null) {
            this.removeInternal(byObject, true);
        }
        return byObject;
    }
    
    @Override
    public int size() {
        return this.size;
    }
    
    class EntrySet extends AbstractSet<Entry<K, V>>
    {
        @Override
        public void clear() {
            LinkedTreeMap.this.clear();
        }
        
        @Override
        public boolean contains(final Object o) {
            return o instanceof Entry && LinkedTreeMap.this.findByEntry((Entry<?, ?>)o) != null;
        }
        
        @Override
        public Iterator<Entry<K, V>> iterator() {
            return new LinkedTreeMapIterator<Entry<K, V>>() {
                @Override
                public Entry<K, V> next() {
                    return ((LinkedTreeMapIterator)this).nextNode();
                }
            };
        }
        
        @Override
        public boolean remove(final Object o) {
            if (!(o instanceof Entry)) {
                return false;
            }
            final Node<K, V> byEntry = LinkedTreeMap.this.findByEntry((Entry<?, ?>)o);
            if (byEntry == null) {
                return false;
            }
            LinkedTreeMap.this.removeInternal(byEntry, true);
            return true;
        }
        
        @Override
        public int size() {
            return LinkedTreeMap.this.size;
        }
    }
    
    final class KeySet extends AbstractSet<K>
    {
        @Override
        public void clear() {
            LinkedTreeMap.this.clear();
        }
        
        @Override
        public boolean contains(final Object o) {
            return LinkedTreeMap.this.containsKey(o);
        }
        
        @Override
        public Iterator<K> iterator() {
            return new LinkedTreeMapIterator<K>() {
                @Override
                public K next() {
                    return ((LinkedTreeMapIterator)this).nextNode().key;
                }
            };
        }
        
        @Override
        public boolean remove(final Object o) {
            return LinkedTreeMap.this.removeInternalByKey(o) != null;
        }
        
        @Override
        public int size() {
            return LinkedTreeMap.this.size;
        }
    }
    
    private abstract class LinkedTreeMapIterator<T> implements Iterator<T>
    {
        int expectedModCount;
        Node<K, V> lastReturned;
        Node<K, V> next;
        
        LinkedTreeMapIterator() {
            this.next = LinkedTreeMap.this.header.next;
            this.lastReturned = null;
            this.expectedModCount = LinkedTreeMap.this.modCount;
        }
        
        @Override
        public final boolean hasNext() {
            return this.next != LinkedTreeMap.this.header;
        }
        
        final Node<K, V> nextNode() {
            final Node<K, V> next = this.next;
            final LinkedTreeMap this$0 = LinkedTreeMap.this;
            if (next == this$0.header) {
                throw new NoSuchElementException();
            }
            if (this$0.modCount == this.expectedModCount) {
                this.next = next.next;
                return this.lastReturned = next;
            }
            throw new ConcurrentModificationException();
        }
        
        @Override
        public final void remove() {
            final Node<K, V> lastReturned = this.lastReturned;
            if (lastReturned != null) {
                LinkedTreeMap.this.removeInternal(lastReturned, true);
                this.lastReturned = null;
                this.expectedModCount = LinkedTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }
    
    static final class Node<K, V> implements Entry<K, V>
    {
        int height;
        final K key;
        Node<K, V> left;
        Node<K, V> next;
        Node<K, V> parent;
        Node<K, V> prev;
        Node<K, V> right;
        V value;
        
        Node() {
            this.key = null;
            this.prev = this;
            this.next = this;
        }
        
        Node(final Node<K, V> parent, final K key, final Node<K, V> next, final Node<K, V> prev) {
            this.parent = parent;
            this.key = key;
            this.height = 1;
            this.next = next;
            this.prev = prev;
            prev.next = this;
            next.prev = this;
        }
        
        @Override
        public boolean equals(Object o) {
            final boolean b = o instanceof Entry;
            boolean b3;
            final boolean b2 = b3 = false;
            if (b) {
                final Entry entry = (Entry)o;
                o = this.key;
                if (o == null) {
                    b3 = b2;
                    if (entry.getKey() != null) {
                        return b3;
                    }
                }
                else {
                    b3 = b2;
                    if (!o.equals(entry.getKey())) {
                        return b3;
                    }
                }
                o = this.value;
                final Object value = entry.getValue();
                if (o == null) {
                    b3 = b2;
                    if (value != null) {
                        return b3;
                    }
                }
                else {
                    b3 = b2;
                    if (!o.equals(value)) {
                        return b3;
                    }
                }
                b3 = true;
            }
            return b3;
        }
        
        public Node<K, V> first() {
            Node<K, V> left = this.left;
            Node node = this;
            while (left != null) {
                final Node<K, V> left2 = left.left;
                node = left;
                left = left2;
            }
            return (Node<K, V>)node;
        }
        
        @Override
        public K getKey() {
            return this.key;
        }
        
        @Override
        public V getValue() {
            return this.value;
        }
        
        @Override
        public int hashCode() {
            final K key = this.key;
            int hashCode = 0;
            int hashCode2;
            if (key == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = key.hashCode();
            }
            final V value = this.value;
            if (value != null) {
                hashCode = value.hashCode();
            }
            return hashCode2 ^ hashCode;
        }
        
        public Node<K, V> last() {
            Node<K, V> right = this.right;
            Node node = this;
            while (right != null) {
                final Node<K, V> right2 = right.right;
                node = right;
                right = right2;
            }
            return (Node<K, V>)node;
        }
        
        @Override
        public V setValue(final V value) {
            final V value2 = this.value;
            this.value = value;
            return value2;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.key);
            sb.append("=");
            sb.append(this.value);
            return sb.toString();
        }
    }
}
