
package com.jamr.medicalsysweb.repository;

/**
 *
 * @author 48881
 */
public interface Repository<T, ID> {
        void save(T entity);
    T findById(ID id);
}
