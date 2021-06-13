package per.nonlone.hahababa.common;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class DataResult<T> {

    @Setter
    @Getter
    private T data;

    private String message;

    private String code;

    public DataResult(ResultCode resultCode,T t) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = t;
    };

    public DataResult(ResultCode resultCode){
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }
}
