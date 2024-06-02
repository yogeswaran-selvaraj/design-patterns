package design.patterns.registry;

import design.patterns.util.StudenType;
import design.patterns.util.Student;

public interface Registry<T, V> {
    V getClone(T type);

    void addClone(T key, V value);
}
