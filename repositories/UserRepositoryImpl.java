package data.repositories;
import data.models.Article;
import data.models.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    private int count;
    private List<User> users = new ArrayList<>();

    @Override
    public User save(User user) {
        boolean userHasNotBeSaved = user.getId() == 0;
        if (userHasNotBeSaved) {
            user.setId(generateUserId());
            users.add(user);
            count++;
        }
        return user;
    }

    private int generateUserId() {
        return count + 1;
    }

    @Override
    public User findById(int id) {
        for (User user : users) {
            if (user.getId() == id) return user;
        }
        return null;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public void delete(User user) {
        for (User eachUser: users) {
            if (eachUser.toString().equals(user.getFirstName())) {
                users.remove(user);
            }

        }
        count--;


    }

    @Override
    public void delete(int id) {
        for (User user: users) {
            if (user.getId() == id) {
                users.remove(user);
                count--;
                break;
            }
        }
    }

    @Override
    public void deleteAll() {
        for (User user: users) {
            users.remove(user);
            break;
        }
        count = 0;
    }
}
