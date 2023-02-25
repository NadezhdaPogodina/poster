import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.poster.services.Manager;


public class ManagerTest {

    @Test
    public void test() {
        Manager manager = new Manager();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");


        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5", "Film6"};
        String[] actual = manager.allFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void newTest() {

        Manager manager = new Manager(6);

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");

        String[] expected = {"Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        String [] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
