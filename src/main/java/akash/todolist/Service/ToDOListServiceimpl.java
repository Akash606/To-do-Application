package akash.todolist.Service;

import akash.todolist.Model.ToDOList;
import akash.todolist.Repository.ToDOListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ToDOListServiceimpl implements ToDoListService {
    @Autowired
    private ToDOListRepo toDOListrepo;
    @Override
    public void Create_todoList(ToDOList  toDOList) {
        toDOListrepo.save(toDOList);
    }

    @Override
    public List<ToDOList> TO_DO_LISTS() {
        return toDOListrepo.findAll();
    }

    @Override
    public void Delete_by_id(Long id) {
        toDOListrepo.deleteById(id);
    }

    @Override
    public void DeleteAll() {
        toDOListrepo.deleteAll();
    }
}
