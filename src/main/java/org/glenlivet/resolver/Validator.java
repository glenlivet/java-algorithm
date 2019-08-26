package org.glenlivet.resolver;

public interface Validator<V> {

    Boolean validate(V object);

}
