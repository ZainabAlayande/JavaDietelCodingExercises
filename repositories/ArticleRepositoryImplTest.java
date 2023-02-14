package data.repositories;

import data.models.Article;
import data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ArticleRepositoryImplTest {

    private ArticleRepository articleRepository;
    private Article article;
    private Article articleTwo;

    @BeforeEach
    public void setUp() {
        articleRepository = new ArticleRepositoryImpl();
        article = new Article();
        articleTwo = new Article();
        article.setTitle("Title");
        article.setBody("Body");
        article.setAuthorId(1);
    }

    @Test
    public void saveOneArticle_countIsOneTest() {
        articleRepository.save(article);
        assertEquals(1, articleRepository.count());
    }

    @Test public void saveOneArticle_idOfArticleIsOne(){
        Article savedArticle = articleRepository.save(article);
        assertEquals(1, savedArticle.getId());
    }

    @Test public void saveTwoArticlesWithSameId_countIsOneTest(){
        Article savedArticle = articleRepository.save(article);
        assertEquals(1, articleRepository.count());
        savedArticle.setTitle("title");
        articleRepository.save(savedArticle);
        assertEquals(1, articleRepository.count());
    }

    @Test public void saveOneArticle_findArticleByIdTest(){
        Article savedArticle = articleRepository.save(article);
        assertEquals(1, savedArticle.getId());
        Article foundArticle = articleRepository.findById(1);
        assertEquals(foundArticle, articleRepository.findById(1));
    }

    @Test public void findAllArticleTest() {
        articleRepository.save(article);
        articleRepository.save(articleTwo);
        System.out.println(articleRepository.findAll());
        assertEquals(2, articleRepository.count());
    }

    @Test public void saveOneArticle_deleteOneArticleByArticleId_countIsZeroTest(){
        articleRepository.save(article);
        assertEquals(1, articleRepository.count());
        articleRepository.delete(1);
        assertEquals(0, articleRepository.count());
    }

    @Test public void deleteAllArticles() {
        articleRepository.save(article);
        assertEquals(1, article.getId());
        articleRepository.deleteAll();
        assertEquals(0, articleRepository.count());
    }

    @Test public void saveOneArticle_deleteOneArticleByTitle_countIsZeroTest() {
        articleRepository.save(article);
        assertEquals(1, articleRepository.count());
        articleRepository.delete(article);
        assertEquals(0, articleRepository.count());
    }

}