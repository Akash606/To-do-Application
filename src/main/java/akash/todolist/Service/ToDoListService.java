package akash.todolist.Service;

import akash.todolist.Model.ToDOList;

import java.util.List;

public interface ToDoListService {

    public void Create_todoList(ToDOList toDOList);

    public List<ToDOList> TO_DO_LISTS();

    public void Delete_by_id(Long id);

    public  void DeleteAll();
}
