package com.kunal.mock;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TodoBusinessImplTest {

    @Test
    public void test(){

        ToDoService toDoService=new TodoServiceStub();
        TodoBusinessImpl todoBusiness=new TodoBusinessImpl(toDoService);
        List<String> filterList=todoBusiness.retrieveTodosRelatedToSpring("Dummy");

        Assert.assertEquals(2,filterList.size());
    }
}
