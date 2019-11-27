package com.techprimers.elastic.repository;

import com.techprimers.elastic.model.Salary;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface SalaryRespository extends ElasticsearchRepository<Salary, Integer> {
}
