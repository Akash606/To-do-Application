package akash.todolist.Repository;

import akash.todolist.Model.ToDOList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDOListRepo extends JpaRepository<ToDOList,Long> {
}
