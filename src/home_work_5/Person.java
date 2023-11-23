package home_work_5;

public class Person {
    private String nick; // псевдоним пользователя

    private String password; // пароль пользователя с длиной от 5 до 10 символов

    private String name; // имя пользователя

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }
}
