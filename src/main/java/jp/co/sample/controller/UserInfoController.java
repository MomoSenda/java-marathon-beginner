package jp.co.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.form.User;

/**
 * フォームで入力したユーザー情報を表示するコントローラ.
 * 
 * @author momo.senda
 *
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
	/**
	 * 入力画面を表示する.
	 * 
	 * @return 入力画面
	 */
	@RequestMapping("/index")
	public String index() {
		return "userInfo/inputuserinfo";
	}
	
	/**
	 * ユーザー情報を受け取って出力画面に表示する.
	 * @param user フォール
	 * @param model　モデル
	 * @return　出力画面
	 */
	@RequestMapping("/toOutputuserInfo")
	public String toOutputuserInfo(String name,String age,String address,Model model) {
		
		User user=new User();
		user.setName(name);
		user.setAge(age);
		user.setAddress(address);
		
		model.addAttribute("user", user);
		
		return "userInfo/outputuserinfo";
	}
	
}
