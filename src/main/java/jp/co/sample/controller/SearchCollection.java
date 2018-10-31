package jp.co.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.User;
import jp.co.sample.repository.UserReposiory;

/**
 * フォームで入力した情報を表示するコントローラ.
 * @author momo.senda
 *
 */
@Controller
@RequestMapping("/search")
public class SearchCollection {
	@Autowired
	private UserReposiory repository;
	
	/**
	 * 入力画面を表示する.
	 * 
	 * @return 入力画面
	 */
	@RequestMapping("/")
	public String index() {
		return "search/userinfosearch";
	}
	
	/**
	 * 入力情報を受け取って出力画面に表示する.
	 * 
	 * @param name　名前
	 * @param age　年齢
	 * @param address　住所
	 * @param model　モデル
	 * @return
	 */
	@RequestMapping("/toUserinfoview")
	public String toUserinfoview(Integer id,String name,Integer age,String address,Model model) {
		User user=new User();
		user.setId(id);
		user.setName(name);
		user.setAge(age);
		user.setAddress(address);
		repository.load(id);
		
		model.addAttribute("user",user);
		return "search/userinfoview";
		
	}
}
