package per.nonlone.hahababa.common;

public class ResultCode {

    private String code;

    private String message;

    private ResultCode(String code,String message){
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public ResultCode SUCCESS = new ResultCode("SUCCESS","");

}
