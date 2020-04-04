package akash.todolist.Controller;

import akash.todolist.Model.ToDOList;
import akash.todolist.Service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class TodoListController  {

    @Autowired
    private ToDoListService toDoListService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String getpage(ModelMap modelMap){
        modelMap.addAttribute("lists",toDoListService.TO_DO_LISTS());
        return "index";
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public RedirectView createTodo(@ModelAttribute ToDOList toDOList , ModelMap modelMap){
        toDoListService.Create_todoList(toDOList);
        modelMap.addAttribute("msg","Saved");
        RedirectView redirectView=new RedirectView();
        redirectView.setUrl("localhost:8080");
        return redirectView;
    }

    @RequestMapping("/list/{id}")
    public RedirectView deleteByid(@PathVariable Long id){
        toDoListService.Delete_by_id(id);
        RedirectView redirectView=new RedirectView();
        redirectView.setUrl("localhost:8080");
        return redirectView;
    }

    @RequestMapping("/list/delete/all")
    public RedirectView deleteAllTask(){
        toDoListService.DeleteAll();
        RedirectView redirectView=new RedirectView();
        redirectView.setUrl("localhost:8080");
        return redirectView;
    }
}
