package data.repositories;
import data.models.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository {
    private int count;
    ArrayList<Comment> comments = new ArrayList<>();


    @Override
    public Comment save(Comment comment) {
        boolean noCommentYet = comment.getId() == 0;
        if (noCommentYet) {
            comment.setId(generateUserId());
            comments.add(comment);
            count++;
        }

        return comment;
    }

    private int generateUserId() {
        return count + 1;
    }

    @Override
    public Comment findById(int id) {
        for (Comment comment: comments) {
            if (comment.getId() == id) return comment;
        }

        return null;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public List<Comment> findAll() {
        return null;
    }

    @Override
    public void delete(Comment comment) {
        for (Comment eachComment: comments) {
            if (comment == eachComment) {
                comments.remove(comment);
                count--;
                break;
            }
        }
    }


    @Override
    public void delete(int id) {
        for (Comment comment: comments) {
            if (comment.getId() == id) {
                comments.remove(comment);
                count--;
                break;
            }
        }
    }


    @Override
    public void deleteAll() {
        for (Comment comment: comments) {
            comments.remove(comment);
            break;
        }
        count = 0;

    }
}
