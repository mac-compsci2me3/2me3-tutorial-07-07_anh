import java.util.Iterator;
import java.util.List;

public class ArticleIterator implements Iterator {
    public List<ArticleComponent> objects;
    public int index;

    public ArticleIterator(List<ArticleComponent> a) {
        this.objects = a;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return (index < objects.size());
    }

    @Override
    public ArticleComponent next() {
        if (hasNext()) {
            return objects.get(index++);
        }
        return null;
    }

}
