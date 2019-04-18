package config.domain;

/**
 * @author shinan.chen
 * @since 2019/4/15
 */
public class TestConfigure {

    private String username;

    private String password;

    private String apiGateway;

    private String domainUri;

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

    public String getApiGateway() {
        return apiGateway;
    }

    public void setApiGateway(String apiGateway) {
        this.apiGateway = apiGateway;
    }

    public String getDomainUri() {
        return domainUri;
    }

    public void setDomainUri(String domainUri) {
        this.domainUri = domainUri;
    }

    @Override
    public String toString() {
        return "TestConfigure{" + "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", apiGateway='" + apiGateway + '\'' +
                ", domainUri='" + domainUri + '\'' +
                '}';
    }
}
