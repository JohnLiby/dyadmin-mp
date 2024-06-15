package me.zhengjie.modules.uniapp.domain.vo;

import lombok.Data;
import me.zhengjie.modules.uniapp.domain.UniCustomer;

/**
 * @author Administrator
 * @version 1.0
 * @description: TODO
 * @date 2024/6/14 23:11
 */
@Data
public class UniCustomerDTO extends UniCustomer {
    /***
     *邀请人
     */
    private String username;

}
