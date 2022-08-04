package Interfaces;

import java.util.List;

public interface CocheCRUD {

    void save();

    List<CocheCRUDImpl> findAll();

    void delete();

}
