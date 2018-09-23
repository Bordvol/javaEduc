package com.study.datastructures.map;

import java.util.ArrayList;

public class HashMap implements Map {

    private static final int INITIAL_CAPACITY = 2;
    int size = 0;

    private ArrayList[] buckets = new ArrayList[INITIAL_CAPACITY];

    public HashMap() {
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            buckets[i] = new ArrayList();
        }
    }

    private int getBucketIndex(Object key) {
        return key.hashCode() % buckets.length;
    }

    private void rebucketing() {
        if (buckets.length * 0.75 < size) {
            // copy old data
            ArrayList[] oldBuckets = buckets.clone();
            // create and initialize new buckets
            buckets = new ArrayList[buckets.length * 2];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new ArrayList();
            }
            // rebucketing into new structure
            for (int i = 0; i < oldBuckets.length; i++) {
                for (int j = 0; j < oldBuckets[i].size(); j++) {
                    // initialize entry
                    Entry entry = (Entry) oldBuckets[i].get(j);
                    // get index of bucket
                    int index = entry.key.hashCode() % buckets.length;
                    ArrayList bucket = buckets[index];
                    bucket.add(entry);
                }
            }
        }
    }

    @Override
    public Object put(Object key, Object value) {
        rebucketing();
        Object result;
        Entry entry = new Entry(key, value);
        ArrayList bucket = buckets[getBucketIndex(key)];
        int index = bucket.indexOf(entry.key);
        if (index == -1) {
            bucket.add(entry);
            size++;
            result = null;
        } else {
            result = ((Entry) bucket.get(index)).value;
            bucket.add(index, entry);
        }
        return result;
    }

    @Override
    public Object get(Object key) {
        ArrayList bucket = buckets[getBucketIndex(key)];
        for (Object arrayList : bucket) {
            Object object = ((Entry) arrayList).key;
            if (object.equals(key)) {
                return (Entry) arrayList;
            }
        }
        return new Entry(null, null);
    }

    @Override
    public Object remove(Object key) {
        ArrayList bucket = buckets[getBucketIndex(key)];
        for (int i = 0; i < bucket.size(); i++) {
            if (((Entry) bucket.get(i)).key.equals(key)) {
                bucket.remove(i);
            }
        }
        size--;
        return null;
    }

    @Override
    public boolean containsKey(Object key) {
        Object object = this.get(key);
        if (((Entry) object).key == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public int size() {
        return size;
    }

    public int length() {
        return buckets.length;
    }
}