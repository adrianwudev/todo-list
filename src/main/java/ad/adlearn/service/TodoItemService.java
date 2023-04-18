package ad.adlearn.service;

import ad.adlearn.model.TodoData;
import ad.adlearn.model.TodoItem;

public interface TodoItemService {
    void addItem(TodoItem toAdd);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem toUpdate);
    TodoData getData();
}
