package com.kunal.mock;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class TodoBusinessImpl {//implements ToDoService {

   private ToDoService toDoService;

    public TodoBusinessImpl(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

   /* @Override
    public List<String> retrieveTodos(String user) {
        return null;
    }
*/
    public List<String> retrieveTodosRelatedToSpring(String user){

        List<String> filteredTodos = new ArrayList<String>();
        List<String> todos=toDoService.retrieveTodos(user);


        return todos.stream().filter(s-> s.contains("Spring")).collect(Collectors.toList());
    }
}
