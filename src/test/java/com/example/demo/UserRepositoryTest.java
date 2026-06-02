package com.example.demo;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

import com.example.demo.domain.User;
import com.example.demo.domain.UserRepository;





@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)





@org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest
public class UserRepositoryTest {

	



	    @Autowired

	    private UserRepository userRepository;



	    private User user;



	    @BeforeEach

	    void setUp() {

	        user = new User();

	        user.setName("juan");

	        user.setPhonenumber(600123456);

	        user.setGender("masculino");

	        user.setSubscription("usuario de prueba");

	    }



	    @Test

	    void saveUserTest() {

	        User savedUser = userRepository.save(user);



	        assertThat(savedUser.getId()).isGreaterThan(0);

	        assertThat(savedUser.getName()).isEqualTo("juan");

	        assertThat(savedUser.getPhonenumber()).isEqualTo(600123456);

	        assertThat(savedUser.getGender()).isEqualTo("masculino");

	    

	    }



	    @Test

	    void findByIdTest() {

	        User savedUser = userRepository.save(user);



	        Optional<User> foundUser = userRepository.findById(savedUser.getId());



	        assertThat(foundUser).isPresent();

	        assertThat(foundUser.get().getName()).isEqualTo("juan");



	    }



	    @Test

	    void findByIdNotFoundTest() {

	        Optional<User> foundUser = userRepository.findById(999L);



	        assertThat(foundUser).isEmpty();

	    }



	    @Test

	    void updateUserBalanceTest() {

	        User savedUser = userRepository.save(user);

	        User updatedUser = userRepository.save(savedUser);

	    }



	    @Test

	    void deleteByIdTest() {

	        User savedUser = userRepository.save(user);

	        Long userId = savedUser.getId();



	        userRepository.deleteById(userId);



	        Optional<User> deletedUser = userRepository.findById(userId);

	        assertThat(deletedUser).isEmpty();

	    }
}

	


