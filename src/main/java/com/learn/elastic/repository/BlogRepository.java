package com.learn.elastic.repository;

import com.learn.elastic.entity.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface BlogRepository extends ElasticsearchRepository<Article, String> {

}
