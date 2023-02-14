package data.repositories;

import data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplTest {
    private UserRepository userRepository;
    private User user;

    @BeforeEach
    public void setUp() {
        userRepository = new UserRepositoryImpl();
        user = new User();
        user.setFirstName("Royal");
        user.setLastName("PriestHood");
        user.setUserName("userName");
        user.setPassword("password");
    }


    @Test public void saveOneUser_countIsOneTest() {
        userRepository.save(user);
        assertEquals(1, userRepository.count());
    }

    @Test public void saveOneUser_idOfUserIsOne(){
        User savedUser = userRepository.save(user);
        assertEquals(1, savedUser.getId());
    }

    @Test public void saveTwoUsersWithSameId_countIsOneTest(){
        User savedUser = userRepository.save(user);
        assertEquals(1, userRepository.count());
        savedUser.setLastName("PrinceHood");
        userRepository.save(savedUser);
        assertEquals(1, userRepository.count());
    }

    @Test public void saveOneUser_findUserByIdTest(){
        User savedUser = userRepository.save(user);
        assertEquals(1, savedUser.getId());
        User foundUser = userRepository.findById(1);
        assertEquals(foundUser, userRepository.findById(1));

    }

    @Test public void saveOneUser_deleteOneUser_countIsZeroTest(){
        userRepository.save(user);
        assertEquals(1, userRepository.count());
        userRepository.delete(1);
        assertEquals(0, userRepository.count());
    }

    @Test public void saveOneUser_deleteAllUser_countIsZeroTest() {
        userRepository.save(user);
        userRepository.save(user);
        assertEquals(1, userRepository.count());
        userRepository.deleteAll();
        assertEquals(0, userRepository.count());
    }

    @Test public void saveOneUser_deleteOneUserByUser_countIsZeroTest() {
        userRepository.save(user);
        assertEquals(1, userRepository.count());
        userRepository.delete(user);
        assertEquals(0, userRepository.count());
    }


}