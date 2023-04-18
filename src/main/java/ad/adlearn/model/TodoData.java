package ad.adlearn.model;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TodoData {
    private static int idValue = 1;
    private final List<TodoItem> items = new ArrayList<>();

    public TodoData() {
        // add dummy data
        addItem(new TodoItem("first", "first detail", LocalDate.now()));
        addItem(new TodoItem("second", "second detail", LocalDate.now()));
        addItem(new TodoItem("third", "third detail", LocalDate.now()));
    }

    public List<TodoItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(@NotNull TodoItem toAdd) {
        toAdd.setId(idValue);
        items.add(toAdd);
        idValue++;
    }

    public void removeItem(int id) {
        ListIterator<TodoItem> itemIterator = items.listIterator();
        while (itemIterator.hasNext()) {
            TodoItem item = itemIterator.next();

            if (item.getId() == id) {
                itemIterator.remove();
                break;
            }
        }
    }

    public TodoItem getItem(int id) {
        for (TodoItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void updateItem(@NotNull TodoItem toUpdate){
        ListIterator<TodoItem> itemIterrator = items.listIterator();
        while(itemIterrator.hasNext()){
            TodoItem item = itemIterrator.next();

            if(item.equals(toUpdate)){
                itemIterrator.set(toUpdate);
                break;
            }
        }
    }
}
