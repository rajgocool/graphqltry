package com.techprimers.elastic.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "user", type = "users", shards = 1)
public class Users {

    private String name;
    private Long id;
    private String teamName;

//    @Field(type = FieldType.Nested, includeInParent = true)
    @Autowired
    private Salary salary;

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", teamName='" + teamName + '\'' +
                ", salary=" + salary +
                '}';
    }
    //private Long salary;

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Salary getSalary() {
        return salary;
    }


    public Users(String name, Long id, String teamName, Salary salary) {

        this.name = name;
        this.id = id;
        this.teamName = teamName;
        this.salary = salary;
    }

    public Users() {

    }
}
