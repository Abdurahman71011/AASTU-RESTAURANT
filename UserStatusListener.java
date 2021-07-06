
/* this is a user status listener wether offline or online*/

public interface UserStatusListener {
    public void online(String login);
    public void offline(String login);
}
