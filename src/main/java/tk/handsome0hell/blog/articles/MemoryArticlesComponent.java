package tk.handsome0hell.blog.articles;

import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import tk.handsome0hell.blog.pojo.Article;

class MemoryArticlesComponent implements ArticlesComponent {
  private Map<Integer, Article> memory_articles;
  MemoryArticlesComponent() {
    memory_articles = new HashMap<Integer, Article>();
    Article test_article =
      new Article("Lorem Ipsum",
                  "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...\r\n无人爱苦，亦无人寻之欲之，乃因其苦...",
                  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas elementum nibh urna, vel maximus tellus imperdiet et. Curabitur a massa et velit dignissim varius. Sed nec malesuada ligula. Praesent eu bibendum nibh. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.  Nunc eget velit lobortis, ornare felis ut, congue purus. Sed eleifend vulputate dolor, at ultricies diam.  Phasellus at metus blandit, congue felis nec, euismod diam.\r\n Quisque semper lectus at suscipit malesuada. Nulla fermentum purus diam, scelerisque congue eros hendrerit at. Duis tristique lorem eget mi aliquet faucibus. Aenean placerat, orci ac lobortis fermentum, neque ligula vulputate odio, vitae molestie nunc sapien sed dolor. Curabitur vehicula laoreet nulla.  Morbi enim neque, ultrices quis consequat id, pretium id magna. Maecenas accumsan justo ac nisl pharetra faucibus.  Donec in ante non erat facilisis congue. Duis pretium neque sollicitudin lacinia pellentesque. Quisque rutrum eu urna quis venenatis.\r\n Aliquam pellentesque quam quis enim ornare, eget euismod risus gravida.  Vivamus ultricies facilisis dolor ac facilisis. Cras eu posuere tellus. Nam elementum imperdiet urna, a vehicula diam auctor vel. Ut et diam in ante suscipit malesuada. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Suspendisse ligula urna, fermentum non iaculis cursus, dictum molestie lorem.\r\n In semper leo nec purus maximus, in rhoncus ipsum interdum. Quisque laoreet egestas urna, a iaculis lorem. Phasellus auctor sapien lectus.  Nullam condimentum lobortis rhoncus. Phasellus sagittis nunc feugiat dapibus dictum.  Vestibulum pellentesque mattis condimentum. Cras vitae est dictum nisl consectetur fermentum. Curabitur viverra rutrum justo eget fermentum. Maecenas venenatis nibh ac purus consectetur, eget eleifend justo luctus. Donec eu iaculis libero. Vivamus augue felis, rhoncus eu sem nec, varius scelerisque diam.\r\n Aenean congue magna in pharetra ultricies. Cras nunc dolor, interdum id ipsum vel, feugiat varius nulla. Duis quis libero sit amet ante ultricies venenatis.  Sed pulvinar, nibh ac tempor viverra, magna justo sollicitudin turpis, a fringilla sapien risus sit amet ante. Donec lobortis, eros eget blandit consequat, dui ex dignissim ante, sit amet pretium lectus dolor vel mauris.  Aliquam erat volutpat. Aliquam faucibus in nulla a pulvinar. Donec ligula lectus, ultricies non nisi at, viverra posuere orci. Nullam auctor ipsum sed enim placerat, in facilisis velit vehicula. Quisque ac pharetra nibh.  Suspendisse potenti. Donec pharetra auctor tellus, sed pharetra metus porttitor vitae. Aenean pellentesque consectetur leo, non volutpat orci hendrerit non.  Donec ullamcorper porta rhoncus.", "佚名", 1555555555L);
    test_article.setId(0);
    memory_articles.put(0, test_article);
  }
  @Override
  public Article GetArticleById(Integer id) {
    return memory_articles.get(id);
  }
  @Override
  public void UpdateArticle(Article article) {
    memory_articles.get(article.getId()).CopyFrom(article);
  }
  @Override
  public List<Article> GetArticles() {
    return new LinkedList<Article>(memory_articles.values());
  }
};