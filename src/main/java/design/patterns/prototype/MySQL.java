package design.patterns.prototype;

public class MySQL implements ProtoType<MySQL>{
    int port;
    String domain;
    String user;
    String password;
    MySQL(){

    }

    MySQL(MySQL obj){
        this.port = obj.port;
        this.domain = obj.domain;
        this.user = obj.user;
        this.password = obj.password;
    }

    @Override
    public MySQL clone() {
        return new MySQL(this);
    }
}
