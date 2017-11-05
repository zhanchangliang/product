package com.zhancl.enums;


import org.apache.commons.lang3.StringUtils;

/**
 * Created by Administrator on 2017/11/5.
 */
public enum PlateType {


     PRODUCT("product","产品"),
     NEWS("news","新闻"),
     COMPANY("company","企业介绍图片");

    private final String code;
    private final String desc;


    PlateType(String code,String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据编码获取枚举
     * @param code
     * @return
     */
    public  static PlateType getByCode(String code){
        if(StringUtils.isBlank(code)){
            return null;
        }
        for(PlateType mode:values()){
            if(StringUtils.equals(mode.getCode(),code)){
                return  mode;
            }
        }

        return null;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
