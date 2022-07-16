package com.project_news.Service;

import com.project_news.Entity.News;

import java.util.ArrayList;


public interface NewsService {
    public News saveNews(News news);

    public  ArrayList<News> getNews();

    public News getNewsById(Long newsId);
}
