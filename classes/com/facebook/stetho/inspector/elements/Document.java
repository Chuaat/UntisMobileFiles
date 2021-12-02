// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements;

import c6.h;
import android.os.SystemClock;
import java.util.regex.Pattern;
import com.facebook.stetho.common.LogUtil;
import java.util.HashSet;
import java.util.Collections;
import com.facebook.stetho.common.Util;
import java.util.ArrayList;
import com.facebook.stetho.common.Accumulator;
import java.util.List;
import java.util.ArrayDeque;
import com.facebook.stetho.common.ThreadBound;
import d6.a;
import com.facebook.stetho.inspector.helper.ObjectIdMapper;
import java.util.Queue;
import com.facebook.stetho.common.ArrayListAccumulator;
import com.facebook.stetho.inspector.helper.ThreadBoundProxy;

public final class Document extends ThreadBoundProxy
{
    private AttributeListAccumulator mCachedAttributeAccumulator;
    private ChildEventingList mCachedChildEventingList;
    private ArrayListAccumulator<Object> mCachedChildrenAccumulator;
    private final Queue<Object> mCachedUpdateQueue;
    private DocumentProvider mDocumentProvider;
    private final DocumentProviderFactory mFactory;
    private final ObjectIdMapper mObjectIdMapper;
    @a("this")
    private int mReferenceCounter;
    private ShadowDocument mShadowDocument;
    private UpdateListenerCollection mUpdateListeners;
    
    public Document(final DocumentProviderFactory mFactory) {
        super(mFactory);
        this.mFactory = mFactory;
        this.mObjectIdMapper = new DocumentObjectIdMapper();
        this.mReferenceCounter = 0;
        this.mUpdateListeners = new UpdateListenerCollection();
        this.mCachedUpdateQueue = new ArrayDeque<Object>();
    }
    
    private AttributeListAccumulator acquireCachedAttributeAccumulator() {
        AttributeListAccumulator mCachedAttributeAccumulator;
        if ((mCachedAttributeAccumulator = this.mCachedAttributeAccumulator) == null) {
            mCachedAttributeAccumulator = new AttributeListAccumulator();
        }
        this.mCachedChildrenAccumulator = null;
        return mCachedAttributeAccumulator;
    }
    
    private ChildEventingList acquireChildEventingList(final Object o, final DocumentView documentView) {
        ChildEventingList mCachedChildEventingList;
        if ((mCachedChildEventingList = this.mCachedChildEventingList) == null) {
            mCachedChildEventingList = new ChildEventingList();
        }
        this.mCachedChildEventingList = null;
        mCachedChildEventingList.acquire(o, documentView);
        return mCachedChildEventingList;
    }
    
    private ArrayListAccumulator<Object> acquireChildrenAccumulator() {
        ArrayListAccumulator<Object> mCachedChildrenAccumulator;
        if ((mCachedChildrenAccumulator = this.mCachedChildrenAccumulator) == null) {
            mCachedChildrenAccumulator = new ArrayListAccumulator<Object>();
        }
        this.mCachedChildrenAccumulator = null;
        return mCachedChildrenAccumulator;
    }
    
    private void applyDocumentUpdate(final ShadowDocument.Update update) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        update.getGarbageElements(new Accumulator<Object>() {
            @Override
            public void store(final Object o) {
                final Integer e = Util.throwIfNull(Document.this.mObjectIdMapper.getIdForObject(o));
                if (update.getElementInfo(o).parentElement == null) {
                    Document.this.mUpdateListeners.onChildNodeRemoved(Document.this.mObjectIdMapper.getIdForObject(Document.this.mShadowDocument.getElementInfo(o).parentElement), e);
                }
                list.add(e);
            }
        });
        Collections.sort((List<Comparable>)list);
        update.getChangedElements(new Accumulator<Object>() {
            @Override
            public void store(final Object o) {
                final Integer key = Util.throwIfNull(Document.this.mObjectIdMapper.getIdForObject(o));
                if (Collections.binarySearch(list, key) >= 0) {
                    return;
                }
                final ElementInfo elementInfo = Document.this.mShadowDocument.getElementInfo(o);
                if (elementInfo == null) {
                    return;
                }
                if (update.getElementInfo(o).parentElement != elementInfo.parentElement) {
                    Document.this.mUpdateListeners.onChildNodeRemoved(Document.this.mObjectIdMapper.getIdForObject(elementInfo.parentElement), key);
                }
            }
        });
        for (int size = list.size(), i = 0; i < size; ++i) {
            this.mObjectIdMapper.removeObjectById(list.get(i));
        }
        update.getChangedElements(new Accumulator<Object>() {
            private Accumulator<Object> insertedElements = new Accumulator<Object>() {
                @Override
                public void store(final Object e) {
                    if (update.isElementChanged(e)) {
                        Accumulator.this.listenerInsertedElements.add(e);
                    }
                }
            };
            private final HashSet<Object> listenerInsertedElements = new HashSet<Object>();
            
            @Override
            public void store(final Object o) {
                if (!Document.this.mObjectIdMapper.containsObject(o)) {
                    return;
                }
                if (this.listenerInsertedElements.contains(o)) {
                    return;
                }
                final ElementInfo elementInfo = Document.this.mShadowDocument.getElementInfo(o);
                final ElementInfo elementInfo2 = update.getElementInfo(o);
                List<Object> list;
                if (elementInfo != null) {
                    list = elementInfo.children;
                }
                else {
                    list = Collections.emptyList();
                }
                final List<Object> children = elementInfo2.children;
                final ChildEventingList access$900 = Document.this.acquireChildEventingList(o, update);
                for (int i = 0; i < list.size(); ++i) {
                    final Object value = list.get(i);
                    if (Document.this.mObjectIdMapper.containsObject(value)) {
                        final ElementInfo elementInfo3 = update.getElementInfo(value);
                        if (elementInfo3 == null || elementInfo3.parentElement == o) {
                            access$900.add(value);
                        }
                    }
                }
                updateListenerChildren(access$900, children, this.insertedElements);
                Document.this.releaseChildEventingList(access$900);
            }
        });
        update.commit();
    }
    
    private void cleanUp() {
        this.mDocumentProvider.postAndWait(new Runnable() {
            @Override
            public void run() {
                Document.this.mDocumentProvider.setListener(null);
                Document.this.mShadowDocument = null;
                Document.this.mObjectIdMapper.clear();
                Document.this.mDocumentProvider.dispose();
                Document.this.mDocumentProvider = null;
            }
        });
        this.mUpdateListeners.clear();
    }
    
    private ShadowDocument.Update createShadowDocumentUpdate() {
        this.verifyThreadAccess();
        if (this.mDocumentProvider.getRootElement() == this.mShadowDocument.getRootElement()) {
            final ArrayListAccumulator<Object> acquireChildrenAccumulator = this.acquireChildrenAccumulator();
            final ShadowDocument.UpdateBuilder beginUpdate = this.mShadowDocument.beginUpdate();
            this.mCachedUpdateQueue.add(this.mDocumentProvider.getRootElement());
            while (!this.mCachedUpdateQueue.isEmpty()) {
                final Object remove = this.mCachedUpdateQueue.remove();
                final NodeDescriptor nodeDescriptor = this.mDocumentProvider.getNodeDescriptor(remove);
                this.mObjectIdMapper.putObject(remove);
                nodeDescriptor.getChildren(remove, acquireChildrenAccumulator);
                for (int size = acquireChildrenAccumulator.size(), i = 0; i < size; ++i) {
                    final Object value = acquireChildrenAccumulator.get(i);
                    if (value != null) {
                        this.mCachedUpdateQueue.add(value);
                    }
                    else {
                        LogUtil.e("%s.getChildren() emitted a null child at position %s for element %s", nodeDescriptor.getClass().getName(), Integer.toString(i), remove);
                        acquireChildrenAccumulator.remove(i);
                        --i;
                        --size;
                    }
                }
                beginUpdate.setElementChildren(remove, acquireChildrenAccumulator);
                acquireChildrenAccumulator.clear();
            }
            this.releaseChildrenAccumulator(acquireChildrenAccumulator);
            return beginUpdate.build();
        }
        throw new IllegalStateException();
    }
    
    private boolean doesElementMatch(final Object o, final Pattern pattern) {
        final AttributeListAccumulator acquireCachedAttributeAccumulator = this.acquireCachedAttributeAccumulator();
        final NodeDescriptor nodeDescriptor = this.mDocumentProvider.getNodeDescriptor(o);
        nodeDescriptor.getAttributes(o, acquireCachedAttributeAccumulator);
        for (int size = acquireCachedAttributeAccumulator.size(), i = 0; i < size; ++i) {
            if (pattern.matcher(((ArrayList<CharSequence>)acquireCachedAttributeAccumulator).get(i)).find()) {
                this.releaseCachedAttributeAccumulator(acquireCachedAttributeAccumulator);
                return true;
            }
        }
        this.releaseCachedAttributeAccumulator(acquireCachedAttributeAccumulator);
        return pattern.matcher(nodeDescriptor.getNodeName(o)).find();
    }
    
    private void findMatches(final Object o, final Pattern pattern, final Accumulator<Integer> accumulator) {
        final ElementInfo elementInfo = this.mShadowDocument.getElementInfo(o);
        for (int size = elementInfo.children.size(), i = 0; i < size; ++i) {
            final Object value = elementInfo.children.get(i);
            if (this.doesElementMatch(value, pattern)) {
                accumulator.store(this.mObjectIdMapper.getIdForObject(value));
            }
            this.findMatches(value, pattern, accumulator);
        }
    }
    
    private void init() {
        (this.mDocumentProvider = this.mFactory.create()).postAndWait(new Runnable() {
            @Override
            public void run() {
                final Document this$0 = Document.this;
                this$0.mShadowDocument = new ShadowDocument(this$0.mDocumentProvider.getRootElement());
                Document.this.createShadowDocumentUpdate().commit();
                Document.this.mDocumentProvider.setListener(new ProviderListener());
            }
        });
    }
    
    private void releaseCachedAttributeAccumulator(final AttributeListAccumulator mCachedAttributeAccumulator) {
        mCachedAttributeAccumulator.clear();
        if (this.mCachedAttributeAccumulator == null) {
            this.mCachedAttributeAccumulator = mCachedAttributeAccumulator;
        }
    }
    
    private void releaseChildEventingList(final ChildEventingList mCachedChildEventingList) {
        mCachedChildEventingList.release();
        if (this.mCachedChildEventingList == null) {
            this.mCachedChildEventingList = mCachedChildEventingList;
        }
    }
    
    private void releaseChildrenAccumulator(final ArrayListAccumulator<Object> mCachedChildrenAccumulator) {
        mCachedChildrenAccumulator.clear();
        if (this.mCachedChildrenAccumulator == null) {
            this.mCachedChildrenAccumulator = mCachedChildrenAccumulator;
        }
    }
    
    private static void updateListenerChildren(final ChildEventingList list, final List<Object> list2, final Accumulator<Object> accumulator) {
        int i = 0;
        while (i <= list.size()) {
            if (i == list.size()) {
                if (i == list2.size()) {
                    break;
                }
                list.addWithEvent(i, list2.get(i), accumulator);
            }
            else {
                if (i == list2.size()) {
                    list.removeWithEvent(i);
                    continue;
                }
                final Object value = list.get(i);
                final Object value2 = list2.get(i);
                if (value != value2) {
                    final int index = list.indexOf(value2);
                    if (index != -1) {
                        list.removeWithEvent(index);
                    }
                    list.addWithEvent(i, value2, accumulator);
                }
            }
            ++i;
        }
    }
    
    private void updateTree() {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final ShadowDocument.Update shadowDocumentUpdate = this.createShadowDocumentUpdate();
        final boolean empty = shadowDocumentUpdate.isEmpty();
        if (empty) {
            shadowDocumentUpdate.abandon();
        }
        else {
            this.applyDocumentUpdate(shadowDocumentUpdate);
        }
        final String string = Long.toString(SystemClock.elapsedRealtime() - elapsedRealtime);
        String s;
        if (empty) {
            s = " (no changes)";
        }
        else {
            s = "";
        }
        LogUtil.d("Document.updateTree() completed in %s ms%s", string, s);
    }
    
    public void addRef() {
        synchronized (this) {
            if (this.mReferenceCounter++ == 0) {
                this.init();
            }
        }
    }
    
    public void addUpdateListener(final UpdateListener updateListener) {
        this.mUpdateListeners.add(updateListener);
    }
    
    public void findMatchingElements(final String s, final Accumulator<Integer> accumulator) {
        this.verifyThreadAccess();
        this.findMatches(this.mDocumentProvider.getRootElement(), Pattern.compile(Pattern.quote(s), 2), accumulator);
    }
    
    public DocumentView getDocumentView() {
        this.verifyThreadAccess();
        return this.mShadowDocument;
    }
    
    public void getElementComputedStyles(final Object o, final ComputedStyleAccumulator computedStyleAccumulator) {
        this.getNodeDescriptor(o).getComputedStyles(o, computedStyleAccumulator);
    }
    
    @h
    public Object getElementForNodeId(final int n) {
        return this.mObjectIdMapper.getObjectForId(n);
    }
    
    public void getElementStyleRuleNames(final Object o, final StyleRuleNameAccumulator styleRuleNameAccumulator) {
        this.getNodeDescriptor(o).getStyleRuleNames(o, styleRuleNameAccumulator);
    }
    
    public void getElementStyles(final Object o, final String s, final StyleAccumulator styleAccumulator) {
        this.getNodeDescriptor(o).getStyles(o, s, styleAccumulator);
    }
    
    @h
    public NodeDescriptor getNodeDescriptor(final Object o) {
        this.verifyThreadAccess();
        return this.mDocumentProvider.getNodeDescriptor(o);
    }
    
    @h
    public Integer getNodeIdForElement(final Object o) {
        return this.mObjectIdMapper.getIdForObject(o);
    }
    
    public Object getRootElement() {
        this.verifyThreadAccess();
        final Object rootElement = this.mDocumentProvider.getRootElement();
        if (rootElement == null) {
            throw new IllegalStateException();
        }
        if (rootElement == this.mShadowDocument.getRootElement()) {
            return rootElement;
        }
        throw new IllegalStateException();
    }
    
    public void hideHighlight() {
        this.verifyThreadAccess();
        this.mDocumentProvider.hideHighlight();
    }
    
    public void highlightElement(final Object o, final int n) {
        this.verifyThreadAccess();
        this.mDocumentProvider.highlightElement(o, n);
    }
    
    public void release() {
        synchronized (this) {
            int mReferenceCounter = this.mReferenceCounter;
            if (mReferenceCounter > 0) {
                --mReferenceCounter;
                if ((this.mReferenceCounter = mReferenceCounter) == 0) {
                    this.cleanUp();
                }
            }
        }
    }
    
    public void removeUpdateListener(final UpdateListener updateListener) {
        this.mUpdateListeners.remove(updateListener);
    }
    
    public void setAttributesAsText(final Object o, final String s) {
        this.verifyThreadAccess();
        this.mDocumentProvider.setAttributesAsText(o, s);
    }
    
    public void setElementStyle(final Object o, final String s, final String s2, final String s3) {
        this.getNodeDescriptor(o).setStyle(o, s, s2, s3);
    }
    
    public void setInspectModeEnabled(final boolean inspectModeEnabled) {
        this.verifyThreadAccess();
        this.mDocumentProvider.setInspectModeEnabled(inspectModeEnabled);
    }
    
    public static final class AttributeListAccumulator extends ArrayList<String> implements AttributeAccumulator
    {
        @Override
        public void store(final String e, final String e2) {
            this.add(e);
            this.add(e2);
        }
    }
    
    private final class ChildEventingList extends ArrayList<Object>
    {
        private DocumentView mDocumentView;
        private Object mParentElement;
        private int mParentNodeId;
        
        private ChildEventingList() {
            this.mParentElement = null;
            this.mParentNodeId = -1;
        }
        
        public void acquire(final Object mParentElement, final DocumentView mDocumentView) {
            this.mParentElement = mParentElement;
            int intValue;
            if (mParentElement == null) {
                intValue = -1;
            }
            else {
                intValue = Document.this.mObjectIdMapper.getIdForObject(this.mParentElement);
            }
            this.mParentNodeId = intValue;
            this.mDocumentView = mDocumentView;
        }
        
        public void addWithEvent(final int index, final Object element, final Accumulator<Object> accumulator) {
            Object value;
            if (index == 0) {
                value = null;
            }
            else {
                value = this.get(index - 1);
            }
            int intValue;
            if (value == null) {
                intValue = -1;
            }
            else {
                intValue = Document.this.mObjectIdMapper.getIdForObject(value);
            }
            this.add(index, element);
            Document.this.mUpdateListeners.onChildNodeInserted(this.mDocumentView, element, this.mParentNodeId, intValue, accumulator);
        }
        
        public void release() {
            this.clear();
            this.mParentElement = null;
            this.mParentNodeId = -1;
            this.mDocumentView = null;
        }
        
        public void removeWithEvent(int intValue) {
            intValue = Document.this.mObjectIdMapper.getIdForObject(this.remove(intValue));
            Document.this.mUpdateListeners.onChildNodeRemoved(this.mParentNodeId, intValue);
        }
    }
    
    private final class DocumentObjectIdMapper extends ObjectIdMapper
    {
        @Override
        protected void onMapped(final Object o, final int n) {
            Document.this.verifyThreadAccess();
            Document.this.mDocumentProvider.getNodeDescriptor(o).hook(o);
        }
        
        @Override
        protected void onUnmapped(final Object o, final int n) {
            Document.this.verifyThreadAccess();
            Document.this.mDocumentProvider.getNodeDescriptor(o).unhook(o);
        }
    }
    
    private final class ProviderListener implements DocumentProviderListener
    {
        @Override
        public void onAttributeModified(final Object o, final String s, final String s2) {
            Document.this.verifyThreadAccess();
            Document.this.mUpdateListeners.onAttributeModified(o, s, s2);
        }
        
        @Override
        public void onAttributeRemoved(final Object o, final String s) {
            Document.this.verifyThreadAccess();
            Document.this.mUpdateListeners.onAttributeRemoved(o, s);
        }
        
        @Override
        public void onInspectRequested(final Object o) {
            Document.this.verifyThreadAccess();
            Document.this.mUpdateListeners.onInspectRequested(o);
        }
        
        @Override
        public void onPossiblyChanged() {
            Document.this.updateTree();
        }
    }
    
    public interface UpdateListener
    {
        void onAttributeModified(final Object p0, final String p1, final String p2);
        
        void onAttributeRemoved(final Object p0, final String p1);
        
        void onChildNodeInserted(final DocumentView p0, final Object p1, final int p2, final int p3, final Accumulator<Object> p4);
        
        void onChildNodeRemoved(final int p0, final int p1);
        
        void onInspectRequested(final Object p0);
    }
    
    private class UpdateListenerCollection implements UpdateListener
    {
        private final List<UpdateListener> mListeners;
        private volatile UpdateListener[] mListenersSnapshot;
        
        public UpdateListenerCollection() {
            this.mListeners = new ArrayList<UpdateListener>();
        }
        
        private UpdateListener[] getListenersSnapshot() {
            UpdateListener[] mListenersSnapshot;
            while (true) {
                mListenersSnapshot = this.mListenersSnapshot;
                if (mListenersSnapshot != null) {
                    break;
                }
                synchronized (this) {
                    if (this.mListenersSnapshot == null) {
                        final List<UpdateListener> mListeners = this.mListeners;
                        return this.mListenersSnapshot = mListeners.toArray(new UpdateListener[mListeners.size()]);
                    }
                    continue;
                }
            }
            return mListenersSnapshot;
        }
        
        public void add(final UpdateListener updateListener) {
            synchronized (this) {
                this.mListeners.add(updateListener);
                this.mListenersSnapshot = null;
            }
        }
        
        public void clear() {
            synchronized (this) {
                this.mListeners.clear();
                this.mListenersSnapshot = null;
            }
        }
        
        @Override
        public void onAttributeModified(final Object o, final String s, final String s2) {
            final UpdateListener[] listenersSnapshot = this.getListenersSnapshot();
            for (int length = listenersSnapshot.length, i = 0; i < length; ++i) {
                listenersSnapshot[i].onAttributeModified(o, s, s2);
            }
        }
        
        @Override
        public void onAttributeRemoved(final Object o, final String s) {
            final UpdateListener[] listenersSnapshot = this.getListenersSnapshot();
            for (int length = listenersSnapshot.length, i = 0; i < length; ++i) {
                listenersSnapshot[i].onAttributeRemoved(o, s);
            }
        }
        
        @Override
        public void onChildNodeInserted(final DocumentView documentView, final Object o, final int n, final int n2, final Accumulator<Object> accumulator) {
            final UpdateListener[] listenersSnapshot = this.getListenersSnapshot();
            for (int length = listenersSnapshot.length, i = 0; i < length; ++i) {
                listenersSnapshot[i].onChildNodeInserted(documentView, o, n, n2, accumulator);
            }
        }
        
        @Override
        public void onChildNodeRemoved(final int n, final int n2) {
            final UpdateListener[] listenersSnapshot = this.getListenersSnapshot();
            for (int length = listenersSnapshot.length, i = 0; i < length; ++i) {
                listenersSnapshot[i].onChildNodeRemoved(n, n2);
            }
        }
        
        @Override
        public void onInspectRequested(final Object o) {
            final UpdateListener[] listenersSnapshot = this.getListenersSnapshot();
            for (int length = listenersSnapshot.length, i = 0; i < length; ++i) {
                listenersSnapshot[i].onInspectRequested(o);
            }
        }
        
        public void remove(final UpdateListener updateListener) {
            synchronized (this) {
                this.mListeners.remove(updateListener);
                this.mListenersSnapshot = null;
            }
        }
    }
}
