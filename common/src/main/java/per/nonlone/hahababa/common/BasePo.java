package per.nonlone.hahababa.common;

import java.time.LocalDateTime;

import lombok.Data;


@Data
public class BasePo {

    /**
     * 系统操作
     */
    public static final String BY_SYSTEM = "system";

    /**
     * 创建人
     */
    private String createBy = BY_SYSTEM;

    /**
     * 更新人
     */
    private String updateBy = BY_SYSTEM;

    /**
     * 创建时间
     */
    private LocalDateTime createTime = LocalDateTime.now();

    /**
     * 更新时间
     */
    private LocalDateTime updateTime = LocalDateTime.now();

}
