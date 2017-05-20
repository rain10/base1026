package cn.arain.common.util;

/**
 * 文件上传工具类
 * 
 * @author Arain
 * 
 */
public class UploadResult {

	/**
	 * 上传图片返回值，成功：0 失败：1
	 */
	private Integer state;
	/**
	 * 回显图片使用的url
	 */
	private String url;
	/**
	 * 错误时的错误消息
	 */
	private String title;
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public UploadResult(Integer state, String url, String title) {
		super();
		this.state = state;
		this.url = url;
		this.title = title;
	}
	public UploadResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
