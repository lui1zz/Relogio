package interfaces_funcionais;

import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Alice", 30), new User("Bob", 40), new User("Charlie", 50), new User("David", 60));
    users.forEach(user -> System.out.println(user));      
    printStringValue(User::name, users);   
}

    public static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(u -> System.out.println(callback.apply(u)));
    }

}
