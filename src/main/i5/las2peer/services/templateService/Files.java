package i5.las2peer.services.templateService;

import java.util.Arrays;
import java.io.Serializable;

public class Files implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String fileName;
    private String url;
    private String authorName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

}