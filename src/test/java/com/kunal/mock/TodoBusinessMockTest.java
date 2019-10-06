package com.kunal.mock;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class TodoBusinessMockTest {

    @Test
    public void test(){

        ToDoService toDoService= Mockito.mock(ToDoService.class);//new TodoServiceStub();

        List<String> list= Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
        Mockito.when(toDoService.retrieveTodos("Dummy")).thenReturn(list);

        TodoBusinessImpl todoBusiness=new TodoBusinessImpl(toDoService);
        List<String> filterList=todoBusiness.retrieveTodosRelatedToSpring("Dummy");
        Assert.assertEquals(2,filterList.size());
    }
}
