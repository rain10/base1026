package cn.arain.common.util;

import org.springframework.stereotype.Controller;

@Controller
public class UploadFile {

//	@RequestMapping("/admin/upload")
//	@ResponseBody
//	public Content upload(final MultipartHttpServletRequest request) throws UnsupportedEncodingException {
//		
//		Content content = new Content();
//		request.setCharacterEncoding("utf-8");
//		MultipartFile uploadFile = request.getFile("file");
//		
//		String picName = uploadFile.getOriginalFilename();
//		String path = "upload/";
//		String url = request.getSession().getServletContext().getRealPath(path) + "/";
//
//		if (uploadFile != null && uploadFile.getSize() > 0) {
//
//			String newPic = IDUtil.genImageName() + picName.substring(picName.lastIndexOf("."));
//
//			File file = new File(url + newPic);
//			try {
//				uploadFile.transferTo(file);
//			} catch (Exception e) {
//				e.printStackTrace();
//			} 
//
//			 url = path + newPic;
//			 content.setUrl(url);
//			UploadResult result = new UploadResult(0, url,"成功！");
//			return content;
//
//		}
//
//		
//		return content;
//	}
}
