        List<Article> articleList = new ArrayList<Article>();
            org.jsoup.nodes.Document doc = Jsoup.connect("http://4pda.ru").get();
                         Elements h1Elements = doc.getElementsByAttributeValue("class", "list-post-title");
        int i = 0;
        for (Element aa : h1Elements
             ) {
                Element aElement = h1Elements.select("a").get(i);

                String url = aElement.attr("href");
                String title = aElement.child(0).text();
                Article art = new Article(url, title);
                articleList.add(art);
                i++;
        };
/* Не работает
                h1Elements.forEach(h1Element->{
            Element aElement = h1Elements.child(0);
            String url = aElement.attr("href");
            String title = aElement.child(0).text();

            articleList.add(new Article(url, title));
            });
        articleList.forEach(System.out.println());
  */
