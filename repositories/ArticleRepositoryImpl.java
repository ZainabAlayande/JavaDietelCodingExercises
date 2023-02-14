package data.repositories;

import data.models.Article;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepositoryImpl implements ArticleRepository {

    private int count;
    ArrayList<Article> articles = new ArrayList<>();
    @Override
    public Article save(Article article) {
        if (article.getId() == 0) {
            article.setId(generateUserId());
            articles.add(article);
            count++;
        }
        return article;

    }

    private int generateUserId() {
        return count + 1;
    }

    @Override
    public Article findById(int id) {
        for (Article article: articles) {
            if (article.getId() == id) return article;
        }
        return null;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public List<Article> findAll() {
        return articles;
    }

    @Override
    public void delete(Article article) {
        for (Article article1: articles) {
            if (article1.toString().equals(article.getTitle())) {
                articles.remove(article);
            }

        }
        count--;


    }

    @Override
    public void delete(int id) {
        articles.removeIf(article -> article.getId() == id);
        count--;
    }

    @Override
    public void deleteAll() {
        for (int i = 0; i < articles.size(); i++) {
            articles.remove(articles.get(i));
            break;
        }
        count = 0;

        }

    }

