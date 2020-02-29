package pl.mgorski.nativeserverless;

import io.vertx.core.impl.ConcurrentHashSet;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
@RequiredArgsConstructor
public class PersonRepository {

    private final ConcurrentHashSet<Person> db = new ConcurrentHashSet<>();

    void save(Person person) {
        db.add(person);
    }

    public List<Person> findAll() {
        return new ArrayList<>(db);
    }

}
