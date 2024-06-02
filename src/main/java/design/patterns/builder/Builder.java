package design.patterns.builder;

public class Builder {
    private int param1;
    private long param2;
    private String param3;
    private double param4;
    private float param5;
    private Builder(BuilderHelper helper){
        this.param1 = helper.param1;
        this.param2 = helper.param2;
        this.param3 = helper.param3;
        this.param4 = helper.param4;
        this.param5 = helper.param5;
    }

    public static class BuilderHelper{
        int param1;
        long param2;
        String param3;
        double param4;
        float param5;
        public BuilderHelper setParam1(int param){
            this.param1 = param;
            return this;
        }

        public BuilderHelper setParam2(long param){
            this.param2 = param;
            return this;
        }

        public BuilderHelper setParam3(String param){
            this.param3 = param;
            return this;
        }

        public BuilderHelper setParam4(double param){
            this.param4 = param;
            return this;
        }
        public BuilderHelper setParam5(float param){
            this.param5 = param;
            return this;
        }

        public Builder build(){
            return new Builder(this);
        }
    }

    public static BuilderHelper getBuilderHelper(){
        return new BuilderHelper();
    }
}
