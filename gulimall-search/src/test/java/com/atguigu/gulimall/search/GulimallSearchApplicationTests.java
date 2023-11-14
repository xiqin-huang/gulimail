package com.atguigu.gulimall.search;

import com.alibaba.fastjson.JSON;
import com.atguigu.gulimall.search.config.GulimallElasticSearchConfig;
import lombok.Data;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;
import org.elasticsearch.search.aggregations.metrics.AvgAggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * ClassName: GulimallSearchApplicationTests
 * Package: com.atguigu.gulimall.search
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/13 - 10:00
 * @Version: v1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallSearchApplicationTests {

    @Autowired
    private RestHighLevelClient client;


    @Test
    public void searchData() throws IOException {
        //1.创建检索请求
        SearchRequest searchRequest = new SearchRequest();
        //指定索引
        searchRequest.indices("bank");
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.query(QueryBuilders.matchQuery("address","mill"));

        TermsAggregationBuilder ageAgg = AggregationBuilders.terms("ageAgg").field("age").size(10);
        sourceBuilder.aggregation(ageAgg);

        AvgAggregationBuilder balanceAvg = AggregationBuilders.avg("balanceAvg").field("balance");
        sourceBuilder.aggregation(balanceAvg);

        System.out.println(sourceBuilder.toString());
        searchRequest.source(sourceBuilder);

        SearchResponse searchResponse = client.search(searchRequest, GulimallElasticSearchConfig.COMMON_OPTIONS);

        System.out.println(searchResponse.toString());
    }


    @Test
    public void indexData() throws IOException {
        IndexRequest indexRequest = new IndexRequest("users");
        indexRequest.id("1");
        //indexRequest.source("userName","zhangsan","age",18,"gender","男");
        User user = new User();
        user.setUserName("zhangsan");
        user.setAge(18);
        user.setGender("男");

        String jsonString = JSON.toJSONString(user);
        indexRequest.source(jsonString, XContentType.JSON);

        IndexResponse index = client.index(indexRequest, GulimallElasticSearchConfig.COMMON_OPTIONS);
        System.out.println(index);
    }

    @Data
    class User{
        private String userName;
        private String gender;
        private Integer age;
    }



    @Test
    public void contextLoads(){
        System.out.println(client);
    }
}
