package data.repositories;
import data.models.Comment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CommentRepositoryImplTest {

    private CommentRepository commentRepository;
    private Comment comment;

    @BeforeEach
    public void setUp() {
        commentRepository = new CommentRepositoryImpl();
        comment = new Comment();

    }

    @Test public void makeOneComment_countIsOneTest() {
        commentRepository.save(comment);
        assertEquals(1, commentRepository.count());
    }

    @Test public void makeOneComment_idOfCommentIsOne(){
        commentRepository.save(comment);
        assertEquals(1, comment.getId());
        assertEquals(1, commentRepository.count());
    }


    @Test public void makeTwoCommentsWithSameId_countIsOneTest(){
        Comment savedComment = commentRepository.save(comment);
        assertEquals(1, commentRepository.count());
        savedComment.setComment("savedComment");
        commentRepository.save(savedComment);
        assertEquals(1, commentRepository.count());
    }


    @Test public void saveOneComment_findCommentByIdTest(){
        Comment savedComment = commentRepository.save(comment);
        assertEquals(1, savedComment.getId());
        Comment foundComment = commentRepository.findById(1);
        assertEquals(foundComment, commentRepository.findById(1));
    }


    @Test public void saveOneComment_deleteByComment_countIsZeroTest(){
       commentRepository.save(comment);
        assertEquals(1, commentRepository.count());
        Comment foundComment = commentRepository.findById(1);
        commentRepository.delete(foundComment);
        assertEquals(0, commentRepository.count());
    }

    @Test public void saveOneComment_deleteCommentById_countIsZeroTest() {
        commentRepository.save(comment);
        assertEquals(1, commentRepository.count());
        commentRepository.delete(1);
        assertEquals(0, commentRepository.count());
    }

    @Test public void saveThreeComments_deleteAllComments() {
        commentRepository.save(comment);
        commentRepository.save(comment);
        commentRepository.save(comment);
        assertEquals(1, commentRepository.count());
        commentRepository.deleteAll();
        assertEquals(0, commentRepository.count());
    }
}