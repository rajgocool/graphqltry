package com.techprimers.elastic.load;

import com.techprimers.elastic.model.Salary;
import com.techprimers.elastic.model.Users;
import com.techprimers.elastic.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loaders {

    @Autowired
    ElasticsearchOperations operations;

    @Autowired
    UsersRepository usersRepository;

    @PostConstruct
    @Transactional
    public void loadAll(){
        operations.putMapping(Users.class);
        operations.putMapping(Salary.class);

        System.out.println("Loading Data");
        usersRepository.save(getData());
        System.out.printf("Loading Completed");

    }

    private List<Users> getData() {
          List<Users> userses = new ArrayList<>();
//        userses.add(new Users("Ajay",123L, "Accounting", 12000L));
//        userses.add(new Users("Techie",1230L, "Accounting", 12000L));
//        userses.add(new Users("Jaga",1234L, "Finance", 22000L));
//        userses.add(new Users("Shiva",124L, "Tech", 21000L));
//        userses.add(new Users("Karthick",14L, "Tech", 21000L));
//        userses.add(new Users("Bhuvanesh",4L, "Accounting", 21000L));
//        userses.add(new Users("Kumaran",1L, "Tech", 22000L));
//        userses.add(new Users("Thiru",1235L, "Accounting", 12000L));

        userses.add(new Users("Ajay",123L,  "Accounting", new Salary(1,12000L)));
        userses.add(new Users("Techie",1230L, "Accounting", new Salary(2,12000L)));
        userses.add(new Users("Jaga",1234L, "Finance", new Salary(3,22000L)));
        userses.add(new Users("Shiva",124L, "Tech", new Salary(4,21000L)));
        userses.add(new Users("Karthick",14L, "Tech", new Salary(5,21000L)));
        userses.add(new Users("Bhuvanesh",4L, "Accounting", new Salary(6,21000L)));
        userses.add(new Users("Kumaran",1L, "Tech", new Salary(7,22000L)));
        userses.add(new Users("Thiru",1235L, "Accounting", new Salary(8,12000L)));
        return userses;
    }
}
