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
        if (index < objects.size()) {
            return true;
        }
        return false;
    }

    @Override
    public ArticleComponent next() {
        if (this.hasNext()) {
            return objects.get(index++);
        }
        return null;
    }

}
