public class WebPage implements Printable {
    public String url;
    public String title;
    public String content;

    @Override
    public String getPrintableContent() {
        String temp = "URL: + URL";
        temp += "Tittle: " + title;

        temp = content.replaceAll("<[^>]*>", "");
        return temp;
    }
}
