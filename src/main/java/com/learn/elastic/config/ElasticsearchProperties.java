package com.learn.elastic.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ElasticsearchProperties {

    @Value("${spring.elasticsearch.rest.uris}")
    private String url;

    @Value("${spring.elasticsearch.rest.connection-timeout}")
    private Integer connectTimeout;

    @Value("${spring.elasticsearch.rest.read-timeout}")
    private Integer socketTimeout;

    public String getUrl() {
        return url;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public Integer getSocketTimeout() {
        return socketTimeout;
    }
}
