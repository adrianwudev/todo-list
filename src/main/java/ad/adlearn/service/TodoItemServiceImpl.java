package ad.adlearn.service;

import ad.adlearn.model.TodoData;
import ad.adlearn.model.TodoItem;
import org.springframework.stereotype.Service;

import java.beans.PropertyVetoException;

@Service
public class TodoItemServiceImpl implements TodoItemService {
    private final TodoData todoData;
    public TodoItemServiceImpl(TodoData todoData){
        this.todoData = todoData;
    }
    @Override
    public void addItem(TodoItem toAdd) {
        todoData.addItem(toAdd);
    }

    @Override
    public void removeItem(int id) {
        todoData.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return todoData.getItem(id);
    }

    @Override
    public void updateItem(TodoItem toUpdate) {
        todoData.updateItem(toUpdate);
    }

    @Override
    public TodoData getData() {
        return todoData;
    }
}
