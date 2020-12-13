package dsu.software.busansubway.Select;


public class ListViewItem {

    int backcolor;
    String contents;

    public ListViewItem getContent() {
        return this;
    }


    public ListViewItem(int backcolork, String content) {
        this.contents = content;
        this.backcolor = backcolork;
    }

}
