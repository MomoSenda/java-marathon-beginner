package jp.co.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.form.NameForm;


/**
 * フォームで入力した名前を表示するコントローラ.
 * 
 * @author momo.senda
 *
 */
@Controller
@RequestMapping("/")
public class NameReceiveController {
	
	/**
	 * 入力画面を表示する.
	 * 
	 * @return 入力画面
	 */
	@RequestMapping("/")
	public String index() {
		return "inputname";
	}

	/**
	 * 名前を受け取って出力画面を表示する.
	 * @param form フォーム
	 * @param model　モデル
	 * @return　出力画面
	 */
	@RequestMapping("/toOutputName")
	public String toOutputName(NameForm form, Model model) {
		String name = form.getName();
		// モデルスコープに格納
		model.addAttribute("name", name);

		// フォワード
		return "outputname";
	}

}
