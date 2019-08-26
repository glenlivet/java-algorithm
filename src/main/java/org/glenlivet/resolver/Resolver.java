package org.glenlivet.resolver;

public interface Resolver<T, V extends Resolvable<T>> {

    V resolve(T type);

    void addObject(V object);
}
