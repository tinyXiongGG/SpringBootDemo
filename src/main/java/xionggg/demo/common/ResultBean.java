package xionggg.demo.common;

/**
 * Created by HolmeS on 2017/9/4 0004.
 */
public class ResultBean<T> {

    private int code = ResultCode.SUCCESS;
    private String msg = "success";
    private T data;

    public ResultBean(){
        super();
    }

    public ResultBean(T data){
        super();
        this.data = data;
    }

    public ResultBean(int code, String msg, T date){
        this.code = code;
        this.msg = msg;
        this.data = date;
    }

    public ResultBean(Throwable e){
        super();
        this.code = ResultCode.FAIL;
        this.msg = e.getMessage();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
