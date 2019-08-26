package org.glenlivet.resolver;

import java.util.ArrayList;
import java.util.List;

public class ResolverImpl<T, V extends Resolvable<T>> implements Resolver<T, V> {

    List<V> candidates = new ArrayList<V>();

    public V resolve(T type) {
        for(V candiate : candidates) {
            if (candiate.support(type)) {
                return candiate;
            }
        }
        return null;
    }

    public void addObject(V object) {
        candidates.add(object);
    }
}
