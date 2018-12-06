package cn.shop.server1.module.vo;

import java.io.Serializable;

/**
 * @author buchengyin
 * @Date 2018/12/5 22:42
 **/
public class ServerResult implements Serializable {
    private Object data;
    private String message;
    private int code;

    public ServerResult(Object data, String message, int code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static ServerResult success(String message,Object data){
        return new ServerResult(data,message,200);
    }

    public static ServerResult success(String message){
        return success(message,null);
    }

    public static ServerResult success(Object data){
        return success("操作成功",data);
    }

    public static ServerResult success(){
        return success("操作成功");
    }

    public static ServerResult fail(String message){
        return new ServerResult(null,message,500);
    }

    public static ServerResult fail(){
        return fail("操作失败");
    }
}
