package org.glenlivet.resolver;

public interface Resolvable<T> {

    Boolean support(T type);
}
