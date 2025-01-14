package example4;

import com.sagar.example4.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import static org.junit.Assert.assertTrue;

public class PersonTest {

    @Test
    public void givenObject_whenGetsFieldNamesAtRuntime_thenCorrect() {
        // Given a person object
        Object person = new Person();

        // Get the declared fields of the Person class
        Field[] fields = person.getClass().getDeclaredFields();

        // Get field names from the fields array
        List<String> actualFieldNames = getFieldNames(fields);

        // Assert that the field names are correct
        assertTrue(Arrays.asList("name", "age")
                .containsAll(actualFieldNames));
    }
    private static List<String> getFieldNames(Field[] fields) {
        List<String> fieldNames = new ArrayList<>();
        for (Field field : fields)
            fieldNames.add(field.getName());
        return fieldNames;
    }

}
