package com.learn.elastic.repository;

import com.learn.elastic.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


public interface ProductRepository extends ElasticsearchRepository<Product, String> {

}
