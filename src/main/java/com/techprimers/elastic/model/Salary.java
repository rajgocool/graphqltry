package com.techprimers.elastic.model;

import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;

@Document(indexName = "salary", type = "salary", shards = 1)
public class Salary {

    @Id
    private int id;

    private Long salary;

    public Salary() {
        super();
    }

    public Salary(int id, Long salary) {
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
