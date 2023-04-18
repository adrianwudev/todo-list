package ad.adlearn.controller;

import ad.adlearn.model.TodoData;
import ad.adlearn.service.TodoItemService;
import ad.adlearn.util.Mappings;
import ad.adlearn.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class TodoItemController {
    private TodoItemService todoItemService;
    public TodoItemController(TodoItemService todoItemService){
        this.todoItemService = todoItemService;
    }
    @ModelAttribute("todoData")
    public TodoData todoData(){
        return todoItemService.getData();
    }

    // http://localhost:8080/todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }
}
