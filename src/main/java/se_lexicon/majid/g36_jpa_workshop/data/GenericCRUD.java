package se_lexicon.majid.g36_jpa_workshop.data;

import java.util.Collection;

public interface GenericCRUD<T, ID> {
    T create(T t);

    Collection<T> findAll;

    T findById(ID id);

    T Update(T t);

    void delete(ID id);
}

