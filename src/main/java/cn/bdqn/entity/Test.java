package cn.bdqn.entity;

/**
 * Created by Administrator on 2018/3/12 0012.
 */
public class Test {
    public Integer id;
    private String username;
    private String password;
    private String nickname;

    private  String update;
    private String delete;
    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Test(Integer id, String username, String password, String nickname) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }
}
