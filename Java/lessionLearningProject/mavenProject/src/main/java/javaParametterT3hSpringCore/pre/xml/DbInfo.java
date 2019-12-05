package javaParametterT3hSpringCore.pre.xml;

public class DbInfo {
    private String url;
    private String port;
    private String userName;
    private String passWord;

    public String getUrl() {
        return url;
    }


    public String getPort() {
        return port;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "DbInfo{" +
                "url='" + url + '\'' +
                ", port='" + port + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
