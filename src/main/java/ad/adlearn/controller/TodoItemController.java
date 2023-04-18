package ad.adlearn.controller;

import ad.adlearn.model.TodoData;
import ad.adlearn.util.Mappings;
import ad.adlearn.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class TodoItemController {
    @ModelAttribute
    public TodoData todoData(){
        return new TodoData();
    }

    // http://localhost:8080/todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }
}
