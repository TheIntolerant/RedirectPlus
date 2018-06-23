package nl.martenm.redirectplus.objects;

import net.md_5.bungee.api.config.ServerInfo;

/**
 * @author MartenM
 * @since 6-1-2018.
 */
public class RedirectServerWrapper {

    private ServerInfo serverInfo;
    private boolean isOnline;
    private ServerGroup serverGroup;
    private boolean redirectable;
    private int onlinePlayersCount;

    public RedirectServerWrapper(ServerInfo serverInfo){
        this(serverInfo, null, false);
    }

    public RedirectServerWrapper(ServerInfo serverInfo, ServerGroup serverGroup, boolean redirectable) {
        this.serverInfo = serverInfo;
        this.serverGroup = serverGroup;
        this.redirectable = redirectable;
    }

    public ServerInfo getServerInfo() {
        return serverInfo;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public ServerGroup getServerGroup() {
        return serverGroup;
    }

    public boolean isRedirectable() {
        return redirectable;
    }

    public int getOnlinePlayersCount() {
        return onlinePlayersCount;
    }

    public void setOnlinePlayersCount(int onlinePlayersCount) {
        this.onlinePlayersCount = onlinePlayersCount;
    }
}
