package example3;

import com.sagar.example3.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class PersonTest {


    @Test
    public void checkFieldName(){
        Object p=new Person();
        List<String> list=new ArrayList<>();
        for (Field declaredField : p.getClass().getDeclaredFields()) {
            list.add(declaredField.getName());
        }
        System.out.println(list);
        assertTrue(Arrays.asList("name", "age").containsAll(list));

    }
}
