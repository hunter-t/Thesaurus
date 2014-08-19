package com.mockigbirdgames.thesaurus.utils;

import java.util.HashMap;

/**
 * SafeMap object returns default value if specified key isn't found.
 * Created by ruslan on 19.08.14.
 */
public class SafeMap<K, V> extends HashMap<K, V> {

    @Override
    public V get(Object key) {
        return get(key, null);
    }

    public V get(Object key, V defaulValue) {
        return containsKey(key) ? super.get(key) : defaulValue;
    }

}
