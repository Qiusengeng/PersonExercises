package genericity.Interface;

public interface Data<E> {
    void add(E e);
    void delete(int id);
    void update(E e);
    //根据id查询
    E queryById(int id);
}
